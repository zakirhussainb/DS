package com.zakcorp.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) throws IOException {
        InfixToPostfix p = new InfixToPostfix();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc --> 0){
            String expr = br.readLine();
            System.out.println(p.convertInfixToPostfix(expr));
        }
    }

    private String convertInfixToPostfix(String exprStr){
        char[] chArr = exprStr.toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder pf = new StringBuilder();
        int i = 0;
        while(i < chArr.length){
            if(isOperand(chArr[i])){
                pf.append(chArr[i++]);
            } else {
                if(stack.isEmpty()){
                    stack.push(chArr[i++]);
                } else if(getPrecedence(chArr[i]) > getPrecedence(stack.peek())){
                    stack.push(chArr[i++]);
                } else {
                    pf.append(stack.pop());
                }
            }
        }
        while(!stack.isEmpty()){
            pf.append(stack.pop());
        }
        return pf.toString();
    }
    private boolean isOperand(char x){
        return x != '+' && x != '-' && x != '*' && x != '/';
    }
    private int getPrecedence(char x){
        if(x == '+' || x == '-'){
            return 1;
        } else if(x == '*' || x == '/'){
            return 2;
        }
        return 0;
    }

}

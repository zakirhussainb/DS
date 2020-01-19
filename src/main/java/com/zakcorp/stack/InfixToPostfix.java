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
//            System.out.println(p.convertInfixToPostfix(expr));
            System.out.println(p.advancedConversionInfixToPostfix(expr));
        }
    }

    private String advancedConversionInfixToPostfix(String expr) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int n = expr.length();
        int i = 0;
        while(i < n){
            if(isOperand(expr.charAt(i))){
                postfix.append(expr.charAt(i++));
            } else {
                if(st.isEmpty() || getOuterStackPre(expr.charAt(i)) > getInnerStackPre(st.peek())){
                    st.push(expr.charAt(i++));
                } else if(getOuterStackPre(expr.charAt(i)) == getInnerStackPre(st.peek())) {
                    st.pop();
                    i++;
                } else {
                    postfix.append(st.pop());
                }
            }
        }
        while(!st.isEmpty()){
            postfix.append(st.pop());
        }
        return postfix.toString();
    }

    private int getInnerStackPre(char x) {
        if(x == '+' || x == '-'){
            return 2;
        } else if(x == '*' || x == '/'){
            return 4;
        } else if(x == '^'){
            return 5;
        } else if(x == '('){
            return 0;
        } else if(x == ')'){
            return 0;
        }
        return 0;
    }

    private int getOuterStackPre(char x) {
        if(x == '+' || x == '-'){
            return 1;
        } else if(x == '*' || x == '/'){
            return 3;
        } else if(x == '^'){
            return 6;
        } else if(x == '('){
            return 7;
        } else if(x == ')'){
            return 0;
        }
        return 0;
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
                if(stack.isEmpty() || getPrecedence(chArr[i]) > getPrecedence(stack.peek())){
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
        return x != '+' && x != '-' && x != '*' && x != '/' && x != '(' && x != ')' && x != '^';
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

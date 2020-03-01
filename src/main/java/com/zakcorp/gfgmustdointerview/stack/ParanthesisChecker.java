package com.zakcorp.gfgmustdointerview.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class ParanthesisChecker {
    public static void main(String[] args) throws Exception{
        ParanthesisChecker p = new ParanthesisChecker();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String str = br.readLine();
            if(p.isBalanced(str)){
                System.out.println("balanced");
            } else {
                System.out.println("not balanced");
            }
        }
    }
    private boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();
        char[] chArr = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            if(chArr[i] == '[' || chArr[i] == '{' || chArr[i] == '('){
                stack.push(chArr[i]);
            } else if(stack.isEmpty()) {
                return false;
            } else if( (chArr[i] == ']' && stack.peek() == '[') ||
                    (chArr[i] == '}' && stack.peek() == '{') ||
                    (chArr[i] == ')' && stack.peek() == '(')){
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

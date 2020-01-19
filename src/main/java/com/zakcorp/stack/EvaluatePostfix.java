package com.zakcorp.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class EvaluatePostfix {
    public static void main(String[] args) throws IOException {
        EvaluatePostfix p = new EvaluatePostfix();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc --> 0){
            String expr = br.readLine();
            System.out.println("result..." + p.evaluate(expr));
        }

    }

    private int evaluate(String expr) {
        char[] chArr = expr.toCharArray();
        String str = "";
//        str.
        Stack<Integer> stack = new Stack<>();
        for (char ch : chArr) {
            if (isOperand(ch)) {
                stack.push(ch - '0');
            } else {
                int top0 = stack.pop();
                int top1 = stack.pop();
                switch (ch) {
                    case '*':
                        stack.push(top1 * top0);
                        break;
                    case '-':
                        stack.push(top1 - top0);
                        break;
                    case '/':
                        stack.push(top1 / top0);
                        break;
                    case '+':
                        stack.push(top1 + top0);
                        break;
                }
            }
        }
        return stack.pop();
    }

    private boolean isOperand(char x){
        return x != '+' && x != '-' && x != '*' && x != '/';
    }
}

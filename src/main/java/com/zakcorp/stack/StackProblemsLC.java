package com.zakcorp.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class StackProblemsLC {
    public static void main(String[] args) throws Exception{
        StackProblemsLC st = new StackProblemsLC();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc --> 0){
            String[] expr = br.readLine().split(",");
//            System.out.println("expr..." + Arrays.toString(expr));
            System.out.println("result..." + st.calPoints(expr));
        }
    }
    public int calPoints(String[] ops){
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(String s : ops){
            if(isOperand(s)){
                sum = sum + Integer.parseInt(s);
                stack.push(Integer.parseInt(s));
            } else {
                switch (s) {
                    case "C":
                        sum = sum - stack.pop();
                        break;
                    case "D":
                        sum = sum + (2 * stack.pop());
                        stack.push(sum);
                        break;
                    case "+":
                        sum = sum + stack.pop();
                        break;
                    default:

                }
            }
        }
        return sum;
    }
    public boolean isOperand(String s){
        return !s.equals("+") && !s.equals("C") && !s.equals("D");
    }
}

package com.zakcorp.codechef.beginner;

import java.util.*;

class ONP {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                String str = in.readString();
                out.printLine(new Solver().solve1(str));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(String str) {
            // (a+(b*c))
            StringBuilder sb = new StringBuilder();
            Stack<Character> stack = new Stack<>();
            int n = str.length();
            for(int i = 0; i < n; i++) {
                if(!Character.isLetter(str.charAt(i)) && str.charAt(i) != ')') {
                    stack.push(str.charAt(i));
                } else if(str.charAt(i) == ')') {
                    char op = stack.peek();
                    if(op != '(') {
                        op = stack.pop();
                        sb.append(op);
                    }
                    stack.pop();
                } else {
                    sb.append(str.charAt(i));
                }
            }
            return sb.toString();
        }
        public String solve1(String str) {
            StringBuilder sb = new StringBuilder();
            int n = str.length();
            int c = 0;
            char[] operatorArr = new char[n]; // array to maintain all the operators.
            for(int i = 0; i < n; i++){
                char b = str.charAt(i);
                int k = b;
                if(k >= 97 && k <= 122){ // if k is an alphabet from a to z
                    sb.append(b);
                } else if(k != 40 && k != 41) { // if k is not '(' and ')'
                    operatorArr[c++] = b;
                } else if(k == 41){ // if k is '('
                    sb.append(operatorArr[c - 1]);
                    c--;
                }
            }
            return sb.toString();
        }
    }
}


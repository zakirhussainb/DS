package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_224 {
    // TODO:- THIS IS INCOMPLETE -> NEED TO SOLVE IT -> 20-July-2022
    static Problem_150.Solver p = new Problem_150.Solver();
    static class Solver {
        public int solve1(String str) {
            // First convert the infix expression to postfix expression.
            // Then evaluate the postfix expression.
            return evalPostfix(getInfixToPostfix(str));
        }

        private List<Object> getInfixToPostfix(String str) {
            List<Object> res = new ArrayList<>();
            Stack<Character> stack = new Stack<>();
            if (str == null || str.length() == 0) return res;
            stack.add('(');                     // add ( to first
            int num = 0;
            boolean collect = false;            // collect num
            boolean checkUnary = true;          // check unary operator
            for (int i = 0; i <= str.length(); i++) {
                char c = (i != str.length()) ? str.charAt(i) : ')'; // add ) to last
                if (c == ' ') continue;
                if (checkUnary) {
                    checkUnary = false;
                    if (c == '+' || c == '-') {
                        res.add(0);
                    }
                }
                if (Character.isDigit(c)) {
                    collect = true;
                    num = num * 10 + c - '0';
                } else {
                    if (c == '(') {
                        checkUnary = true;            // check unary operator
                        stack.push(c);
                    } else {
                        if (collect) {
                            collect = false;
                            res.add(num);
                            num = 0;
                        }
                        while (!stack.isEmpty() && getPrecedence(stack.peek()) >= getPrecedence(c)) {
                            char op = stack.pop();
                            if (op == '(') break;
                            res.add(op);
                        }
                        if (c != ')') {
                            stack.push(c);
                        }
                    }
                }
            }
            return res;
        }

        private int getPrecedence(char ch) {
            if(ch == '+' || ch == '-') {
                return 1;
            } else if(ch == '*' || ch == '/') {
                return 2;
            }
            return 0;
        }

        private int evalPostfix(List<Object> list) {
            Stack<Integer> stack = new Stack<>();
            for (Object o : list) {
                if (o instanceof Integer) {
                    stack.push((int) o);
                } else {
                    char c = (char) o;
                    int b = stack.pop();
                    int a = stack.pop();
                    if (c == '+') {
                        stack.push(a + b);
                    } else if (c == '-') {
                        stack.push(a - b);
                    } else if (c == '*') {
                        stack.push(a * b);
                    } else {
                        stack.push(a / b);
                    }
                }
            }
            return stack.pop();
        }
    }
}

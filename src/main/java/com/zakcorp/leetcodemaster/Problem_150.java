package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_150 {
    static class Solver {
        // TODO:- This solution(solve1) will fail for test 4 -> please remember it and don't implement.
        /* public int solve1(String[] tokens) {
            Stack<String> stack = new Stack<>();
            int res = 0;
            for(String token : tokens) {
                if(!"+-/*".contains(token)) {
                    stack.push(token);
                } else {
                    int number2 = Integer.parseInt(stack.pop());
                    int number1 = Integer.parseInt(stack.pop());
                    switch (token) {
                        case "+":
                            res = number1 + number2;
                            break;
                        case "-":
                            res = number1 - number2;
                            break;
                        case "*":
                            res = number1 * number2;
                            break;
                        case "/":
                            res = number1 / number2;
                            break;
                    }
                    stack.push(String.valueOf(res));
                }
            }
            return res;
        }*/
        public int solve2(String[] tokens) {
            Stack<Integer> stack = new Stack<>();
            int res = 0;
            for(String token : tokens) {
                if(!"+-/*".contains(token)) {
                    stack.push(Integer.valueOf(token));
                    continue;
                }
                int number2 = stack.pop();
                int number1 = stack.pop();
                switch (token) {
                    case "+":
                        res = number1 + number2;
                        break;
                    case "-":
                        res = number1 - number2;
                        break;
                    case "*":
                        res = number1 * number2;
                        break;
                    case "/":
                        res = number1 / number2;
                        break;
                }
                stack.push(res);
            }
            return stack.pop();
        }
    }
}

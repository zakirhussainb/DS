package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_227 {
    static class Solver {
        public int solve1(String str) {
            if (str == null || str.isEmpty())
                return 0;
            int len = str.length();
            Stack<Integer> stack = new Stack<>();
            int currentNumber = 0;
            char operation = '+';
            for (int i = 0; i < len; i++) {
                char currentChar = str.charAt(i);
                if (Character.isDigit(currentChar)) {
                    currentNumber = (currentNumber * 10) + (currentChar - '0');
                }
                if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == len - 1) {
                    if (operation == '-') {
                        stack.push(-currentNumber);
                    } else if (operation == '+') {
                        stack.push(currentNumber);
                    } else if (operation == '*') {
                        stack.push(stack.pop() * currentNumber);
                    } else if (operation == '/') {
                        stack.push(stack.pop() / currentNumber);
                    }
                    operation = currentChar;
                    currentNumber = 0;
                }
            }
            int result = 0;
            while (!stack.isEmpty()) {
                result += stack.pop();
            }
            return result;
        }
    }
}

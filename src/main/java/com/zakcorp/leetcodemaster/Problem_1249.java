package com.zakcorp.leetcodemaster;

import java.util.Stack;

public class Problem_1249 {
    static class Solver {
        public String solve1(String str) {
            StringBuilder sb = new StringBuilder(str);
            Stack<Integer> stack = new Stack<>();
            for(int i = 0; i < sb.length(); i++) {
                char ch = sb.charAt(i);
                if (ch == '(') {
                    stack.push(i);
                } else if (ch == ')') {
                    if(!stack.isEmpty())
                        stack.pop();
                    else
                        sb.setCharAt(i, '*');
                }
            }
            while(!stack.isEmpty()) {
                sb.setCharAt(stack.pop(), '*');
            }
            return sb.toString().replaceAll("\\*", "");
        }
    }
}

package com.zakcorp.leetcodemaster;

import java.util.Stack;

public class Problem_1006
{
    static class Solver {
        public int solve1(int N) {
            Stack<Integer> stack = new Stack<>();
            char[] op = new char[]{ '*', '/', '+', '-' };
            stack.push(N--);
            int index = 0;
            while (N > 0) {
                if (op[index] == '*') {
                    stack.push(stack.pop() * N--);
                } else if (op[index] == '/') {
                    stack.push(stack.pop() / N--);
                } else if (op[index] == '+') {
                    stack.push(N--);
                    /* You don't need this because at the end you are going to pop the elements in the stack and sum them one-by-one  */
//                    stack.push(stack.pop() + N--);
                } else if (op[index] == '-') {
                    stack.push(-1 * (N--));
                }
                index = (index + 1) % 4;
            }
            int sum = 0;
            while (!stack.isEmpty()) {
                sum += stack.pop();
            }
            return sum;
        }
    }
}

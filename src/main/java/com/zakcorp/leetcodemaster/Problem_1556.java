package com.zakcorp.leetcodemaster;

import java.util.Stack;

/**
 * Created by Zakir Hussain B on 29/08/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_1556 {
    public String thousandSeparator(int n) {
        Stack<String> stack = new Stack<>();
        int num = n;
        while(num != 0) {
            int rem = num % 1000;
            StringBuilder sb = new StringBuilder(String.valueOf(rem));
            while(sb.length() < 3) {
                sb.append("0");
            }
            stack.push(sb.toString());
            num = num / 1000;
            if(num > 0) {
                stack.push(".");
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
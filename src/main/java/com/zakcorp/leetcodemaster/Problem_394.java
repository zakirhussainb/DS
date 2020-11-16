package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_394 {
    static class Solver {
        public String solve1(String str) {
            Queue<Character> queue = new LinkedList<>();
            for(char ch : str.toCharArray()) {
                queue.add(ch);
            }
            return helper(queue);
        }
        private String helper(Queue<Character> queue) {
            StringBuilder sb = new StringBuilder();
            int num = 0;
            while( !queue.isEmpty() ) {
                char ch = queue.poll();
                if(Character.isDigit(ch)) {
                    num = (num * 10) + ch - '0';
                } else if(ch == '[') {
                    String sub = helper(queue);
                    for(int i = 0; i < num; i++) {
                        sb.append(sub);
                    }
                    num = 0;
                } else if(ch == ']') {
                    break;
                } else {
                    sb.append(ch);
                }
            }
            return sb.toString();
        }
    }
}

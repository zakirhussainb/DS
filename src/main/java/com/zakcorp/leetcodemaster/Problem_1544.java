package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Problem_1544 {
    static class Solver {
        public String solve1(String str) {
            if(str.length() == 1) {
                return str;
            }
            int n = str.length();
            Stack<Character> stack = new Stack<>();
            stack.push(str.charAt(0));
            int i = 1;
            while(i < n) {
               if(!stack.isEmpty()) {
                   char prevChEqu = ' ';
                   if(Character.isLowerCase(stack.peek())) {
                       prevChEqu = (char) (stack.peek() - 32);
                   } else {
                       prevChEqu = (char) (stack.peek() + 32);
                   }
                   if(prevChEqu == str.charAt(i)) {
                       stack.pop();
                   } else {
                       stack.push(str.charAt(i));
                   }
               } else {
                   stack.push(str.charAt(i));
               }
               i++;
            }
            StringBuilder sb = new StringBuilder();
            while(!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            return sb.reverse().toString();
        }
        public String solve2(String str) {
            if(str.length() == 1) {
                return str;
            }
            int n = str.length();
            StringBuilder sb = new StringBuilder();
            sb.append(str.charAt(0));
            int i = 1;
            while(i < n) {
                if( sb.length() != 0 ) {
                    char top = sb.charAt(sb.length() - 1);
                    char prevChEqu = ' ';
                    if(Character.isLowerCase( top )) {
                        prevChEqu = (char) (top - 32);
                    } else {
                        prevChEqu = (char) (top + 32);
                    }
                    if(prevChEqu == str.charAt(i)) {
                        sb.deleteCharAt(sb.length() - 1);
                    } else {
                        sb.append(str.charAt(i));
                    }
                } else {
                    sb.append(str.charAt(i));
                }
                i++;
            }
            return sb.toString();
        }
    }
}

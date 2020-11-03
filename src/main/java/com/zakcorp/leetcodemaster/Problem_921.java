package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_921 {
    static class Solver {
        public int solve1(String str) {
            if(str.isEmpty()) {
                return 0;
            }
            Stack<Character> st = new  Stack<>();
            for(int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if( !st.isEmpty() ) {
                    if(ch == ')' && st.peek() == '(') {
                        st.pop();
                        continue;
                    }
                }
                st.push(ch);
            }
            return st.size();
        }
        public int solve2(String str) {
            if(str.isEmpty()) {
                return 0;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(sb.length() != 0) {
                    if(ch == ')' && sb.charAt(sb.length() - 1) == '(') {
                        sb.deleteCharAt(sb.length() - 1);
                        continue;
                    }
                }
                sb.append(ch);
            }
            return sb.length();
        }
    }
}

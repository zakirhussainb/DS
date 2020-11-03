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
    }
}

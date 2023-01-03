package com.zakcorp.leetcodemaster;

import java.util.Stack;

public class Problem_1750 {
    static class Solver {
        public int solve1(String str) {
            int n = str.length();
            int i = 0, j = n - 1;
            Stack<Character> st = new Stack<>();
            while(i < j) {
                if(!st.isEmpty()) {
                    char stCh = st.pop();
                    while (i < j && str.charAt( i ) == stCh) {
                        i++;
                    }
                    while (j > i && str.charAt( j ) == stCh) {
                        j--;
                    }
                }
                if(str.charAt( i ) == str.charAt( j )) {
                    st.push( str.charAt( i ) );
                    i++;
                    j--;
                } else {
                    break;
                }
            }
            return Math.max( j - i + 1, 0 );
        }
    }
}

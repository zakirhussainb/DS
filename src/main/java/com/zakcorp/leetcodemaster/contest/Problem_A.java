package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public int solve1(String[] words, String target, int startIndex) {
            int n = words.length;
            int ans = Integer.MAX_VALUE;
            for(int i = 0; i < n; i++) {
                if(words[i].equals( target )) {
                    int nok = Math.abs( i - startIndex );
                    int circ = 0;
                    if(i > startIndex) {
                        circ = startIndex + n - i;
                    } else {
                        circ = i + n - startIndex;
                    }
                    ans = Math.min(ans, nok);
                    ans = Math.min(ans, circ);
                }
            }
            return ans == Integer.MAX_VALUE ? -1 : ans;
        }
    }
}

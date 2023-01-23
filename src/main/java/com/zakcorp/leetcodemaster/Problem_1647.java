package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1647
{
    static class Solver {
        public int solve1(String str) {
            int[] hash = new int[26];
            for(int i = 0; i < str.length(); i++) {
                hash[str.charAt(i) - 'a']++;
            }
            Set<Integer> used = new HashSet<>();
            int res = 0;
            for(int i = 0; i < 26; i++) {
                while(hash[i] > 0 && used.contains( hash[i] )) {
                    hash[i]--;
                    res++;
                }
                if(hash[i] > 0)
                    used.add( hash[i] );
            }
            return res;
        }
    }
}

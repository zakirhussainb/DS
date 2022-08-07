package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_D {
    static class Solver {
        public int solve1(String str, int k) {
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String s = new String(chArr);
//            acfgbd, abcdfg
            int c = 0;
            for(int i = 1; i < s.length(); i++) {
                int val = (s.charAt(i) - 'a') - (s.charAt(i - 1) - 'a');
                if(val == k) {
                    c++;
                }
            }
            return c;
        }
    }
}

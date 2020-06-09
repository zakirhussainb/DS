package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_392 {
    static class Solver {
        public boolean isSubsequence(String s, String t)  {
            //s = "aec"
            //t = "abcde" o/p false
            int m = s.length(); int n = t.length();
            int i = 0, j = 0;
            while(i < m && j < n) {
                if(s.charAt(i) == t.charAt(j)) {
                    i++;
                }
                j++;
            }
            return i == m;
        }
    }
}

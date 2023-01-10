package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1461
{
    static class Solver {
        public boolean solve1(String s, int k) {
            int need = 1 << k; // The no. of distinct substrings should be exactly 2 power k
            Set<String> got = new HashSet<>();

            for (int i = k; i <= s.length(); i++) {
                String a = s.substring(i - k, i); // We need only to check all sub-strings of length k.
                if (!got.contains(a)) {
                    got.add(a);
                    need--;
                    // return true when found all occurrences
                    if (need == 0) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}

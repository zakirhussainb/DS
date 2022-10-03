package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public boolean solve1(String word) {
            int[] hash = new int[26];
            for(int i = 0; i < word.length(); i++) {
                hash[word.charAt(i) - 'a']++;
            }
            Arrays.sort(hash);
            for(int i = 1; i < hash.length; i++) {
                if(hash[i] != 0 && hash[i - 1] != 0) {
                    if (hash[i] != hash[i - 1]) {
                        if (hash[i] > hash[i - 1] + 1) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }
}

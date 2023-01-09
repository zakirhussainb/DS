package com.zakcorp.leetcodemaster.contest;

import java.util.TreeMap;

public class Problem_C {
    static class Solver {
        public boolean solve1(String word1, String word2) {
            int[] hash1 = new int[26];
            int[] hash2 = new int[26];
            for(int i = 0; i < word1.length(); i++) {
                hash1[word1.charAt( i ) - 'a']++;
            }
            for(int i = 0; i < word2.length(); i++) {
                hash2[word2.charAt( i ) - 'a']++;
            }
            for(char ch1 = 'a'; ch1 <= 'z'; ch1++)
            {
                for ( char ch2 = 'a'; ch2 <= 'z'; ch2++ )
                {
                    
                }
            }
            return false;
        }
    }
}

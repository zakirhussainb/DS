package com.zakcorp.leetcodemaster;

import java.util.Arrays;

public class Problem_1657
{
    static class Solver {
        public boolean solve1(String word1, String word2) {
            int[] hash1 = new int[26];
            for(int i = 0; i < word1.length(); i++) {
                hash1[word1.charAt( i ) - 'a']++;
            }
            int[] hash2 = new int[26];
            for(int i = 0; i < word2.length(); i++) {
                hash2[word2.charAt( i ) - 'a']++;
            }
            for(int i = 0; i < hash1.length; i++) {
                if( (hash1[i] == 0 && hash2[i] != 0) || (hash1[i] != 0 && hash2[i] == 0) ) {
                    return false;
                }
            }
            Arrays.sort(hash1);
            Arrays.sort(hash2);
            for(int i = 0; i < hash1.length; i++) {
                if(hash1[i] != hash2[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}

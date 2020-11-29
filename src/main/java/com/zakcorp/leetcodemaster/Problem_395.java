package com.zakcorp.leetcodemaster;

import java.util.*;
import java.util.stream.Collectors;

public class Problem_395 {
    static class Solver {
        // Brute Force, Good Solution But TLE for 1 <= str.length <= 10^4
        // 1. Generate all substrings and
        // 2. Check whether all the characters in the substring are repeated at least k times.
        // 3. Among all the substrings that satisfy the given condition, return the length of the
        // longest substring.
        public int solve1(String str, int k) {
            int n = str.length(), maxLen = 0;
            for(int start = 0; start < n; start++) {
                Map<Character, Integer> freqMap = new HashMap<>();
                int sum = 0;
                for(int end = start; end < n; end++) {
                    freqMap.put(str.charAt(end), freqMap.getOrDefault(str.charAt(end), 0) + 1);
                    sum = freqMap.values().stream().mapToInt(Integer::intValue).sum();
                    if(sum >= k) {
                        if(isValid(k, freqMap)) {
                            maxLen = Math.max(maxLen, end - start + 1);
                        }
                    }
                }
            }
            return maxLen;
        }
        private boolean isValid(int k, Map<Character, Integer> freqMap) {
            int totalLetters = 0, countAtleastK = 0;
            for(Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
                totalLetters++;
                if(entry.getValue() >= k)
                    countAtleastK++;
            }
            return totalLetters == countAtleastK;
        }

        public int generateAllSubstrings(String str, int k) {
            int n = str.length();
            for(int i = 0; i < n; i++) {
                for(int j = i; j < n; j++) {
                    System.out.print(str.charAt(j) + " ");
                }
                System.out.println();
            }
            return 0;
        }
    }
    static class Solver1 {
        public int solve1(String str, int k) {
            int n = str.length(), maxLen = 0;
            for(int i = 0; i < n; i++) {
                int[] freqMap = new int[26];
                for(int j = i; j < n; j++) {
                    freqMap[str.charAt(j) - 'a']++;
                    if( isValidSubstring(k, freqMap) ) {
                        maxLen = Math.max(maxLen, j - i + 1);
                    }
                }
            }
            return maxLen;
        }
        private boolean isValidSubstring(int k, int[] freqMap) {
            int countAtLeastK = 0, totalLetters = 0;
            for(int freq : freqMap) {
                if(freq > 0)
                    totalLetters++;
                if(freq >= k)
                    countAtLeastK++;
            }
            return totalLetters == countAtLeastK;
        }
    }
}

package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zakir Hussain B on 13/09/20.
 *
 * @source: LeetCode
 * @topic: Sliding Window
 * @sub-topic: Sliding Window, Two Pointers, Strings
 * @platform: LeetCode
 * @problem_link: https://leetcode.com/problems/longest-repeating-character-replacement/
 * @pseudocode:
 */
public class Problem_424 {
    static class Solver {
        public int solve1(String str, int K) {
            int n = str.length();
            int start = 0, maxRepeatLetterCount = 0, maxLength = 0;
            Map<Character, Integer> charFreqMap = new HashMap<>();
            for(int end = 0; end < n; end++) {
                char endChar = str.charAt(end);
                charFreqMap.put(endChar, charFreqMap.getOrDefault(endChar, 0) + 1);
                maxRepeatLetterCount = Math.max(maxRepeatLetterCount, charFreqMap.get(endChar));

                int charactersToChange = (end - start + 1) - maxRepeatLetterCount;
                if(charactersToChange > K) {
                    char startChar = str.charAt(start);
                    charFreqMap.put(startChar, charFreqMap.get(startChar) - 1);
                    start++;
                }
                maxLength = Math.max(maxLength, end - start + 1);
            }
            return maxLength;
        }
        public int solve2(String str, int K) {
            int n = str.length();
            int maxLength = 0, start = 0, maxRepeatLetterCount = 0;
            int[] letterFreq = new int[26];
            for(int end = 0; end < n; end++) {
                char endLetter = str.charAt(end);
                letterFreq[endLetter - 'A']++;
                maxRepeatLetterCount = Math.max(maxRepeatLetterCount, letterFreq[endLetter - 'A']);
                int lettersToChange = (end - start + 1) - maxRepeatLetterCount;
                if(lettersToChange > K) {
                    char startLetter = str.charAt(start);
                    letterFreq[startLetter - 'A']--;
                    start++;
                }
                maxLength = Math.max(maxLength, end - start + 1);
            }
            return maxLength;
        }
        public int solve3(String str, int K) {
            int n = str.length();
            int start = 0, maxLength = 0, maxRepeatLetterCount = 0;
            int[] letterFreq = new int[26];
            char[] chars = str.toCharArray();
            for(int end = 0; end < n; end++) {
                maxRepeatLetterCount = Math.max(maxRepeatLetterCount, ++letterFreq[chars[end] - 'A']);
                while(end - start + 1 - maxRepeatLetterCount > K) { // Here using while loop instead of if -> TODO:- Research Why ?
                    letterFreq[chars[start] - 'A']--;
                    start++;
                }
                maxLength = Math.max(maxLength, end - start + 1);
            }
            return maxLength;
        }
    }
}
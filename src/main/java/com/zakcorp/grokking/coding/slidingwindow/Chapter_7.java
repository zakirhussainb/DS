package com.zakcorp.grokking.coding.slidingwindow;

import java.util.*;
import java.io.*;

/**
 * Created by Zakir Hussain B on 13/09/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Chapter_7 {
    public static void main(String[] args) {
        Chapter_7 ch7 = new Chapter_7();
        System.out.println(ch7.findLength("ABAB", 2));
        System.out.println(ch7.findLength("aabccbb", 2));
        System.out.println(ch7.findLength("abbcb", 1));
        System.out.println(ch7.findLength("abccde", 1));
    }
    public int findLength(String str, int K) {
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
}
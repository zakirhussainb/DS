package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 18/09/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_567 {
    static class Solver {
        public boolean solve1(String pattern, String str) {
            Map<Character, Integer> charFreqMap = new HashMap<>();
            for(int i = 0; i < pattern.length(); i++) {
                charFreqMap.put(pattern.charAt(i), charFreqMap.getOrDefault(pattern.charAt(i), 0) + 1);
            }
            int start = 0, matched = 0;
            for(int end = 0; end < str.length(); end++) {
                char endChar = str.charAt(end);
                if(charFreqMap.containsKey(endChar)) {
                    charFreqMap.put(endChar, charFreqMap.get(endChar) - 1);
                    if(charFreqMap.get(endChar) == 0) { // character is completely matched
                        matched++;
                    }
                }
                if(matched == charFreqMap.size()){
                    return true;
                }
                if(end >= pattern.length() - 1) {
                    char startChar = str.charAt(start);
                    if(charFreqMap.containsKey(startChar)) {
                        if(charFreqMap.get(startChar) == 0) {
                            matched--;
                        }
                        charFreqMap.put(startChar, charFreqMap.get(startChar) + 1);
                    }
                    start++;
                }
            }
            return false;
        }
    }
    public boolean checkInclusion(String s1, String s2) {
        Set<String> set = new HashSet<>();
        permute(s1, 0, s1.length() - 1, set);
        for(String str : set) {
            if(s2.contains(str)) {
                return true;
            }
        }
        return false;
    }

    private void permute(String s1, int l, int r, Set<String> set) {
        if(l == r) {
            set.add(s1);
        }
        for(int i = l; i <= r; i++) {
            s1 = swap(s1, l, i);
            permute(s1, l + 1, r, set);
            s1 = swap(s1, l, i);
        }
    }

    private String swap(String s1, int l, int r) {
        char[] chArr = s1.toCharArray();
        char temp = chArr[l];
        chArr[l] = chArr[r];
        chArr[r] = temp;
        return String.valueOf(chArr);
    }
}
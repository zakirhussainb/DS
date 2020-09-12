package com.zakcorp.grokking.coding.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zakir Hussain B on 10/09/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Chapter_6 {
    public static void main(String[] args) {
        Chapter_6 ch6 = new Chapter_6();
        System.out.println(ch6.getLongestSubstringWithNonRepeatingCharacters("aabccbb"));
        System.out.println(ch6.getLongestSubstringWithNonRepeatingCharacters("abbbb"));
        System.out.println(ch6.getLongestSubstringWithNonRepeatingCharacters("abccde"));
        System.out.println(ch6.getLongestSubstringWithNonRepeatingCharacters("bbbbb"));
        System.out.println(ch6.getLongestSubstringWithNonRepeatingCharacters("b"));
    }
    private int getLongestSubstringWithNonRepeatingCharacters(String str) {
        int maxLength = 0, start = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int end = 0; end < str.length(); end++) {
            char endChar = str.charAt(end);
            if( map.containsKey(endChar) ) {
                start = Math.max(start, map.get(endChar) + 1);
            }
            map.put(endChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
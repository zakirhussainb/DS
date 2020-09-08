package com.zakcorp.grokking.coding.slidingwindow;

import java.util.*;

/**
 * Created by Zakir Hussain B on 08/09/20.
 *
 * @source: Grokking Course - Coding
 * @topic: Sliding Window Pattern
 * @sub-topic: Sliding Window Pattern
 * @platform: Grokking Course - Coding
 * @problem_link: In Local
 * @pseudocode: Normal Sliding Window
 */
public class Chapter_4 {
    public static void main(String[] args) {
        Chapter_4 ch4 = new Chapter_4();
        System.out.println(ch4.getLongestSubstring("araaci",2));
        System.out.println(ch4.getLongestSubstring("araaci",1));
        System.out.println(ch4.getLongestSubstring("cbbebi",3));
    }
    private int getLongestSubstring(String str, int K) {
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        for(int end = 0; end < str.length(); end++) {
            char endChar = str.charAt(end);
            map.put(endChar, map.getOrDefault(endChar, 0) + 1);
            while(map.size() > K) {
                char startChar = str.charAt(start);
                map.put(startChar, map.get(startChar) - 1);
                if(map.get(startChar) == 0)
                    map.remove(startChar);
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
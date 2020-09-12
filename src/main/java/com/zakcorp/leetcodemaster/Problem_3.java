package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 12/09/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_3 {
    static class Solver {
        public int solve1(String str) {
            int n = str.length();
            int start = 0, maxLength = 0;
            Map<Character, Integer> charIndexMap = new HashMap<>();
            for(int end = 0; end < n; end++){
                char endChar = str.charAt(end);
                if(charIndexMap.containsKey(endChar)) {
                    // cannot compare "start" with "end", // for test case "dvdf" -> it fails -> op:2; exp:3
                    start = Math.max(start, charIndexMap.get(endChar) + 1);
                }
                charIndexMap.put(endChar, end);
                maxLength = Math.max(maxLength, end - start + 1);
            }
            return maxLength;
        }
        public int solve2(String str) {
            int n = str.length();
            int maxLength = 0, start = 0;
            int[] index = new int[128];
            for(int end = 0; end < n; end++) {
                char endChar = str.charAt(end);
                if(index[end] != 0) {
                    start = Math.max(start, index[endChar] + 1);
                }
                maxLength = Math.max(maxLength, end - start + 1);
                index[endChar] = end;
            }
            return maxLength;
        }
    }
}
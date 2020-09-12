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
            if(str.isEmpty())
                return 0;
            int n = str.length();
            int start = 0, maxLength = 1;
            Map<Character, Integer> charIndexMap = new HashMap<>();
            for(int end = 0; end < n; end++){
                char endChar = str.charAt(end);
                if(charIndexMap.containsKey(endChar)) {
                    start = Math.max(start, charIndexMap.get(endChar) + 1);
                }
                charIndexMap.put(endChar, end);
                maxLength = Math.max(maxLength, end - start + 1);
            }
            return maxLength;
        }
    }
}
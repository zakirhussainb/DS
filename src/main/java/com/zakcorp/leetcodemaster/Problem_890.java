package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_890 {
    static class Solver {
        public List<String> solve1(String[] words, String pattern) {
            // Find the code for pattern
            String patternCode = findPatternCode(pattern);

            // Find the code for each word in the words array
            String[] process = new String[words.length];
            for(int i = 0; i < words.length; i++) {
                process[i] = findPatternCode(words[i]);
            }
            // Now match the pattern code by comparing
            List<String> result = new ArrayList<>();
            for(int i = 0; i < process.length; i++) {
                if(process[i].equals(patternCode)) {
                    result.add(words[i]);
                }
            }
            return result;
        }

        private String findPatternCode(String pattern) {
            StringBuilder sb = new StringBuilder();
            Map<Character, Integer> map = new HashMap<>();
            for(int j = 0; j < pattern.length(); j++) {
                char ch = pattern.charAt(j);
                if( !map.containsKey(ch) ) {
                    sb.append(j);
                    map.put(ch, j);
                } else {
                    sb.append(map.get(ch));
                }
            }
            return sb.toString();
        }
    }
}

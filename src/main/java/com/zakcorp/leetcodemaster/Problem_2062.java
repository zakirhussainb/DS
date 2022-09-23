package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_2062 {
    static class Solver {
        public int solve1(String word) {
            int start = 0;
            int ans = 0;
            Map<Character, Integer> map = new HashMap<>();
            for(int end = 0; end < word.length(); end++) {
                char endCh = word.charAt(end);
                if(endCh == 'a' || endCh == 'e' || endCh == 'i' || endCh == 'o' || endCh == 'u' ) {
                    if(checkIfVowelsPresent(map, endCh)) {
                        ans++;
                    }
                } else {
                    start = end;
                }
            }
            return ans;
        }
        private boolean checkIfVowelsPresent(Map<Character, Integer> map, char endCh) {
            map.put(endCh, map.getOrDefault(endCh, 0) + 1);
            return map.size() == 5;
        }
    }
}

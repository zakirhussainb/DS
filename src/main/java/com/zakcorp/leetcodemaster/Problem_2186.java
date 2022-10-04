package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_2186 {
    static class Solver {
        public int solve1(String s, String t) {
            Map<Character, Integer> map = getMapWithCharacterCount(s);
            int res = getResult(t, map);
            Map<Character, Integer> map1 = getMapWithCharacterCount(t);
            res += getResult(s, map1);
            return res;
        }
        private Map<Character, Integer> getMapWithCharacterCount(String str) {
            Map<Character, Integer> map = new HashMap<>();
            for(char ch : str.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            return map;
        }
        private int getResult(String str, Map<Character, Integer> map) {
            int res = 0;
            for(int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(map.containsKey(ch)) {
                    map.put(ch, map.get(ch) - 1);
                    map.remove(ch, 0);
                } else {
                    res++;
                }
            }
            return res;
        }
    }
}

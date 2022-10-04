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

    /*
    More efficient solution, the trick here is that we are using Math.abs(), so even if you subtract the value in the
    second for loop, and you get a negative value, that will not have an effect, since you are only taking the absolute value.
     */
    static class Solver1 {
        public int solve1(String s, String t) {
            int[] counter = new int[26];

            for(int i = 0; i < s.length(); i++) {
                counter[s.charAt(i) - 'a']++;
            }

            for(int i = 0; i < t.length(); i++) {
                counter[t.charAt(i) - 'a']--;
            }

            int minSteps = 0;
            for(int cnt : counter) {
                minSteps += Math.abs(cnt);
            }
            return minSteps;
        }
    }
}

package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_76 {
    static class Solver {
        public String solve1(String s, String t) {
            if(s.length() < t.length())
                return "";
            if(s.equals(t))
                return s;
            Map<Character, Integer> countTMap = new HashMap<>();
            for(char ch : t.toCharArray())
                countTMap.put(ch, countTMap.getOrDefault(ch, 0) + 1);

            Map<Character, Integer> window = new HashMap<>(); // map to track the string, s
            int have = 0, need = countTMap.size();
            int[] boundary = {-1, -1};
            int minLength = Integer.MAX_VALUE;
            int start = 0;
            for(int end = 0; end < s.length(); end++) {
                char endCh = s.charAt(end);
                window.put(endCh, window.getOrDefault(endCh, 0) + 1);
                if(countTMap.containsKey(endCh) && window.get(endCh).intValue() == countTMap.get(endCh).intValue()) {
                    have++;
                }
                while(have == need) {
                    if(end - start + 1 < minLength) {
                        boundary[0] = start;
                        boundary[1] = end;
                        minLength = end - start + 1;
                    }
                    char startCh = s.charAt(start);
                    window.put(startCh, window.get(startCh) - 1);
                    if(countTMap.containsKey(startCh) && window.get(startCh) < countTMap.get(startCh)) {
                        have--;
                    }
                    start++;
                }
            }
            return minLength == Integer.MAX_VALUE ? "" : s.substring(boundary[0], boundary[1] + 1);
        }
    }
}

package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_791 {
    static class Solver {
        public String solve1(String order, String str) {
            Map<Character, Integer> strMap = new HashMap<>();
            for(char ch : str.toCharArray()) {
                strMap.put(ch, strMap.getOrDefault(ch, 0) + 1);
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < order.length(); i++) {
                char key = order.charAt(i);
                if(strMap.containsKey(key)) {
                    int val = strMap.get(key);
                    while(val --> 0) {
                        sb.append(key);
                    }
                    strMap.remove(key);
                }
            }
            strMap.forEach((k, v) -> {
                while(v --> 0) {
                    sb.append(k);
                }
            });
            return sb.toString();
        }
    }
}

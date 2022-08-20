package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1410 {
    static class Solver {
        private static Map<String, String> map;
        public Solver() {
            map = new HashMap<>();
            map.put("&quot;", "\"");
            map.put("&apos;", "'");
            map.put("&amp;", "&");
            map.put("&gt;", ">");
            map.put("&lt;", "<");
            map.put("&frasl;", "/");
        }
        public String solve1(String text) {
            int n = text.length();
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while(i < n) {
                if(text.charAt(i) == '&') {
                    int endIndex = text.indexOf(";", i) + 1;
                    if(endIndex > 0) {
                        String word = text.substring(i, endIndex);
                        if(map.containsKey(word)) {
                            sb.append(map.get(word));
                            i = endIndex;
                        } else {
                            sb.append(text.charAt(i));
                            i++;
                        }
                    } else {
                        sb.append(text.charAt(i));
                        i++;
                    }
                } else {
                    sb.append(text.charAt(i));
                    i++;
                }
            }
            return sb.toString();
        }
    }
}

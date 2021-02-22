package com.zakcorp.final450.string;

import java.util.*;

public class P_88 {
    static class Solver {
        public boolean solve1(String str1, String str2) {
            String norm1 = normalize(str1);
            String norm2 = normalize(str2);
            return norm1.equals(norm2);
        }

        private String normalize(String str) {
            int n = str.length();
            Map<Character, Integer> map = new HashMap<>();
            map.put(str.charAt(0), 1);
            StringBuilder sb = new StringBuilder();
            sb.append("1");
            for(int i = 1; i < n; i++) {
                if ( !map.containsKey( str.charAt(i) ) ) {
                    map.put(str.charAt(i), i + 1);
                }
                sb.append( map.get( str.charAt(i) ) );
            }
            return sb.toString();
        }
    }
}

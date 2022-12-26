package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1807
{
    static class Solver {
        public String solve1(String s, List<List<String>> knowledge) {
            Map<String, String> map = new HashMap<>();
            for(List<String> k : knowledge) {
                map.put(k.get( 0 ), k.get( 1 ));
            }
            int i = 0;
            int n = s.length();
            StringBuilder sb = new StringBuilder();
            while(i < n) {
                if(s.charAt( i ) == '(') {
                    i += 1;
                    StringBuilder s1 = new StringBuilder();
                    while(s.charAt( i ) != ')') {
                        s1.append( s.charAt( i ) );
                        i++;
                    }
                    sb.append( map.getOrDefault( s1.toString(), "?" ) );
                } else {
                    sb.append( s.charAt( i ) );
                }
                i++;
            }
            return sb.toString();
        }
    }
}

package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1807
{
    static class Solver {
        public String solve1(String s, List<List<String>> knowledge) {
            Map<String, String> map = constructKnowledgeMap(knowledge);
            int i = 0;
            int n = s.length();
            StringBuilder sb = new StringBuilder();
            while(i < n) {
                if(s.charAt( i ) == '(') {
                    i += 1;
                    StringBuilder sm = new StringBuilder();
                    while(s.charAt( i ) != ')') {
                        sm.append( s.charAt( i ) );
                        i++;
                    }
                    sb.append( map.getOrDefault( sm.toString(), "?" ) );
                } else {
                    sb.append( s.charAt( i ) );
                }
                i++;
            }
            return sb.toString();
        }

        private Map<String, String> constructKnowledgeMap( List<List<String>> knowledge ) {
            Map<String, String> map = new HashMap<>();
            for(List<String> k : knowledge) {
                map.put(k.get( 0 ), k.get( 1 ));
            }
            return map;
        }
    }
}

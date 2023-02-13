package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1023
{
    static class Solver {
        /*
        For each string, match it with the pattern and pass the result.

        The match process uses i for query pointer and j for pattern pointer, each iteration;

        1. If current char query[i] matches pattern[j], increase pattern pointer;
        2. if does not match and query[i] is lowercase, keep going;
        3. if does not match and query[i] is capitalized, we should return false.
        4. If this pattern matches, j should equal length of pattern at the end.

        Hope this helps.
         */
        public List<Boolean> solve1(String[] queries, String pattern) {
            List<Boolean> list = new ArrayList<>();
            for(String query : queries) {
                if(checkQueryAndPattern(query, pattern)) {
                    list.add(true);
                } else {
                    list.add(false);
                }
            }
            return list;
        }

        private boolean checkQueryAndPattern(String query, String pattern) {
            int i = 0, j = 0;
            while(i < query.length()) {
                if(j < pattern.length() && query.charAt( i ) == pattern.charAt( j )) {
                    j++;
                } else {
                    if(Character.isUpperCase( query.charAt( i ) )) {
                        return false;
                    }
                }
                i++;
            }
            return j == pattern.length();
        }
    }
}

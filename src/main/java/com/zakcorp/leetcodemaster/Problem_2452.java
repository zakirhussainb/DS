package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_2452
{
    static class Solver {
        public List<String> solve1(String[] queries, String[] dictionary) {
            List<String> res = new ArrayList<>();
            for ( int i = 0; i < queries.length; i++ ) {
                for ( String dict : dictionary ) {
                    int c = 0;
                    for ( int k = 0; k < queries[i].length(); k++ ) {
                        if ( queries[i].charAt( k ) != dict.charAt( k ) ) {
                            c++;
                        }
                    }
                    if ( c <= 2 ) {
                        res.add( queries[i] );
                        break;
                    }
                }
            }
            return res;
        }
    }
}

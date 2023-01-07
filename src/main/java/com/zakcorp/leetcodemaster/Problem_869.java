package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_869
{
    static class Solver {
        public boolean solve1(int n) {
            Set<String> set = new HashSet<>();
            String s = sortDigitsInsideNum( n );
            for(int i = 0; i <= 30; i++) {
                int num = (int)Math.pow( 2, i );
                set.add( sortDigitsInsideNum(num) );
                if(set.contains( s )) {
                    return true;
                }
            }
            return false;
        }
        private String sortDigitsInsideNum(int num) {
            String s = Integer.toString( num );
            char[] chArr = s.toCharArray();
            Arrays.sort(chArr);
            s = String.valueOf( chArr );
            return s;
        }
    }
}

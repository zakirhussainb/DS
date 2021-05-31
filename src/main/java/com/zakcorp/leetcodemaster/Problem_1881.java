package com.zakcorp.leetcodemaster;

public class Problem_1881 {
    static class Solver {
        public String solve1(String str, int x) {
            boolean isNegative = false;
            if(str.charAt(0) == '-') {
                isNegative = true;
                str = str.substring(1);
            }
            int n = str.length();
            for(int i = 0; i < n; i++) {
                int current = str.charAt(i) - '0';
                if( !isNegative && current < x || isNegative && current > x) {
                    return ( isNegative ? "-" : "" ) + str.substring(0, i) + x + str.substring(i);
                }
            }
            return ( isNegative ? "-" : "" ) + str + x;
        }
    }
}

package com.zakcorp.leetcodemaster.contest;

public class Problem_A {
    static class Solver {
        public long solve1(int[] arr) {
            int n = arr.length;
            int l = 0, h = n - 1;
            long sum = 0;
            while(l <= h) {
                String s;
                if( l == h) {
                    s = "" + arr[ l ];
                } else {
                    s = arr[ l ] + "" + arr[ h ];
                }
                sum += Integer.parseInt( s );
                l++;
                h--;
            }
            return sum;
        }
    }
}

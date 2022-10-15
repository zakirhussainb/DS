package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_B {
    static class Solver {
        public int[] productQueries(int n, int[][] queries) {
            long mod = 1000_000_007;
            var list = powerOfTwoGeneral(n);
            int[] res = new int[queries.length];
            int z = 0;
            for(int[] query: queries) {
                var start = query[0];
                var end = query[1];
                long prod = 1;
                for(int i = start; i <= end; i++) {
                    prod = (prod * list.get(i)) % mod;
                }
                res[z++] = (int)prod;
            }
            return res;
        }
        public static List<Integer> powerOfTwoGeneral(int n) {
            var list = new ArrayList<Integer>();
            String str = Integer.toBinaryString(n);
            int i = 0;
            for(int m = str.length() - 1; m >= 0; m--) {
                int z = (str.charAt(m) - '0');
                int val = (int)(Math.pow(2, i));
                val = val * z;
                if(val > 0) {
                    list.add(val);
                }
                i++;
            }
            return list;
        }
    }
}

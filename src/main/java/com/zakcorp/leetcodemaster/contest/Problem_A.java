package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public int[] solve1(int[] arr) {
            List<List<Integer>> list = new ArrayList<>();
            int n = arr.length;
            for(int i = 0; i < n; i++) {
                int num = arr[i];
                List<Integer> ls = new ArrayList<>();
                while(num > 0) {
                    ls.add( 0, num % 10 );
                    num = num / 10;
                }
                list.add(ls);
            }
            List<Integer> resL = new ArrayList<>();
            for ( List<Integer> integers : list ) {
                resL.addAll( integers );
            }
            int[] res = new int[resL.size()];
            for(int i = 0; i < res.length; i++) {
                res[i] = resL.get( i );
            }
            return res;
        }
    }
}

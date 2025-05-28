package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_3424 {
    static class Solver {
        public long solve1(int[] arr, int[] brr, long k) {
            // We have two scenarios

            // Arrays are already sorted - don't consider k
            long ans1 = 0;
            for(int i = 0; i < arr.length; i++) {
                ans1 += Math.abs(arr[i] - brr[i]);
            }

            // Arrays are not sorted - consider k
            Arrays.sort(arr);
            Arrays.sort(brr);

            long ans2 = 0;
            for(int i = 0; i < arr.length; i++) {
                ans2 += Math.abs(arr[i] - brr[i]);
            }
            ans2 += k;
            return Math.min(ans1, ans2);
        }
    }
}

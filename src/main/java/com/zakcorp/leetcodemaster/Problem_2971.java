package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_2971 {
    static class Solver {
        public long solve1(int[] arr) {
            Arrays.sort(arr);
            int n = arr.length;
            long ts = 0;
            for (int num : arr) {
                ts += num;
            }
            for(int i = n - 1; i >= 0; i--) {
                long diff = ts - arr[i];
                if(arr[i] < diff) {
                    return ts;
                } else {
                    ts = diff;
                }
            }
            return -1;
        }
        public long solve2(int[] arr) {
            Arrays.sort(arr);
            long ts = 0;
            long ans = -1;
            for (int num : arr) {
                if(num < ts) {
                    ans = num + ts;
                }
                ts += num;
            }
            return ans;
        }
    }
}

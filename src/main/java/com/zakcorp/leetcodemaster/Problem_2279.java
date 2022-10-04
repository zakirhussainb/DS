package com.zakcorp.leetcodemaster;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_2279 {
    static class Solver {
        public int solve1(int[] capacity, int[] rocks, int additionalRocks) {
            int n = capacity.length;
            int[] arr = new int[n];
            long totalRocksNeeded = 0;
            for(int i = 0; i < n; i++) {
                arr[i] = capacity[i] - rocks[i];
                totalRocksNeeded += arr[i];
            }
            if(additionalRocks > totalRocksNeeded){
                return n;
            }
            Arrays.sort(arr);
            int res = 0;
            for(int i = 0; i < arr.length; i++) {
                if(additionalRocks >= arr[i]) {
                    additionalRocks -= arr[i];
                    res++;
                } else {
                    break;
                }
            }
            return res;
        }
    }
}

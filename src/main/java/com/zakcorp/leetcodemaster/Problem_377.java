package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_377 {
    static class Solver1 {
        private int counter = 0;
        public int solve1(int[] arr, int target) {
            int[] memo = new int[1001];
            comb(arr, target, memo);
            return counter;
        }
        private int comb(int[] arr, int target, int[] memo) {
            if(target < 0)
                return -1;
            if(target == 0) {
                return 1;
            }
            if(memo[target] != 0) {
                return memo[target];
            }
            for(int num : arr) {
                int diff = target - num;
                int res = comb(arr, diff, memo);
                if( res != -1 ) {
                    memo[num] += res;
                    counter += res;
                }
            }
            return -1;
        }
    }
}

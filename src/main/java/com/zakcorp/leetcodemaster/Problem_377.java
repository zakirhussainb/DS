package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_377 {
    // TLE for large inputs
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
    // Use a HashMap instead of an memo[] arr, because this is more efficient
    static class Solver2 {
        private HashMap<Integer, Integer> memo;
        public int solve1(int[] arr, int target) {
            memo = new HashMap<>();
            return comb(arr, target);
        }
        private int comb(int[] arr, int target) {
            if(target == 0) {
                return 1;
            }
            if (memo.containsKey(target))
                return memo.get(target);

            int result = 0;
            for(int num : arr) {
                int diff = target - num;
                if(diff >= 0) {
                    result += comb(arr, diff);
                }
            }
            memo.put(target, result);
            return result;
        }
    }
}

package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1711 {
    // Good Brute Force Solution, Got TLE, since the arr size is 10 ^ 5;
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            int ways = 0;
            int mod = 1000000007;
            for(int i = 0; i < n; i++) {
                for(int j = i + 1; j < n; j++) {
                    int sum = arr[i] + arr[j];
                    if(isPowerOfTwo(sum)) {
                        ways = (ways + 1) % mod;
                    }
                }
            }
            return ways;
        }
        private boolean isPowerOfTwo(int n) {
            if(n <= 0) {
                return false;
            }
            return (n & (n - 1)) == 0;
        }
    }
    // Good O(22 * N), since 22 is a constant, we can say, O(N).
    // Why 22 or Why 32 ? -> since the integer maximum range is 2 power 32. The approach is similar to Two Sum.
    static class Solver1 {
        public int solve1(int[] arr) {
            int mod = 1000000007;
            Map<Integer, Integer> map = new HashMap<>();
            int res = 0;
            for (int num : arr) {
                int power = 1;
                for (int j = 0; j < 22; j++) {
                    int diff = power - num;
                    if (map.containsKey(diff)) {
                        res += map.get(diff);
                        res %= mod;
                    }
                    power *= 2;
                }
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            return res;
        }
    }
}

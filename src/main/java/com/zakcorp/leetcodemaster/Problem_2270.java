package com.zakcorp.leetcodemaster;

public class Problem_2270 {
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            long sum = 0;
            for(int num : arr)
                sum += num;
            long currSum = 0;
            int ans = 0;
            for(int i = 0; i < n - 1; i++) {
                currSum += arr[i];
                if(currSum >= sum - currSum) {
                    ans++;
                }
            }
            return ans;
        }
    }
}

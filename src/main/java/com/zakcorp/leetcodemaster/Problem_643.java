package com.zakcorp.leetcodemaster;

public class Problem_643 {
    static class Solver {
        public double solve1(int[] arr, int k) {
            double avg = -10000;
            int n = arr.length;
            for(int i = 0, j = k; i < n && j <= n; i++, j++) {
                int m = i;
                int sum = 0;
                while(m < j) {
                    sum = sum + arr[m];
                    m++;
                }
                avg = Math.max(avg, (double)sum / k);
            }
            return avg;
        }
        public double solve2(int[] arr, int k) {
            double sum = 0;
            for(int i = 0; i < k; i++) {
                sum += arr[i];
            }
            double res = sum;
            for(int m = k; m < arr.length; m++) {
                sum += arr[m] - arr[m - k];
                res = Math.max(res, sum);
            }
            return res/k;
        }
    }
}

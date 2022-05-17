package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public int solve1(int val, int k) {
            String str = String.valueOf(val);
            int n = str.length();
            int start = 0;
            int c = 1, count = 0;
            for (int end = 0; end < n; end++) {
                if (end + 1 < n) {
                    c++;
                    if (c >= k) {
                        String s = str.substring(start, end + 1 + 1);
                        if(isDivisor(Integer.parseInt(s), val)) {
                            count++;
                        }
                        start = end + 1;
                        c = 1;
                    }
                } else {
                    start = end + 1;
                    c = 1;
                }
            }
            return count;
        }
        private boolean isDivisor(int num, int div) {
            if(num <= 0) {
                return false;
            }
            return div % num == 0;
        }
        public int solve2(int val, int k) {
            String str = String.valueOf(val);
            int n = str.length();
            int count = 0;
            for(int i = 0; i < n; i++) {
                if(i + k <= n) {
                    String s = str.substring(i, i + k);
                    if(isDivisor(Integer.parseInt(s), val)) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}

/*
double[] result = new double[K];
            int n = arr.length;
            int sum = 0;
            int start = 0;
            for(int end = 0; end < n; end++) { // O(N)
                sum = sum + arr[end];
                if(end >= K - 1) {
                    result[start] = (double) sum / K;
                    sum = sum - arr[start];
                    start++;
                }
            }
            return result;
 */

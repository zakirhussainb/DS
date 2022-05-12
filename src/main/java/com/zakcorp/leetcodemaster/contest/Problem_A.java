package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public String solve1(String str) {
            int n = str.length();
            int val = Integer.MIN_VALUE;
            int start = 0;
            int c = 1;
            for(int end = 0; end < n; end++) {
                if (end + 1 < n && str.charAt(end) == str.charAt(end + 1)) {
                    c++;
                    if(c >= 3) {
                        String s = str.substring(start, end + 1 + 1);
                        val = Math.max(val, Integer.parseInt(s));
                        start = end + 1;
                        c = 1;
                    }
                } else {
                    start = end + 1;
                    c = 1;
                }
            }
            if(val == 0)
                return "000";
            else if(val == Integer.MIN_VALUE)
                return "";
            else
                return String.valueOf(val);
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

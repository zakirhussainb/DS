package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1551 {
    static class Solver {
        // TLE on large inputs like, 9841
        public int solve1(int n) {
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = (2 * i) + 1;
            }
            int i = 0, j = n - 1;
            int op = 0;
            while(i < j) {
                if(arr[i] == arr[j]) {
                    i++;
                    j--;
                } else {
                    arr[i] += 1;
                    arr[j] -= 1;
                    op++;
                }
            }
            return op;
        }
        /*
        The minimum number of operations is a sum
        (n - 1) + (n - 3) + (n - 5) + ... + 1 (or 0)
        Let's first compute this sum using a brute force approach.
         */
        public int solve2(int n) {
            int res = 0;
            // compute the sum:
            // (n - 1) + (n - 3) + (n - 5) + ... + 1 (or 0)
            while (n > 0) {
                res += n - 1;
                n -= 2;
            }
            return res;
        }
    }
}

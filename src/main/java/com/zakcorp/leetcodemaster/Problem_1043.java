package com.zakcorp.leetcodemaster;

import java.util.Arrays;

/**
 * Created by Zakir Hussain B on 29/08/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_1043 {
    static class Solver {
        public int maxSumAfterPartitioning(int[] arr, int K) {
            int n = arr.length;
            Arrays.sort(arr); // Time O(N log N)
            int[] res = new int[n]; // Space (N)
            int pos = 0;
            for(int i = n - 1; i >= 0 && pos < n;  i--) { // O(N)
                int m = K;
                while(m --> 0 && pos < n) { // O(K)
                    res[pos++] = arr[i];
                }
            } // O(N + K)
            int sum = 0;
            for (int num : res) { // O(N)
                sum += num;
            }
            return sum;
            // O(N log N) + O(N + K) + O(N) => O(N log N) + O(N)
        }
    }
}
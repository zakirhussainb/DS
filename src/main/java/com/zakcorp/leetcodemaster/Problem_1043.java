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
            Arrays.sort(arr);
            int[] res = new int[arr.length];
            int pos = 0;
            for(int i = arr.length - 1; i >= 0; i--) {
                if(pos < res.length) {
                    int m = K;
                    while(m --> 0) {
                        res[pos++] = arr[i];
                    }
                }
            }
            int sum = 0;
            for (int num : res) {
                sum += num;
            }
            return sum;
        }
    }
}
package com.zakcorp.leetcodemaster;

/**
 * Created by Zakir Hussain B on 14/09/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_485 {
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            int i = 0, maxOnes = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j] && arr[j] == 1) {
                    maxOnes = Math.max(maxOnes, j - i + 1);
                } else {
                    i = j;
                }
            }
            return maxOnes;
        }
    }
}
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
            boolean singleOne = false;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j] && arr[j] == 1) {
                    maxOnes = Math.max(maxOnes, j - i + 1);
                } else if( arr[i] != arr[j] && (arr[i] == 1 || arr[j] == 1) ) {
                    singleOne = true;
                    i = j;
                } else {
                    i = j;
                }
            }
            if(maxOnes == 0 && singleOne) {
                return 1;
            }
            return maxOnes;
        }
        public int solve2(int[] arr) { // More efficient way and easily understandable too
            int countOnes = 0, maxOnes = 0;
            for (int num : arr) {
                if (num == 1) {
                    maxOnes = Math.max(maxOnes, ++countOnes);
                } else {
                    countOnes = 0;
                }
            }
            return maxOnes;
        }
    }
}
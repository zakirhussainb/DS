package com.zakcorp.leetcodemaster;

/**
 * Created by Zakir Hussain B on 02/10/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_75 {
    static class Solver {
        public int[] solve1(int[] arr) {
            int[] counter = new int[3];
            for (int num : arr) {
                counter[num]++;
            }
            int[] k = {0};
            sortArray(arr, counter[0], 0, k);
            sortArray(arr, counter[1], 1, k);
            sortArray(arr, counter[2], 2, k);
            return arr;
        }
        private void sortArray(int[] arr, int count, int num, int[] k) {
            while(count --> 0) {
                arr[k[0]++] = num;
            }
        }
    }
}
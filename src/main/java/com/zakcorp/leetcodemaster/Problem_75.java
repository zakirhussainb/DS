package com.zakcorp.leetcodemaster;

/**
 * Created by Zakir Hussain B on 02/10/20.
 *
 * @source: LeetCode
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
        public int[] solve2(int[] arr) {
            int n = arr.length;
            if(n == 1)
                return arr;
            int low = 0, high = n - 1;
            for(int i = 0; i <= high;) {
                if(arr[i] == 0) {
                    swap(arr, i, low);
                    i++; low++;
                } else if(arr[i] == 1) {
                    i++;
                } else {
                    swap(arr, i, high);
                    high--;
                }
            }
            return arr;
        }
        private void swap(int[] arr, int x, int y) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
    }
}
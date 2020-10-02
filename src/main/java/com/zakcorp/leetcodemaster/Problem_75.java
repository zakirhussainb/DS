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
            int i = 0, j = n - 1;
            while(i < j) {
                if(arr[i] > arr[j] || arr[i] > arr[i + 1]) {
                    if(arr[i] > arr[j]) {
                        swap(arr, i, j);
                    }
                    if(arr[i] > arr[i + 1]) {
                        swap(arr, i, i+1);
                    } else {
                        i++;
                    }
                } else {
                    i++;
                    j--;
                }
            }
            i = 0;
            while(i < n) {
                if(i != n - 1 && arr[i] > arr[i + 1]) {
                    swap(arr, i, i+1);
                }
                i++;
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
package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1968
{
    static class Solver {
        public int[] solve1(int[] arr) {
            Arrays.sort(arr);
            for(int i = 0; i < arr.length - 1; i+=2) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            return arr;
        }
        //Approach-2 (O(n) without sorting)
        /*
          There is a very simple approach to it as well.
          - Scan from left to right and fix the invalid triplets by swapping
          - Scan from right to left and fix the invalid triplets by swapping

          Note : If you only do the first scanning and expect it to be a valid result, it's not. It is not guaranteed.
                Unfortunately the test cases are weak and only 1 test case fails if you do first scanning only
                (i.e you will get 219 / 220 test cases passed.)
                Example : {0, 1, 2, 3, 4, 5} -> Only doing 1st scan will fail here (See the image at the bottom to see dry run)
        */
        public int[] solve2(int[] arr) {
            int n = arr.length;
            for(int i = 1; i < n - 1; i++) {
                if(arr[i] * 2 == arr[i - 1] + arr[i + 1])
                    swap(i, i + 1, arr);
            }
            for(int i = n - 2; i > 0; i--) {
                if(arr[i] * 2 == arr[i - 1] + arr[i + 1])
                    swap(i, i - 1, arr);
            }
            return arr;
        }
        private void swap(int x, int y, int[] arr) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
    }
}

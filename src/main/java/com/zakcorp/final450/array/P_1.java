package com.zakcorp.final450.array;

import java.util.*;

/* Reverse the array */
public class P_1 {
    static class Solver {
        public int[] solve1(int[] arr) {
            int n = arr.length;
            int left = 0, high = n - 1;
            while(left <= high) {
                int temp = arr[left];
                arr[left] = arr[high];
                arr[high] = temp;
                left++;
                high--;
            }
            return arr;
        }
    }
}

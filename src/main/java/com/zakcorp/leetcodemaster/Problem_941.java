package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_941 {
    static class Solver {
        public boolean validMountainArray(int[] arr) {
            int n = arr.length;
            int i = 0;

            // Increasing or Walking up the mountain
            while(i + 1 < n && arr[i] < arr[i + 1]) {
                i++;
            }

            if(i == 0 || i == n - 1) { // Since peak element cannot be the first element or the last element.
                return false;
            }

            // Decreasing or Walking down the mountain
            while(i + 1 < n && arr[i] > arr[i + 1]) {
                i++;
            }

            return i == n - 1;
        }
    }
}

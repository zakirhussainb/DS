package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            Arrays.sort(arr);
            int[] cZ = {0};
            if(isAlreadyArrayZeroes(arr, n)) {
                return 0;
            }
            recursive(arr, cZ, n);
            return cZ[0];
        }
        private void recursive(int[] arr, int[] cZ, int n) {
            int sE = arr[0];
            for(int i = 1; i < n; i++) {
                if(arr[i] != 0) {
                    sE = arr[i];
                    break;
                }
            }
            for(int i = 0; i < n; i++) {
                if (arr[i] != 0) {
                    arr[i] = arr[i] - sE;
                }
            }
            int countZeroes = 0;
            for(int i = 0; i < n; i++) {
                if(arr[i] == 0) {
                    countZeroes++;
                } else {
                    break;
                }
            }
            cZ[0] = cZ[0] + 1;
            if(countZeroes != n) {
                recursive(arr, cZ, n);
            }
        }
        private boolean isAlreadyArrayZeroes(int[] arr, int n) {
            int countZeroes = 0;
            for(int i = 0; i < n; i++) {
                if(arr[i] == 0) {
                    countZeroes++;
                } else {
                    break;
                }
            }
            return countZeroes == n;
        }
    }
}

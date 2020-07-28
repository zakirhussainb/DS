package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1089 {
    static class Solver {
        public int[] solve1(int[] arr) {
            int n = arr.length;
            int m = n - 1;
            int i = 0, j = 1;
            while(i < n) {
                if(arr[i] == 0) {
                    while(m > j) {
                        arr[m] = arr[m - 1];
                        m--;
                    }
                    arr[m] = 0;
                    i = i + 2;
                    j = i + 1;
                    m = n - 1;
                } else {
                    i = j;
                    j++;
                }
            }
            return arr;
        }
        public int[] solve2(int[] arr) {
            int n = arr.length;
            for(int i = 0; i < n; i++) {
                if(arr[i] == 0) {
                    for(int j = n - 1; j > i; j--) {
                        arr[j] = arr[ j - 1];
                    }
                    i++;
                }
            }
            return arr;
        }
    }
}

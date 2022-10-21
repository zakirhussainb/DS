package com.zakcorp.leetcodemaster;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_1471 {
    static class Solver {
        public int[] solve1(int[] arr, int k) {
            if(arr.length == 1)
                return arr;
            Arrays.sort(arr);
            int[] res = new int[k];
            int n = arr.length;
            int median = arr[(n - 1) / 2];
            int i = 0, j = n - 1;
            int p = 0;
            while(i <= j && p < k) {
                int start = Math.abs(arr[i] - median);
                int end = Math.abs(arr[j] - median);
                if(start > end) {
                    res[p++] = arr[i];
                    i++;
                } else if(start < end) {
                    res[p++] = arr[j];
                    j--;
                } else {
                    if(arr[i] > arr[j]) {
                        res[p++] = arr[i];
                        i++;
                    } else {
                        res[p++] = arr[j];
                        j--;
                    }
                }
            }
            return res;
        }
    }
}

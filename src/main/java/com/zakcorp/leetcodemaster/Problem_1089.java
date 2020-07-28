package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1089 {
    public int[] duplicateZeros(int[] arr) {
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
}

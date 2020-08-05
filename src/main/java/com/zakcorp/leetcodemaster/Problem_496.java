package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_496 {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] result = new int[m];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr2[j] > arr2[i]) {
                    map.put(arr2[i], arr2[j]);
                    break;
                }
            }
        }
        int k = 0;
        for (int num : arr1) {
            result[k++] = map.getOrDefault(num, -1);
        }
        return result;
    }
}

package com.zakcorp.leetcodemaster;

import java.beans.IntrospectionException;
import java.util.*;

public class Problem_350 {
    static class Solver {
        public int[] intersect(int[] arr1, int[] arr2) {
            int m = arr1.length;
            int n = arr2.length;
            if(m == 0 || n == 0) {
                return new int[]{};
            }
            int i = 0, j = 0, k = 0;
            Arrays.sort(arr1); Arrays.sort(arr2);
            Map<Integer, Integer> map = new HashMap<>();
            while(i < m && j < n) {
                if(arr1[i] == arr2[j]) {
                    arr1[k++] = arr1[i];
                    i++;
                    j++;
                } else if(arr1[i] < arr2[j]) {
                    i++;
                } else {
                    j++;
                }
            }
            return Arrays.copyOfRange(arr1, 0, k);
        }
    }
}

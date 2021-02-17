package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1213 {
    static class Solver {
        // Remember all three arrays are sorted in increasing order
        public List<Integer> solve1(int[] arr1, int[] arr2, int[] arr3) {
            List<Integer> output = new ArrayList<>();
            List<Integer> temp = new ArrayList<>();
            int x = arr1.length, y = arr2.length, z = arr3.length;
            int i = 0, j = 0, k = 0;
            while(i < x && j < y) {
                if(arr1[i] < arr2[j]) {
                    i++;
                } else if(arr1[i] > arr2[j]) {
                    j++;
                } else {
                    temp.add(arr1[i]);
                    i++;
                    j++;
                }
            }
            j = 0;
            while(j < temp.size() && k < z) {
                if(temp.get(j) < arr3[k]) {
                    j++;
                } else if(temp.get(j) > arr3[k]) {
                    k++;
                } else {
                    output.add(arr3[k]);
                    j++;
                    k++;
                }
            }
            return output;
        }
    }
}

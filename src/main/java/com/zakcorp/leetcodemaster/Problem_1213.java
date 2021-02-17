package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1213 {
    static class Solver {
        // Create a key to value map, if the value size is 3 add to output list
        public List<Integer> solve1(int[] arr1, int[] arr2, int[] arr3) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int value : arr1) {
                map.put(value, 1);
            }
            for (int value : arr2) {
                if (map.containsKey(value)) {
                    map.put(value, map.get(value) + 1);
                }
            }
            for (int value : arr3) {
                if (map.containsKey(value)) {
                    map.put(value, map.get(value) + 1);
                }
            }
            List<Integer> list = new ArrayList<>();
            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(entry.getValue() == 3) {
                    list.add(entry.getKey());
                }
            }
            Collections.sort(list);
            return list;
        }

        // Remember all three arrays are sorted in increasing order
        public List<Integer> solve2(int[] arr1, int[] arr2, int[] arr3) {
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

package com.zakcorp.leetcodemaster.contest;

import java.util.HashMap;
import java.util.Map;

public class Problem_C {
    static class Solver {
        public int[] solve1(int[] arr, int[][] operations) {
            for(int i = 0; i < operations.length; i++) {
                int number = operations[i][0];
                int val = operations[i][1];
                for(int j = 0; j < arr.length; j++) {
                    if(arr[j] == number) {
                        arr[j] = val;
                        break;
                    }
                }
            }
            return arr;
        }
        public int[] solve2(int[] arr, int[][] operations) {
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < arr.length; i++) {
                map.put(arr[i], i);// arr[0], 0
            }
            for(int i = 0; i < operations.length; i++) {
                int number = operations[i][0];
                int val = operations[i][1];
                if(map.containsKey(number)) {
                    arr[map.get(number)] = val;
                    map.put(val, map.get(number));
                }
            }
            return arr;
        }
    }
}

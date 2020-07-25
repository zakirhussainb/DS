package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1460 {
    static class Solver {
        public boolean solve1(int[] target, int[] arr) {
            // Time and Space Complexities:- O(n) and O(n)
            Map<Integer, Integer> map = new HashMap<>();
            for(int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int i = 0; int n = target.length;
            while(!map.isEmpty() && i < n) {
                if(map.containsKey(target[i])) {
                    map.put(target[i], map.get(target[i]) - 1);
                    map.remove(target[i], 0);
                }
                i++;
            }
            return map.size() == 0;
        }
        public boolean solve2(int[] target, int[] arr) {
            // Time and Space Complexities:- O(n) and O(n)
            // Based on the constraints given in the problem.
            int[] countArr = new int[1001];
            for(int i = 0; i < target.length; i++) {
                countArr[target[i]]++;
                countArr[arr[i]]--;
            }
            for(int i = 0; i < 1001; i++) {
                if(countArr[i] != 0) {
                    return false;
                }
            }
            return true;
        }
        public boolean wrongSolution(int[] target, int[] arr) {
            // TODO:- This is failing for the testcase 7.
            // Time and Space Complexities:- O(n) and O(1)
            // We just need to check whether two arrays are equal.
            // So take their sum and check.
            int targetSum = 0, arrSum = 0;
            for(int num : target) {
                targetSum += num;
            }
            for(int num : arr) {
                arrSum += num;
            }
            return targetSum == arrSum;
        }
    }
}

package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_496 {
    static class Solver {
        public int[] solve1(int[] arr1, int[] arr2) {
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < arr2.length; i++) {
                for(int j = i + 1; j < arr2.length; j++) {
                    if(arr2[j] > arr2[i]) {
                        map.put(arr2[i], arr2[j]);
                        break;
                    }
                }
            }
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = map.getOrDefault(arr1[i], -1);
            }
            return arr1;
        }

        public int[] solve2(int[] arr1, int[] arr2) {
            Stack<Integer> stack = new Stack<>();
            Map<Integer, Integer> map = new HashMap<>();
            for(int num : arr2) {
                while( !stack.isEmpty() && stack.peek() < num) {
                    map.put(stack.pop(), num);
                }
                stack.push(num);
            }
            for(int i = 0; i < arr1.length; i++) {
                arr1[i] = map.getOrDefault(arr1[i], -1);
            }
            return arr1;
        }
    }
}

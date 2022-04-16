package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public int solve1(int[] arr) {
            int minVal = Integer.MAX_VALUE;
            int result = 0;
            Arrays.sort(arr);
            List<Integer> list = new ArrayList<>();
            for (int num : arr) {
                int distanceFromZero = Math.abs(num);
                if(distanceFromZero <= minVal) {
                    if(distanceFromZero == minVal || !list.isEmpty()) {
                        list.add(num);
                    }
                    minVal = distanceFromZero;
                    result = num;
                }
            }
            list.sort(Comparator.comparingInt(Math::abs));
            return list.isEmpty() ? result : list.get(0);
        }
        public int solve2(int[] arr) {
            int closestIndex = 0;
            int diff = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; ++i) {
                int abs = Math.abs(arr[i]);
                if (abs < diff) {
                    closestIndex = i;
                    diff = abs;
                } else if (abs == diff && arr[i] > 0 && arr[closestIndex] < 0) {
                    //same distance to zero but positive
                    closestIndex =i;
                }
            }
            return arr[closestIndex];
        }

    }
}

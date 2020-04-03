package com.zakcorp.leetcodemaster;

import java.util.ArrayDeque;
import java.util.Queue;

public class Problem_53 {
    static class Solver {
        public int findMaxSubArrayUsingKadane(int[] arr) {
            if(arr.length == 0)
                return 0;
            int finalMax = arr[0];
            int currentMax = arr[0];
            for(int i = 1; i < arr.length; i++) {
                currentMax = (currentMax < 0) ? arr[i] : (currentMax + arr[i]);
                finalMax = Math.max(finalMax, currentMax);
            }
            return finalMax;
        }
    }
}

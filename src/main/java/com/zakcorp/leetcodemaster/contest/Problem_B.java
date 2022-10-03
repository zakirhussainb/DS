package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_B {
    static class Solver {
        int[] arr;
        int maxVal;
        public Solver(int n) {
            maxVal = Integer.MIN_VALUE;
            arr = new int[n + 1];
        }

        public void upload(int video) {
            maxVal = Math.max(maxVal, video);
            arr[video] = 1;
        }

        public int longest() {
            for(int i = 1; i <= maxVal; i++) {
                if(arr[i] == 0) {
                    return i - 1;
                }
            }
            return maxVal == Integer.MIN_VALUE ? 0 : maxVal;
        }
    }
}

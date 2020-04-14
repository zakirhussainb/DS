package com.zakcorp.leetcodemaster;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Problem_628 {
    static class Solver {
        public int maximumProduct_approach1(int[] arr) {
            Arrays.sort(arr);
            // normal cases;
            int x = arr[arr.length - 1];
            int y = arr[arr.length - 2];
            int z = arr[arr.length - 3];

            // edge cases [-4, -3, -2, -1, 60] -> O/P - 720
            int x1 = arr[0];
            int y1 = arr[1];
            int normalProdMax = x * y * z;
            int edgeCaseProdMax = x1 * y1 * x;
            return Math.max(edgeCaseProdMax, normalProdMax);
        }
        public int maximumProduct_approach2(int[] arr) {
            int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
            int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
            for(int i = 0; i < arr.length; i++) {
                // Find Minimum values first
                if(arr[i] < min1){
                    min2 = min1;
                    min1 = arr[i];
                } else if(arr[i] < min2){
                    min2 = arr[i];
                }
                // Find Maximum values
                if(arr[i] >= max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = arr[i];
                } else if(arr[i] >= max2){
                    max3 = max2;
                    max2 = arr[i];
                } else if(arr[i] >= max3){
                    max3 = arr[i];
                }
            }
            return Math.max(min1 * min2 * max1, max1 * max2 * max3);
        }
    }

}

package com.zakcorp.striver_series.graphs.shortestpathalgos;

import java.util.*;

public class MinimumMulToReachEnd {
    static class Solver {
        public int minimumMultiplications(int[] arr, int start, int end) {
            if(start == end) return 0;
            int mod = 100000;
            int[] steps = new int[mod];
            Arrays.fill(steps, (int)1e9);
            steps[start] = 0;

            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{0, start}); // stepValue, node

            while(!queue.isEmpty()) {
                int[] cell = queue.poll();
                int stepValue = cell[0];
                int node = cell[1];

                for(int i = 0; i < arr.length; i++) {
                    int multipliedNode = (node * arr[i]) % mod;

                    if(multipliedNode == end) return stepValue + 1;

                    if(stepValue + 1 < steps[multipliedNode]) {
                        steps[multipliedNode] = stepValue + 1;
                        queue.add(new int[]{steps[multipliedNode], multipliedNode});
                    }
                }
            }
            return -1;
        }
    }
}

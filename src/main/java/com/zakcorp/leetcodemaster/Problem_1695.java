package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1695
{
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            int maxScore = 0;
            Map<Integer, Integer> map = new HashMap<>();
            int[] prefixSum = new int[n + 1];
            int i = 0;
            for(int j = 0; j < n; j++) {
                prefixSum[j + 1] = prefixSum[j] + arr[j];
                if(map.containsKey( arr[j] )) {
                    i = Math.max( i, map.get( arr[j] ) + 1 );
                }
                maxScore = Math.max( maxScore, prefixSum[j + 1] - prefixSum[i] );
                map.put(arr[j], j);
            }
            return maxScore;
        }
    }
}

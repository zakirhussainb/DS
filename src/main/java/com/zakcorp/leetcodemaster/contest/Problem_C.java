package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_C {
    static class Solver {
        public int solve1(int[] prizePositions, int k) {
            int n = prizePositions.length;
            int a = prizePositions[0]; // MIN
            int d = prizePositions[n - 1]; // MAX
            int b = a + k;
            int c = d - k;
            List<Integer> op = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                if(a <= prizePositions[i] && prizePositions[i] <= b) {
                    op.add( prizePositions[i] );
                } else if(c <= prizePositions[i] && prizePositions[i] <= d) {
                    op.add( prizePositions[i] );
                }
            }
            return op.size();
        }
        public int solve2(int[] prizePositions, int k) {
            int n = prizePositions.length;
            int maxPrizes = 0;
            for (int i = 0; i < n; i++) {
                int left = prizePositions[i] + k;
                int right = prizePositions[i] + 2 * k;
                int start = Arrays.binarySearch(prizePositions, left);
                int end = Arrays.binarySearch(prizePositions, right);
                if (start < 0) {
                    start = -start - 1;
                }
                if (end < 0) {
                    end = -end - 1 - 1;
                }
                maxPrizes = Math.max(maxPrizes, end - start + 1);
            }
            return maxPrizes;
        }
    }
}

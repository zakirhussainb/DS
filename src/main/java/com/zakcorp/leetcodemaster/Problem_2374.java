package com.zakcorp.leetcodemaster;

public class Problem_2374
{
    static class Solver {
        public int solve1(int[] edges) {
            int n = edges.length;
            long[] inDegreeSum = new long[n];
            for(int i = 0; i < n; i++) {
                inDegreeSum[edges[i]] += i;
            }
            int maxScoreIndex = 0;

            for( int i = 0; i < n; i++ ) {
                if( inDegreeSum[i] > inDegreeSum[maxScoreIndex] ) {
                    maxScoreIndex = i;
                }
            }
            return maxScoreIndex;
        }
    }
}

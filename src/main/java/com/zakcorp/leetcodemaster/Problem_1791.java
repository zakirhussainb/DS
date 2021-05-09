package com.zakcorp.leetcodemaster;

public class Problem_1791 {
    static class Solver {
        public int solve1(int[][] edges) {
            int N = edges.length + 2;
            int[] degree = new int[N];
            for(int[] edge : edges) {
                degree[edge[0]]++;
                degree[edge[1]]++;
            }
            for(int i = 1; i <= N; i++) {
                if(degree[i] == N - 2) {
                    return i;
                }
            }
            return -1;
        }
        public int solve2(int[][] edges) {
            return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[1][0];
        }
    }
}

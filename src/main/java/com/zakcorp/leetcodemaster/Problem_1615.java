package com.zakcorp.leetcodemaster;

public class Problem_1615
{
    static class Solver {
        /*
        1. Construct an adjacency matrix -> this will give you the information that whether 2 nodes are connected or not.
        2. Construct the degrees array -> this is required to store the information of no. of edges incident to a given vertex.
        3. Finally, calculate the maximal network rank
                -> Just Brute Force for all combinations, lets say n = 4, then [0,1] [0,2] [0,3] [1,2] [1,3] [2,3]
                -> Calculate the maximum, just remember that when there is a line directly connecting i and j, we will count
                roads[i, j] twice, so remove 1(based on the connection information in the adjacency matrix)
         */
        public int solve1(int n, int[][] roads) {
            boolean[][] connected = new boolean[n][n]; // adjacency matrix to store the connection information
            int[] degrees = new int[n];
            for(int[] r : roads) {
                degrees[r[0]]++;
                degrees[r[1]]++;
                connected[r[0]][r[1]] = true;
                connected[r[1]][r[0]] = true;
            }
            int res = 0;
            for(int i = 0; i < n; i++) {
                for(int j = i + 1; j < n; j++) {
                    res = Math.max(res, degrees[i] + degrees[j] - (connected[i][j] ? 1 : 0));
                }
            }
            return res;
        }
    }
}

package com.zakcorp.striver_series.graphs.shortestpathalgos;

import java.util.Arrays;

public class CityWithSmallestNoOfNeighbors {
    static class Solver {
        public int findCity(int n, int m, int[][] edges, int distanceThreshold) {
            // Create adjacency matrix
            int[][] adjMatrix = new int[n][n];
            for(int r = 0; r < n; r++) {
                Arrays.fill(adjMatrix[r], (int)1e9);
            }

            for(int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int wt = edge[2];
                adjMatrix[u][v] = wt;
                adjMatrix[v][u] = wt;
            }

            // Floyd warshall algorithm
            for(int k = 0; k < n; k++) {
                for(int u = 0; u < n; u++) {
                    for(int v = 0; v < n; v++) {
                        adjMatrix[u][v] = Math.min(adjMatrix[u][v], adjMatrix[u][k] + adjMatrix[k][v]);
                    }
                }
            }

            int minCount = (int)1e9;
            int ans = -1;

            // Check every city
            for(int u = 0; u < n; u++) {
                int count = 0;
                for(int v = 0; v < n; v++) {
                    if(u != v && adjMatrix[u][v] <= distanceThreshold) {
                        count++;
                    }
                }

                if(count < minCount) {
                    minCount = count;
                    ans = u;
                } else if(count == minCount) {
                    ans = u;
                }
            }

            return ans;
        }
    }
}

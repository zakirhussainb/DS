package com.zakcorp.striver_series.graphs.shortestpathalgos;

import java.util.*;

public class FloydWarshallAlgorithm {
    static class Solver {
        public int[][] floydWarshall(int[][] matrix) {
            int n = matrix.length;

            // For each intermediate node k
            for(int k = 0; k < n; k++) {
                for(int u = 0; u < n; u++) {
                    for(int v = 0; v < n; v++) {
                        // If there is no edge from u -> k or there is no edge from k -> v
                        // This means k is not an intermediate node, so skip iteration
                        if(matrix[u][k] == -1 || matrix[k][v] == -1) {
                            continue;
                        }

                        // If there is no direct edge from u -> v
                        if(matrix[u][v] == -1) {
                            matrix[u][v] = matrix[u][k] + matrix[k][v];
                        } else { // Else update the distance to minimum of both paths
                            matrix[u][v] = Math.min(matrix[u][v], matrix[u][k] + matrix[k][v]);
                        }
                    }
                }
            }
            return matrix;
        }
    }
}

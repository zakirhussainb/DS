package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_323 {
    static class Solver {
        static class Graph {
            int V;
            int[][] adjMatrix;
            public Graph(int V) {
                this.V = V;
                adjMatrix = new int[V][V];
            }
            public void addEdge(int u, int v) {
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }

        }
        public int solve1(int n, int[][] edges) {
            Graph g = new Graph(n);
            for(int[] edge : edges) {
                g.addEdge(edge[0], edge[1]);
            }
            for(int i = 0; i < g.adjMatrix.length; i++) {
                for(int j = 0; j < g.adjMatrix[i].length; j++) {
                    System.out.print(g.adjMatrix[i][j] + " ");
                }
                System.out.println();
            }
            return -1;
        }
    }
}

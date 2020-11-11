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
            boolean[] visited = new boolean[g.V];
            int cc = 0;
            for(int i = 0; i < g.V; i++) {
                if( !visited[i] ) {
                    dfs(i, visited, g);
                    cc++;
                }
            }
            return cc;
        }
        private void dfs(int src, boolean[] visited, Graph g) {
            visited[src] = true;
            for(int i = 0; i < g.V; i++) {
                if(g.adjMatrix[src][i] == 1 && !visited[i]) {
                    dfs(i, visited, g);
                }
            }
        }
    }
}

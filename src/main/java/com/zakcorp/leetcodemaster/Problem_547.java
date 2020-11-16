package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_547 {
    static class Solver {
        static class Graph {
            public int V;
            public LinkedList<Integer>[] adjListArr;
            public Graph(int V) {
                this.V = V;
                adjListArr = new LinkedList[V];
                for(int i = 0; i < V; i++) {
                    adjListArr[i] = new LinkedList<>();
                }
            }
            private void addEdge(int u, int v) {
                adjListArr[u].add(v);
                adjListArr[v].add(u);
            }
        }
        public int solve1(int[][] arr) {
            Graph g = new Graph(arr.length);
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                    if(arr[i][j] == 1) {
                        g.addEdge(i, j);
                    }
                }
            }
            boolean[] visited = new boolean[g.V];
            int cc = 0;
            for(int i = 0; i < g.V; i++) {
                if(!visited[i]) {
                    cc++;
                    dfs(i, visited, g);
                }
            }
            return cc;
        }
        private void dfs(int src, boolean[] visited, Graph g) {
            visited[src] = true;
            for(Integer i : g.adjListArr[src]) {
                if(!visited[i]) {
                    visited[i] = true;
                    dfs(i, visited, g);
                }
            }
        }
    }
    static class Solver1 {
        static class Graph {
            public int V;
            public int[][] adjMatrix;
            public Graph(int V) {
                this.V = V;
                adjMatrix = new int[V][V];
            }
            private void addEdge(int u, int v) {
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }
        }
        public int solve1(int[][] arr) {
            int n = arr.length;
            Graph g = new Graph(n);
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                    if(arr[i][j] == 1) {
                        g.addEdge(i, j);
                    }
                }
            }
            boolean[] visited = new boolean[n];
            int cc = 0;
            for(int i = 0; i < n; i++) {
                if( !visited[i] ) {
                    cc++;
                    dfs(i, visited, g);
                }
            }
            return cc;
        }
        private void dfs(int src, boolean[] visited, Graph g) {
            visited[src] = true;
            for(int i = 0; i < g.V; i++) {
                if(g.adjMatrix[src][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    dfs(i, visited, g);
                }
            }
        }
    }
}

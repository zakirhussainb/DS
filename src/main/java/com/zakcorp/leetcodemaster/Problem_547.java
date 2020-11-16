package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_547 {
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
    static class Solver {
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
}

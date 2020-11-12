package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_797 {
    static class Solver {
        static class Graph {
            private int V;
            private LinkedList<Integer>[] adjListArr;
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
        public List<List<Integer>> solve1(int[][] graph) {
            int n = graph.length;
            Graph g = new Graph(n);
            int src = 0, dest = n - 1;
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> path = new ArrayList<>();
            path.add(0);
            dfsSearch(g, 0, result, path);
            return result;
        }

        private void dfsSearch(Graph g, int i, List<List<Integer>> result, List<Integer> path) {

        }
    }
}

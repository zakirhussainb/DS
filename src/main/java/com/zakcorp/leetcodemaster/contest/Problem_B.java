package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_B {
    static class Graph {
        int V;
        LinkedList<Integer>[] adjListArray;
        public Graph(int V) {
            this.V = V;
            adjListArray = new LinkedList[V];
            for(int i = 0; i < V; i++) {
                adjListArray[i] = new LinkedList<>();
            }
        }
        private void addEdge(int u, int v) {
            adjListArray[u].add(v);
            adjListArray[v].add(u);
        }
    }
    static class Solver {
        public int solve1(int n, int[][] edges, int[] restricted) {
            Set<Integer> set = new HashSet<>();
            for(int num : restricted)
                set.add(num);
            Graph g = new Graph(n);
            for(int[] edge : edges) {
                g.addEdge(edge[0], edge[1]);
            }
            boolean[] isVisited = new boolean[g.V];
            dfs(g, 0, set, isVisited);
            int count = 0;
            for(int i = 0; i < g.V; i++) {
                if (isVisited[i])
                    count++;
            }
            return count;
        }
        private void dfs(Graph g, int src, Set<Integer> set, boolean[] isVisited) {
            isVisited[src] = true;
            for(int num : g.adjListArray[src]) {
                if(!isVisited[num] && !set.contains(num)) {
                    dfs(g, num, set, isVisited);
                }
            }
        }
    }
}
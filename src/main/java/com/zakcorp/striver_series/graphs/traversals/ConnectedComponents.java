package com.zakcorp.striver_series.graphs.traversals;

import java.util.*;

public class ConnectedComponents {
    static class Solver {
        public int findNumberOfComponents(int V, List<List<Integer>> edges) {

            // Create Adjacency List
            List<Integer>[] adjList = new ArrayList[V];
            for(int i = 0; i < V; i++) {
                adjList[i] = new ArrayList<>();
            }
            // Add edges to the adjacency list
            for (List<Integer> edge : edges) {
                int u = edge.get(0);
                int v = edge.get(1);
                adjList[u].add(v);
                adjList[v].add(u);
            }
            int cc = 0;
            boolean[] visited = new boolean[V];
            for(int i = 0; i < V; i++) {
                if(!visited[i]) {
                   bfs(i, visited, adjList);
                   cc++;
                }
            }
            return cc;
        }
        private void bfs(int node, boolean[] visited, List<Integer>[] adjList) {
            visited[node] = true;
            Queue<Integer> queue = new LinkedList<>();
            queue.add(node);
            while(!queue.isEmpty()) {
                int current = queue.poll();
                for(int neighbour : adjList[current]) {
                    if(!visited[neighbour]) {
                        queue.add(neighbour);
                        visited[neighbour] = true;
                    }
                }
            }
        }
    }
}

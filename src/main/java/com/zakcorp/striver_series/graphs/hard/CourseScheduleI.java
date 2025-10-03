package com.zakcorp.striver_series.graphs.hard;

import java.util.*;

public class CourseScheduleI {
    static class Solver {
        public boolean canFinish(int V, int[][] adj) {
            // Create the adjacency list
            List<Integer>[] adjList = new ArrayList[V];
            for(int i = 0; i < V; i++) {
                adjList[i] = new ArrayList<>();
            }

            // Construct the graph from the given edges
            for(int[] edge : adj) {
                int u = edge[0];
                int v = edge[1];
                // add the edge v to u
                adjList[v].add(u);
            }

            int[] ans = topologicalSortUsingBFS(V, adjList);

            return ans.length >= V;
        }

        private int[] topologicalSortUsingBFS(int V, List<Integer>[] adjList) {
            // Find the in-degree for each node
            int[] indegree = new int[V];
            for(int i = 0; i < V; i++) {
                for(int it : adjList[i]) {
                    indegree[it]++;
                }
            }

            // Fill up the queue with nodes that have no incoming edges, i.e. indegree is zero
            Queue<Integer> queue = new LinkedList<>();
            for(int i = 0; i < V; i++) {
                if(indegree[i] == 0) {
                    queue.add(i);
                }
            }

            int[] ans = new int[V];
            int k = 0;
            while(!queue.isEmpty()) {
                int node = queue.poll();
                ans[k++] = node;
                for(int neighbor : adjList[node]) {
                    indegree[neighbor]--;
                    if(indegree[neighbor] == 0) {
                        queue.add(neighbor);
                    }
                }
            }

            return Arrays.copyOfRange(ans, 0, k);
        }
    }
}

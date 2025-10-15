package com.zakcorp.striver_series.graphs.hard;

import java.util.*;

public class AlienDictionary {
    static class Solver {
        public String findOrder(String[] dict, int N, int K) {
            // Create the adjacency list
            List<Integer>[] adjList = new ArrayList[K];
            for(int i = 0; i < K; i++) {
                adjList[i] = new ArrayList<>();
            }

            for(int i = 0; i < N - 1; i++) {
                // Compare two strings and create edges for directed graph
                String s1 = dict[i];
                String s2 = dict[i + 1];
                int len = Math.min(s1.length(), s2.length());
                for(int j = 0; j < len; j++) {
                    if(s1.charAt(j) != s2.charAt(j)) {
                        adjList[s1.charAt(j) - 'a'].add(s2.charAt(j) - 'a');
                        break;
                    }
                }
            }

            int[] ans = topologicalSortUsingBFS(K, adjList);

            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < K; i++) {
                sb.append((char) ('a' + ans[i]));
                sb.append(' ');
            }
            return sb.toString().trim();
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

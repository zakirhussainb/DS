package com.zakcorp.striver_series.graphs.hard;

import java.util.*;

public class ShortestPathInDAG {
    static class Solver {
        public int[] shortestPath(int N, int M, int[][] edges) {
            // Step 0: Create the adjacency list to store the graph and its weights
            // Step 1: Since it is a DAG - find topological sort to process the vertices in valid order.
            // Step 2: After finding the sort order, relax the edges. What does it mean? if a shorter path is found, update its distance to new shorter distance

            List<int[]>[] adjList = new ArrayList[N];
            for(int i = 0; i < N; i++) {
                adjList[i] = new ArrayList<>();
            }

            for(int i = 0; i < M; i++) {
                int u = edges[i][0];
                int v = edges[i][1];
                int weight = edges[i][2];

                adjList[u].add(new int[]{v, weight});
            }

            boolean[] visited = new boolean[N];
            Stack<Integer> stack = new Stack<>();
            for(int i = 0; i < N; i++) {
                if(!visited[i]) {
                    topoDFS(i, adjList, visited, stack);
                }
            }

            int[] distances = new int[N];
            Arrays.fill(distances, (int)1e9);
            distances[0] = 0;
            while(!stack.isEmpty()) {
                int node = stack.pop();
                for(int[] neighbor : adjList[node]) {
                    int v = neighbor[0];
                    int weight = neighbor[1];
                    // relax edges: if a shorter path is found, update its distance to new shorter distance
                    distances[v] = Math.min(distances[v], distances[node] + weight);
                }
            }

            for(int i = 0; i < N; i++) {
                if(distances[i] == (int)1e9) {
                    distances[i] = -1;
                }
            }

            return distances;
        }

        private void topoDFS(int node, List<int[]>[] adjList, boolean[] visited, Stack<Integer> stack) {
            visited[node] = true;
            for(int[] neighbor : adjList[node]) {
                if(!visited[neighbor[0]]) {
                    topoDFS(neighbor[0], adjList, visited, stack);
                }
            }
            stack.push(node);
        }
    }
}

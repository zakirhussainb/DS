package com.zakcorp.striver_series.graphs.shortestpathalgos;

import java.util.*;

public class PrintShortestPath {
    static class Solver {
        public List<Integer> shortestPath(int n, int m, int[][] edges) {
            // Create adjacency list
            List<List<int[]>> adjList = new ArrayList<>();
            for(int i = 0; i <= n; i++) {
                adjList.add(new ArrayList<>());
            }

            // Initialize adjacency list
            for(int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int w = edge[2];

                adjList.get(u).add(new int[]{v, w}); // u -> v
                adjList.get(v).add(new int[]{u, w}); // v -> u, since undirected graph
            }

            // Create parent array
            int[] parent = new int[n + 1];
            for(int i = 1; i <= n; i++) {
                parent[i] = i;
            }

            // Create distance array
            int[] distances = new int[n + 1];
            Arrays.fill(distances, (int)1e9);
            distances[1] = 0;

            // Create a min heap priority queue
            PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
            pq.add(new int[]{0, 1}); // {dist, src}

            while(!pq.isEmpty()) {
                int[] pair = pq.poll();
                int dist = pair[0];
                int node = pair[1];

                for(int[] neighbor : adjList.get(node)) {
                    int neighborNode = neighbor[0];
                    int edgeWt = neighbor[1];

                    if(dist + edgeWt < distances[neighborNode]) {
                        distances[neighborNode] = dist + edgeWt; // relaxing the edges
                        pq.add(new int[]{distances[neighborNode], neighborNode});
                        parent[neighborNode] = node; // storing the parent
                    }
                }
            }

            if (distances[n] == (int)1e9) {
                return Arrays.asList(-1);
            }

            int node = n;
            List<Integer> shortestPath = new ArrayList<>();
            while(parent[node] != node) {
                shortestPath.add(node);
                node = parent[node];
            }

            shortestPath.add(1); // Add the source to the result
            Collections.reverse(shortestPath); // reverse the list
            shortestPath.add(0, distances[n]);
            return shortestPath;
        }
    }
}

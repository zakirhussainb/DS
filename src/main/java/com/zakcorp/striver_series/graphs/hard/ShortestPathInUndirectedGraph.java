package com.zakcorp.striver_series.graphs.hard;

import java.util.*;

public class ShortestPathInUndirectedGraph {
    static class Solver {
        public int[] shortestPath(int[][] edges, int N, int M) {
            // Step 0: Create the adjacency list to store the graph - no need to store weights, as all of them have unit weights
            // Step 1: Create a distance array initialized to infinity for all the nodes. Set the distance of the node(0) as 0.
            // Step 2: Perform BFS traversal starting from the source node (node 0). Use a queue to perform BFS from the source node.
            // Step 3: For each node, update the distance of its adjacent nodes if a shorter path is found and push the node in the queue. Update distances to -1 for nodes that remain unreachable.

            List<Integer>[] adjList = new ArrayList[N];
            for(int i = 0; i < N; i++) {
                adjList[i] = new ArrayList<>();
            }

            for(int i = 0; i < M; i++) {
                int u = edges[i][0];
                int v = edges[i][1];

                adjList[u].add(v);
                adjList[v].add(u);
            }

            int[] distances = new int[N];
            Arrays.fill(distances, (int)1e9);
            distances[0] = 0;

            // Start the BFS traversal
            Queue<Integer> queue = new LinkedList<>();
            queue.add(0);

            while(!queue.isEmpty()) {
                int node = queue.poll();
                for(int neighbor : adjList[node]) {
                    // relax edges: if a shorter path is found, update its distance to new shorter distance and push the neighbor into the queue
                    if(distances[node] + 1 < distances[neighbor]) {
                        distances[neighbor] = distances[node] + 1;
                        queue.add(neighbor);
                    }
                }
            }

            for(int i = 0; i < N; i++) {
                if(distances[i] == (int)1e9) {
                    distances[i] = -1;
                }
            }

            return distances;
        }
    }
}

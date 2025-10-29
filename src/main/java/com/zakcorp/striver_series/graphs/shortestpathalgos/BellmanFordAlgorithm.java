package com.zakcorp.striver_series.graphs.shortestpathalgos;

import java.util.*;

public class BellmanFordAlgorithm {
    static class Solver {
        public int[] bellmanFord(int V, ArrayList<ArrayList<Integer>> edges, int src) {
            int[] distances = new int[V];
            Arrays.fill(distances, (int)1e9);
            distances[src] = 0;

            for(int i = 0; i < V - 1; i++) {
                for(ArrayList<Integer> edge : edges) {
                    int u = edge.get(0);
                    int v = edge.get(1);
                    int wt = edge.get(2);

                    if(distances[u] != 1e9 && distances[u] + wt < distances[v]) {
                        distances[v] = distances[u] + wt;
                    }
                }
            }

            // An extra relaxation to check if the graph consists of a negative cycle
            for(ArrayList<Integer> edge : edges) {
                int u = edge.get(0);
                int v = edge.get(1);
                int wt = edge.get(2);

                if(distances[u] != 1e9 && distances[u] + wt < distances[v]) {
                    return new int[]{-1};
                }
            }

            return distances;
        }
    }
}

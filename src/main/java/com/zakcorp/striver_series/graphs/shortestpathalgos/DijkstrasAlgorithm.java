package com.zakcorp.striver_series.graphs.shortestpathalgos;

import java.util.*;

public class DijkstrasAlgorithm {
    static class Solver {
        public int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int src) {
            // Min Heap PQ
            PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
            pq.add(new int[]{0, src});

            int[] result = new int[V];
            Arrays.fill(result, (int)1e9);
            result[src] = 0;

            while(!pq.isEmpty()) {
                int[] pair = pq.poll();

                int dist = pair[0];
                int node = pair[1];

                for(ArrayList<Integer> neighbor : adj.get(node)) {
                    int neighborNode = neighbor.get(0);
                    int edgeWt = neighbor.get(1);

                    if(dist + edgeWt < result[neighborNode]) {
                        result[neighborNode] = dist + edgeWt;
                        pq.add(new int[]{result[neighborNode], neighborNode});
                    }
                }
            }
            return result;
        }
    }
}

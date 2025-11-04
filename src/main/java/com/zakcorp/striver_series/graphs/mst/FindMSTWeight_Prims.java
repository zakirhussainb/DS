package com.zakcorp.striver_series.graphs.mst;

import java.util.*;

public class FindMSTWeight_Prims {
    static class Solver {
        public int spanningTree(int V, List<List<List<Integer>>> adj) {
            boolean[] visited = new boolean[V];
            PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0])); // min heap based on weight
            pq.add(new int[]{0, 0}); // {wt, node}

            int sum = 0;
            while(!pq.isEmpty()) {
                int[] cell = pq.poll();

                int wt = cell[0];
                int node = cell[1];

                if(visited[node]) continue;

                visited[node] = true;
                sum += wt;

                for(List<Integer> neighbor : adj.get(node)) {
                    int neighborNode = neighbor.get(0);
                    int edgeWt = neighbor.get(1);

                    if(!visited[neighborNode]) {
                        pq.add(new int[]{edgeWt, neighborNode});
                    }
                }
            }
            return sum;
        }
    }
}

package com.zakcorp.striver_series.graphs.cycles;

import java.util.*;

public class DetectCycleUndirected {
    static class Solver {
        public boolean isCycle(int V, List<Integer>[] adj) {
            boolean[] visited = new boolean[V];
            for(int i = 0; i < V; i++) {
                if(detectCycle(i, adj, V, visited)) {
                    return true;
                }
            }
            return false;
        }

        private boolean detectCycle(int node, List<Integer>[] adj, int V, boolean[] visited) {
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{node, -1});
            visited[node] = true;
            while(!queue.isEmpty()) {
                int[] pair = queue.poll();
                int child = pair[0];
                int parent = pair[1];

                for(int neighbor : adj[child]) {
                    if(!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.add(new int[]{child, parent});
                    } else {
                        if(parent != child) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
}

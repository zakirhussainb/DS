package com.zakcorp.striver_series.graphs.cycles;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BipartiteGraph {
    static class Solver {
        public boolean isBipartite(int V, List<List<Integer>> adj) {
            int[] visited = new int[V];
            Arrays.fill(visited, -1);
            for(int i = 0; i < V; i++) {
                if(visited[i] == -1) {
                    if(!bfs(i, V, adj, visited)){
                        return false;
                    }
                }
            }
            return true;
        }

        private boolean bfs(int node, int V, List<List<Integer>> adj, int[] visited) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(node);
            visited[node] = 0;

            while(!queue.isEmpty()) {
                int currentNode = queue.poll();
                for(int neighborNode : adj.get(currentNode)) {
                    if(visited[neighborNode] == -1) {
                        visited[neighborNode] = 1 - visited[currentNode];
                        queue.add(neighborNode);
                    } else if(visited[neighborNode] == visited[currentNode]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}

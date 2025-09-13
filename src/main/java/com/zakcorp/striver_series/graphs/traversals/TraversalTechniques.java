package com.zakcorp.striver_series.graphs.traversals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TraversalTechniques {
    static class Traversals {
        protected void bfs(int node, boolean[] visited, List<Integer>[] adjList) {
            visited[node] = true;
            Queue<Integer> queue = new LinkedList<>();
            queue.add(node);
            while(!queue.isEmpty()) {
                int current = queue.poll();
                for(int neighbour : adjList[current]) {
                    if(!visited[neighbour]) {
                        queue.add(neighbour);
                        visited[neighbour] = true;
                    }
                }
            }
        }
    }
}

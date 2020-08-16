package com.zakcorp.graphs;

import java.util.*;

public class Graph {
    private int vertex;
    public LinkedList<Integer>[] adj;
    public Graph(int vertex) {
        this.vertex = vertex;
        adj = new LinkedList[vertex];
        for(int i = 0; i < vertex; i++) {
            adj[i] = new LinkedList<>();
        }
    }
    public void addEdge(int v, int w) {
        adj[v].add(w);
    }
    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.println("\nAdjacency list of vertex " + i);
            System.out.print("head");
            for (int j = 0; j < adj[i].size(); j++) {
                System.out.print(" -> " + adj[i].get(j));
            }
            System.out.println();
        }
    }
    public void bfs(int s) {
        boolean[] visited = new boolean[vertex];
        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);
        while(!queue.isEmpty()) {
            s = queue.poll();
            System.out.print(s + ",");
            for(Integer i : adj[s]) {
                if(!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        System.out.println();
    }
}

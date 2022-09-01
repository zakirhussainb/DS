package com.zakcorp.leetcodemaster.classes;

import java.util.LinkedList;

public class Graph {
    public int V;
    public LinkedList<Integer>[] adjListArray;
    public Graph(int V) {
        this.V = V;
        adjListArray = new LinkedList[V];
        for(int i = 0; i < V; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }
    public void addEdge(int u, int v) {
        adjListArray[u].add(v);
        adjListArray[v].add(u);
    }
}

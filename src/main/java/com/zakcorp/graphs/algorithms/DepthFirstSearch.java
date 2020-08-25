package com.zakcorp.graphs.algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class DepthFirstSearch {
    Graph g;
    static class Graph {
        int V;
        LinkedList<Integer>[] adjListArray;
        public Graph(int V) {
            this.V = V;
            adjListArray = new LinkedList[V];
            for(int i = 0; i < V; i++) {
                adjListArray[i] = new LinkedList<>();
            }
        }
        private void addEdge(int u, int v) {
            adjListArray[u].add(v);
            adjListArray[v].add(u);
        }
    }
    public DepthFirstSearch(Graph g) {
        this.g = g;
    }
    public void dfs(int s) {
        boolean[] visit = new boolean[g.V];
        dfsRec(s, visit);
    }
    public void dfsRec(int s, boolean[] visit) {
        System.out.print(s + ",");
        visit[s] = true;
        for(int i : g.adjListArray[s]) {
            if( !visit[i] ) {
                dfsRec(i, visit);
            }
        }
    }
    // TODO:- Implement this
    public void dfsIter() {

    }
}

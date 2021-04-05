package com.zakcorp.final450.binarytree;

import java.util.LinkedList;

/* Check if given graph is tree or not. [ IMP ] */
public class P_188 {
    static class Graph {
        private int V;
        private LinkedList<Integer>[] adjListArr;
        public Graph(int V) {
            this.V = V;
            adjListArr = new LinkedList[V];
            for(int i = 0; i < V; i++) {
                adjListArr[i] = new LinkedList<>();
            }
        }
        public void addEdge(int u, int v) {
            adjListArr[u].add(v);
            adjListArr[v].add(u);
        }
    }
    static class Solver {
        public boolean solve1(Graph g) {
            boolean[] visited = new boolean[g.V];
            if( isCyclic(0, visited, -1, g) )
                return false;

            for(int u = 0; u < g.V; u++) {
                if( !visited[u] )
                    return false;
            }
            return true;
        }
        private boolean isCyclic(int v, boolean[] visited, int parent, Graph g) {
            visited[v] = true;
            for(Integer s : g.adjListArr[v]) {
                if( !visited[s] ) {
                    if(isCyclic(s, visited, v, g))
                        return true;
                } else if(s != parent) {
                    return true;
                }
            }
            return false;
        }
    }
}

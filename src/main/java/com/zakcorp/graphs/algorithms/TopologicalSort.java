package com.zakcorp.graphs.algorithms;

import java.util.*;

/**
 * Created by Zakir Hussain B on 25/08/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class TopologicalSort {
    Graph g;
    boolean[] visited;
    List<Integer> result;
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
        public void addEdge(int u, int v){
            adjListArray[u].add(v);
        }
    }
    public TopologicalSort(Graph g) {
        this.g = g;
        visited = new boolean[g.V];
        result = new ArrayList<>();
    }
    public void dfs(int v) {
        visited[v] = true;
        for(int u : g.adjListArray[v]) {
            if( !visited[u] ){
                dfs(u);
            }
        }
        result.add(v);
    }
    public List<Integer> topologicalSort() {
        result.clear();
        for(int i = 0; i < g.V; i++) {
            if( !visited[i] ) {
                dfs(i);
            }
        }
        Collections.reverse(result);
        return result;
    }
}
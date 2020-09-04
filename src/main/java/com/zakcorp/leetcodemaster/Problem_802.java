package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 05/09/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_802 {
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
        private void addEdge(int u, int v) {
            adjListArr[u].add(v);
        }
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> result = new ArrayList<>();
        Graph g = new Graph(graph.length);
        boolean[] unSafeStates = new boolean[g.V];
        // Build the Graph
        for(int i = 0; i < graph.length; i++) {
            for(int j = 0; j < graph[i].length; j++) {
                g.addEdge(i, graph[i][j]);
            }
        }
        boolean[] visited = new boolean[g.V];
        for(int i = 0; i < g.V; i++) {
            int start = i;
            if( !visited[i] ) {
                visited[i] = true;
                dfs(start, i, g, new HashSet<>(), unSafeStates);
            }
        }
        for(int i = 0; i < g.V; i++) {
            if(!unSafeStates[i]) {
                result.add(i);
            }
        }
        return result;
    }
    private void dfs(int start, int s, Graph g, Set<Integer> set, boolean[] unSafeStates) {
        for(int i : g.adjListArr[s]) {
            if(!set.contains(i)) {
                if(unSafeStates[i]) {
                    unSafeStates[s] = true;
                }
                if(start == i) {
                    unSafeStates[start] = true;
                }
                set.add(i);
                dfs(start, i, g, set, unSafeStates);
            }
        }
    }
}
package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 28/08/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_1557 {
    static class Solver {
        Graph g;
        static class Graph {
            private int V;
            private LinkedList<Integer>[] adjListArr;
            public Graph(int V){
                this.V = V;
                adjListArr = new LinkedList[V];
                for(int i = 0; i < V; i++) {
                    adjListArr[i] = new LinkedList<>();
                }
            }
            public void addEdge(List<List<Integer>> edges) {
                for(int i = 0; i < edges.size(); i++) {
                    for(int j = 0; j < 1; j++) {
                        adjListArr[edges.get(i).get(j)].add(edges.get(i).get(j + 1));
                    }
                }
            }
        }

        public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
            Graph g = new Graph(n);
            g.addEdge(edges);
            List<Integer> resList = new ArrayList<>();
            boolean[] visited = new boolean[n];
            for(int i = 0; i < n; i++) {
                if( !visited[i] ) {
                    resList.add(i);
                    dfs(i, visited, g);
                }
            }
            return resList;
        }
        public void dfs(int s, boolean[] visited, Graph g){
            visited[s] = true;
            for(Integer i : g.adjListArr[s]){
                if( !visited[i] ){
                    dfs(i, visited, g);
                }
            }
        }
    }
}
package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_207 {
    static class Solver {
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
            private void addEdge(int u, int v){
                adjListArr[u].add(v);
            }
        }
        public boolean solve1(int numCourses, int[][] prerequisites) {
            Graph g = new Graph(numCourses);
            for(int[] prerequisite : prerequisites) {
                g.addEdge(prerequisite[1], prerequisite[0]);
            }
            // 0: not visited; 1: visited; 2: visiting
            int[] visited = new int[g.V];
            for(int i = 0; i < g.V; i++) {
                if( dfs(i, visited, g) ) {
                    return false;
                }
            }
            return true;
        }

        private boolean dfs(int src, int[] visited, Graph g) {
            if(visited[src] == 2) // visiting
                return true;
            if(visited[src] == 1) // visited
                return false;
            visited[src] = 2;
            for(Integer num : g.adjListArr[src]) {
                if(dfs(num, visited, g)) {
                    return true;
                }
            }
            visited[src] = 1;
            return false;
        }
    }
}

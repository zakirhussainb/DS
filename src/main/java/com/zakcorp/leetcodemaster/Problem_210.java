package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_210 {
    static class Solver {
        Map<Integer, LinkedList<Integer>> courseMap = new HashMap<>();
        int[] courseOrder;
        LinkedList<Integer> result = new LinkedList<>();
        public int[] solve1(int n, int[][] prerequisites) {
            courseOrder = new int[n];
            // Build the Graph
            for (int[] prerequisite : prerequisites) {
                int pre = prerequisite[1];
                int course = prerequisite[0];
                courseMap.computeIfAbsent(course, k -> new LinkedList<>()).add(pre);
            }

            // Perform Topological Sort
            boolean[] visited = new boolean[n];
            for(int i = 0; i < n; i++) {
                if( !visited[i] ) {
                    dfs(i, visited);
                }
            }
            for(int i = 0; i < n; i++) {
                courseOrder[i] = result.get(i);
            }
            return courseOrder;
        }

        private void dfs(int src, boolean[] visited) {
            visited[src] = true;
            while(courseMap.containsKey(src) && !courseMap.get(src).isEmpty()) {
               dfs(courseMap.get(src).pollFirst(), visited);
            }
            result.add(src);
        }
    }

    static class Solver1 {
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
        LinkedList<Integer> result = new LinkedList<>();
        public int[] solve1(int n, int[][] prerequisites) {
            if(prerequisites.length == 0) {
                return new int[]{0};
            }
            Graph g = new Graph(n);
            for(int[] prerequisite : prerequisites) {
                g.addEdge(prerequisite[1], prerequisite[0]);
            }

            // 0: not visited; 1: visited; 2: visiting
            int[] visited = new int[n];
            for(int i = 0; i < n; i++) {
                if(dfs(i, visited, g)) {
                    return new int[0];
                }
            }

            int[] courseOrder = new int[n];
            for(int i = 0 ; i < n; i++) {
                courseOrder[i] = result.get(i);
            }
            return courseOrder;
        }

        private boolean dfs(int src, int[] visited, Graph g) {
            if(visited[src] == 2)
                return true;
            if(visited[src] == 1)
                return false;
            visited[src] = 2;
            for(Integer num : g.adjListArr[src]) {
                if(dfs(num, visited, g)) {
                    return true;
                }
            }
            visited[src] = 1;
            result.add(0, src);
            return false;
        }
    }
}

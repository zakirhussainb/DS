package com.zakcorp.graphs.algorithms;

import java.util.*;

public class BreadthFirstSearch {
    static class BFS {
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
        public BFS(Graph g) {
            this.g = g;
        }
        public void bfs(int s) {
            boolean[] visited = new boolean[g.V];
            Queue<Integer> queue = new LinkedList<>();
            visited[s] = true;
            queue.add(s);
            while(!queue.isEmpty()) {
                s = queue.poll();
                System.out.print(s + ",");
                for(Integer i : g.adjListArray[s]) {
                    if(!visited[i]) {
                        visited[i] = true;
                        queue.add(i);
                    }
                }
            }
            System.out.println();
        }
    }
    static class ModifiedBFS {
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
        public ModifiedBFS(Graph g) {
            this.g = g;
        }
        public boolean modifiedBFS(int src, int dest, Map<Integer, Integer[]> map) {
            boolean[] visited = new boolean[g.V];
            // The given Map stores the <current_vertex, {predecessor, distance}>
            map.put(src, new Integer[]{src, 0});
            Queue<Integer> queue = new LinkedList<>();
            visited[src] = true;
            queue.add(src);
            while(!queue.isEmpty()) {
                int s = queue.poll();
                for(Integer i : g.adjListArray[s]) {
                    if( !visited[i] ) {
                        map.put(i, new Integer[]{s, map.get(s)[1] + 1});
                        visited[i] = true;
                        queue.add(i);
                        if(i == dest) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
}

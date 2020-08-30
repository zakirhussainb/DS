package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 29/08/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_841 {
    static class Solver { // FAILED
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            Set<Integer> keySet = new HashSet<>();
            keySet.add(0);
            for(int i = 0; i < rooms.size(); i++) {
                for(int j = 0; j < rooms.get(i).size(); j++) {
                    if(keySet.contains(i)) {
                        keySet.add(rooms.get(i).get(j));
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
    }
    static class Solver1 { // FAILED
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            Set<Integer> keySet = new HashSet<>();
            keySet.add(0);
            for (List<Integer> room : rooms) {
                keySet.addAll(room);
            }
            for(int i = 0; i < rooms.size(); i++) {
                if( !keySet.contains(i) ) {
                    return false;
                }
            }
            return true;
        }
    }
    static class Solver2 {
        static class Graph {
            private LinkedList<Integer>[] adjListArr;
            public Graph(int V) {
                adjListArr = new LinkedList[V];
                for(int i = 0; i < V; i++) {
                    adjListArr[i] = new LinkedList<>();
                }
            }
            public void addEdge(int u, int v) {
                adjListArr[u].add(v);
//                adjListArr[v].add(u);
            }
        }
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            int V = rooms.size();
            Graph g = new Graph(V);
            for(int i = 0; i < V; i++) {
                for(int j = 0; j < rooms.get(i).size(); j++) {
                    g.addEdge(i, rooms.get(i).get(j));
                }
            }
            boolean[] visited = new boolean[V];
            dfs(0, visited, g);
            for(int i = 0; i < V; i++) {
                if(!visited[i]) {
                    return false;
                }
            }
            return true;
        }
        private void dfs(int s, boolean[] visited, Graph g) {
            visited[s] = true;
            for(int i : g.adjListArr[s]) {
                if( !visited[i] ) {
                    dfs(i, visited, g);
                }
            }
        }
    }
}
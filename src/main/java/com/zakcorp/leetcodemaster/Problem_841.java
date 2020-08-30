package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 29/08/20.
 *
 * @source: LeetCode
 * @topic: Graph
 * @sub-topic: DFS
 * @platform: LeetCode
 * @problem_link: https://leetcode.com/problems/keys-and-rooms/
 * @pseudocode:
 *  1. Do a dfs from room "0"
 *  2. Mark the rooms visited along the way.
 *  3. Then iterate visited boolean array again and check for any unvisited room, if yes return false.
 */
public class Problem_841 {
    /*static class Solver { // FAILED
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
    }*/
    static class Solver {
        static class Graph {
            private LinkedList<Integer>[] adjListArr;
            public Graph(int V) {
                adjListArr = new LinkedList[V];
                for(int i = 0; i < V; i++) {
                    adjListArr[i] = new LinkedList<>();
                }
            }
            public void addEdge(int u, int v) {
                adjListArr[u].add(v); // This graph is directed, though it looks like it is undirected.
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
    static class Solver1 {
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            int V = rooms.size();
            Stack<Integer> stack = new Stack<>();
            boolean[] visited = new boolean[V];
            visited[0] = true;
            stack.push(0);
            while( !stack.isEmpty() ) {
                int s = stack.pop();
                for(int i : rooms.get(s)) {
                    if(!visited[i]) {
                        visited[i] = true;
                        stack.push(i);
                    }
                }
            }
            for(int i = 0; i < V; i++) {
                if(!visited[i]) {
                    return false;
                }
            }
            return true;
        }
    }
    static class Solver2 {
        static class DfsRec {
            int counter = 0;
            public boolean solve(List<List<Integer>> rooms) {
                boolean[] visited = new boolean[rooms.size()];
                dfs(0, rooms, visited);
                return counter == rooms.size();
            }
            public void dfs(int s, List<List<Integer>> rooms, boolean[] visited) {
                visited[s] = true;
                counter++;
                for(int i : rooms.get(s)) {
                    if(!visited[i]) {
                        dfs(i, rooms, visited);
                    }
                }
            }
        }
        static class DfsIter {
            public boolean solve(List<List<Integer>> rooms) {
                int counter = 0;
                boolean[] visited = new boolean[rooms.size()];
                Stack<Integer> stack = new Stack<>();
                stack.push(0);
                visited[0] = true;
                counter++;
                while (!stack.isEmpty()) {
                    int s = stack.pop();
                    for(int i : rooms.get(s)) {
                        if(!visited[i]) {
                            visited[i] = true;
                            counter++;
                            stack.push(i);
                        }
                    }
                }
                return counter == rooms.size();
            }
        }
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
//            Solver2.DfsRec solver2 = new Solver2.DfsRec();
//            return solver2.solve(rooms);

            Solver2.DfsIter solver3 = new Solver2.DfsIter();
            return solver3.solve(rooms);
        }
    }
}
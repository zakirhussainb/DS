package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 30/08/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_1306 {
    static class Solver {
        static class Graph{
            private int V;
            private LinkedList<Integer>[] adjListArr;
            public Graph(int V){
                this.V = V;
                adjListArr = new LinkedList[V];
                for(int i = 0; i < V; i++) {
                    adjListArr[i] = new LinkedList<>();
                }
            }
            public void addEdge(int u, int v){
                adjListArr[u].add(v);
                adjListArr[v].add(u);
            }
        }
        public boolean canReach(int[] arr, int start) {
            int V = arr.length;
            Graph g = new Graph(V);
//            int dest = -1;
//            for(int i = 0; i < V; i++) {
//                if(arr[i] == 0) {
//                    if(start == arr[i]) {
//                        return true;
//                    } else {
//                        dest = i;
//                    }
//                }
//            }
//            if(start == dest) {
//                return true;
//            }
            for(int i = 0; i < V; i++) {
                if(i + arr[i] < V) {
                    g.addEdge(i, i + arr[i]);
                }
                if(i - arr[i] > -1) {
                    g.addEdge(i, i - arr[i]);
                }
            }
            return bfs(start, g, arr);
        }
        public boolean bfs(int start, Graph g, int[] arr) {
            boolean[] visited = new boolean[g.V];
            Queue<Integer> queue = new LinkedList<>();
            queue.add(start);
            visited[start] = true;
            while(!queue.isEmpty()) {
                int s = queue.poll();
                for(int i : g.adjListArr[s]) {
                    if(!visited[i]) {
                        visited[i] = true;
                        queue.add(i);
                        if(arr[i] == 0){
                            return true;
                        }
                    }
                }
            }
            return false;
        }

    }
}
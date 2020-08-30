package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 30/08/20.
 *
 * @source: LeetCode
 * @topic: Graphs
 * @sub-topic: DFS, BFS
 * @platform: LeetCode
 * @problem_link: https://leetcode.com/problems/jump-game-iii/
 * @pseudocode:
 */
public class Problem_1306 {
    // To remember my initial thought process and the mistakes I made
    /*static class Graph{
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
        }
    }
    public boolean canReach(int[] arr, int start) {
        if(start == 0) {
            return true;
        }
        int V = arr.length;
        Graph g = new Graph(V);
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
    }*/
    static class Solver {
        public boolean canReach(int[] arr, int start) {
            int n = arr.length;
            Queue<Integer> queue = new LinkedList<>();
            queue.add(start);
            while( !queue.isEmpty() ) {
                int s = queue.poll();
                if(arr[s] == 0) {
                    return true;
                }
                if(arr[s] < 0) {
                    continue;
                }
                if(s + arr[s] < n) {
                    queue.add(s + arr[s]);
                }
                if(s - arr[s] > -1 ) {
                    queue.add(s - arr[s]);
                }
                arr[s] = -arr[s];
            }
            return false;
        }
    }
    static class Solver1 {
        public boolean canReach(int[] arr, int start) {
            if(start >= 0 && start < arr.length && arr[start] >= 0) {
                if(arr[start] == 0)
                    return true;
                arr[start] = -arr[start];
                return canReach(arr, start + arr[start]) || canReach(arr, start - arr[start]);
            }
            return false;
        }
    }
}
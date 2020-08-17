package com.zakcorp.graphs;

import java.util.*;

public class Graph {
    public int vertex;
    public LinkedList<Integer>[] adjListArray;
    public Graph(int vertex) {
        this.vertex = vertex;
        adjListArray = new LinkedList[vertex];
        for(int i = 0; i < vertex; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }
    public void addEdge(int u, int v) {
        adjListArray[u].add(v);
        adjListArray[v].add(u);
    }
    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.println("\nAdjacency list of vertex " + i);
            System.out.print("head");
            for (int j = 0; j < adjListArray[i].size(); j++) {
                System.out.print(" -> " + adjListArray[i].get(j));
            }
            System.out.println();
        }
    }
    public void bfs(int s) {
        boolean[] visited = new boolean[vertex];
        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);
        while(!queue.isEmpty()) {
            s = queue.poll();
            System.out.print(s + ",");
            for(Integer i : adjListArray[s]) {
                if(!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        System.out.println();
    }
    public void dfs(int s) {
        boolean[] visit = new boolean[vertex];
        dfsRec(s, visit);
    }
    public void dfsRec(int s, boolean[] visit) {
//        System.out.print(s + ",");
        visit[s] = true;
        for(Integer i : adjListArray[s]) {
            if( !visit[i] ) {
                dfsRec(i, visit);
            }
        }
    }
    public void dfsIter(int s) {
        boolean[] visit = new boolean[vertex];
        Stack<Integer> stack = new Stack<>();
        visit[s] = true;
        stack.push(s);
        while( !stack.isEmpty() ) {
            s = stack.pop();
            System.out.print(s + ",");
            for(Integer i : adjListArray[s]) {
                if( !visit[i] ) {
                    visit[i] = true;
                    stack.push(i);
                }
            }
        }
    }

    public void findShortestPath(int srcVertex, int destVertex) {

    }

    public int connectedComponents() {
        int cc = 0;
        dfs(adjListArray[0].get(0));

        return cc;
    }
}

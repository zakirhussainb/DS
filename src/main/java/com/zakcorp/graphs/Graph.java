package com.zakcorp.graphs;

import java.util.*;

public class Graph {
    public int vertex;
    public LinkedList<Integer>[] adjListArray;
    public LinkedList<Vertex>[] adjListArrayWithWeights;
    public Graph(int vertex) {
        this.vertex = vertex;
        adjListArray = new LinkedList[vertex];
        adjListArrayWithWeights = new LinkedList[vertex];
        for(int i = 0; i < vertex; i++) {
            adjListArray[i] = new LinkedList<>();
            adjListArrayWithWeights[i] = new LinkedList<>();
        }
    }
    public void addEdge(int u, int v) {
        adjListArray[u].add(v);
        adjListArray[v].add(u);
    }
    public void addEdgeWithWeight(int u, int v, int weight) {
        adjListArrayWithWeights[u].add(new Vertex(v, weight));
        adjListArrayWithWeights[v].add(new Vertex(u, weight));
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
    public void bfs(int s, boolean[] visited, Queue<Integer> queue) {
        visited[s] = true;
        queue.add(s);
        while(!queue.isEmpty()) {
            s = queue.poll();
//            System.out.print(s + ",");
            for(Integer i : adjListArray[s]) {
                if(!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
//        System.out.println();
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
    public void dfsIter(int s, boolean[] visit) {
        Stack<Integer> stack = new Stack<>();
        visit[s] = true;
        stack.push(s);
        while( !stack.isEmpty() ) {
            s = stack.pop();
//            System.out.print(s + ",");
            for(Integer i : adjListArray[s]) {
                if( !visit[i] ) {
                    visit[i] = true;
                    stack.push(i);
                }
            }
        }
    }
    public int findShortestPath_whenGraphIsUnweighted(int src, int dest) {
        int distance = 0;
        // The approach is to use a modified version of BFS
        Map<Integer, Integer[]> map = new HashMap<>();
        if( !modifiedBfs(src, dest, map) ) {
            throw new IllegalArgumentException("The destination does'nt exist");
        }
        /*
        // To print the Path
        System.out.print(src + "->");
        for(Map.Entry<Integer, Integer[]> entry : map.entrySet()) {
            if(entry.getKey() == dest) {
                System.out.print(entry.getValue()[0] + "->");
            }
        }
        System.out.print(dest);
        System.out.println();*/

        // To return the distance from the src to dest
        distance = map.get(dest)[1];
        return distance;
    }
    public boolean modifiedBfs(int v, int dest, Map<Integer, Integer[]> map) {
        boolean[] visited = new boolean[vertex];
// The given Map stores the <current_vertex, {predecessor, distance}>
        Queue<Integer> queue = new LinkedList<>();
        map.put(v, new Integer[]{v, 0});
        queue.add(v);
        visited[v] = true;
        while( !queue.isEmpty() ) {
            int s = queue.poll();
            for(int i : adjListArray[s]) {
                if( !visited[i] ) {
                    map.put(i, new Integer[]{s, map.get(s)[1] + 1});
                    queue.add(i);
                    visited[i] = true;
                    if(i == dest) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void printGraphWithWeights() {
        for (int i = 0; i < vertex; i++) {
            System.out.println("\nAdjacency list of vertex " + i);
            System.out.print("head");
            for (int j = 0; j < adjListArrayWithWeights[i].size(); j++) {
                System.out.print(" -> " + adjListArrayWithWeights[i].get(j).node + "(" +
                        adjListArrayWithWeights[i].get(j).cost + ")");
            }
            System.out.println();
        }
    }
}

package com.zakcorp.graphs;

public class DriverProgram {
    public static void main(String[] args) {
        Graph graph = new Graph(8);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(1,3);
        graph.addEdge(2,1);
        graph.addEdge(2,3);
        graph.addEdge(3,1);
        graph.addEdge(3,2);
        graph.addEdge(3,4);
        graph.addEdge(3,5);
        graph.addEdge(4,1);
        graph.addEdge(4,3);
        graph.addEdge(4,5);
        graph.addEdge(5,3);
        graph.addEdge(5,4);
        graph.addEdge(5,6);
        graph.addEdge(5,7);
        graph.addEdge(6,5);
        graph.addEdge(7,5);
//        graph.printGraph();
        graph.bfs(4);
        graph.bfs(1);
        graph.bfs(3);
        graph.bfs(7);
    }
}

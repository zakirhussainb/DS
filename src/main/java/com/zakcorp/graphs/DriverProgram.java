package com.zakcorp.graphs;

public class DriverProgram {
    public static void main(String[] args) {
        Graph graph = new Graph(8);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(3,5);
        graph.addEdge(4,5);
        graph.addEdge(5,6);
        graph.addEdge(5,7);
        graph.printGraph();
//        graph.bfs(4);
//        graph.bfs(1);
//        graph.bfs(3);
//        graph.bfs(7);
//        graph.findShortestPath(1, 7);
//        graph.dfs(1); // op:- 1,2,3,4,5,6,7
//        graph.dfsIter(1); // op:- 1,2,3,4,5,6,7
    }
}

package com.zakcorp.graphs;

public class ShortestPath {
    public static void main(String[] args) {
        Graph g = new Graph(8);
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(3, 4);
        g.addEdge(3, 7);
        g.addEdge(4, 5);
        g.addEdge(4, 6);
        g.addEdge(4, 7);
        g.addEdge(5, 6);
        g.addEdge(6, 7);
//        g.printGraph();
        int src = 2;
        int dest = 6;
        System.out.println(g.findShortestPath_whenGraphIsUnweighted(src, dest));
    }
}

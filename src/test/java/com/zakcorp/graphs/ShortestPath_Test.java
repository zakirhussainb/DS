package com.zakcorp.graphs;

import org.junit.Test;
import java.util.*;

public class ShortestPath_Test {
    ShortestPath.Solver shortestPath = new ShortestPath.Solver();
    @Test
    public void testShortestPath_whenGraphIsUnWeighted() {
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
        System.out.println(shortestPath.findShortestPath_whenGraphIsUnweighted(g, src, dest));
    }

    @Test
    public void testShortestPath_whenGraphIsWeighted() {
        Graph g = new Graph(9);
        g.addEdgeWithWeight(0, 1, 4);
        g.addEdgeWithWeight(0, 7, 8);
        g.addEdgeWithWeight(1, 2, 8);
        g.addEdgeWithWeight(1, 7, 11);
        g.addEdgeWithWeight(2, 3, 7);
        g.addEdgeWithWeight(2, 5, 4);
        g.addEdgeWithWeight(2, 8, 2);
        g.addEdgeWithWeight(3, 4, 9);
        g.addEdgeWithWeight(3, 5, 14);
        g.addEdgeWithWeight(4, 5, 10);
        g.addEdgeWithWeight(5, 6, 2);
        g.addEdgeWithWeight(6, 7, 1);
        g.addEdgeWithWeight(6, 8, 6);
        g.addEdgeWithWeight(7, 8, 7);
//        g.printGraphWithWeights();
        int src = 0;
        shortestPath.findShortestPath_dijkstraPQ(g, src);
        shortestPath.findShortestPath_dijkstra(g, src);
    }

    /**
     *
     */
    @Test
    public void testShortestPath_whenGraphIsWeightedWithNegativeEdges() {
        BellmanFordAlgorithm.DirectedGraph g = new BellmanFordAlgorithm.DirectedGraph(5);
        g.addEdge(0, 1, -1);
        g.addEdge(0, 2, 4);
        g.addEdge(1, 2, 3);
        g.addEdge(1, 3, 2);
        g.addEdge(1, 4, 2);
        g.addEdge(3, 2, 5);
        g.addEdge(3, 1, 1);
        g.addEdge(4, 3, -3);
//        g.printGraphWithWeights(g.adjListArrayForDirected);
        shortestPath.findShortestPath_bellmanFord(g, 0);
    }

    @Test
    public void testShortestPath_whenGraphIsWeightedWithNegativeEdges_SPFA() {
        ShortestPathFasterAlgorithm.DirectedGraph g = new ShortestPathFasterAlgorithm.DirectedGraph(5);
        g.addEdge(0, 1, -1);
        g.addEdge(0, 2, 4);
        g.addEdge(1, 2, 3);
        g.addEdge(1, 3, 2);
        g.addEdge(1, 4, 2);
        g.addEdge(3, 2, 5);
        g.addEdge(3, 1, 1);
        g.addEdge(4, 3, -3);
//        g.printGraphWithWeights(g.adjListArrayForDirected);
        shortestPath.findShortestPath_SPFA(g, 0);
    }
}

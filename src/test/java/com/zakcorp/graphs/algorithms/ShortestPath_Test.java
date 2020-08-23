package com.zakcorp.graphs.algorithms;

import org.junit.Test;

public class ShortestPath_Test {
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
    public void testShortestPath_whenGraphIsWeightedWithNegativeEdges_BellmanFord() throws Exception {
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
    public void testShortestPath_whenGraphIsWeightedWithNegativeEdges_SPFA() throws Exception {
        ShortestPathFasterAlgorithm.DirectedGraph g = new ShortestPathFasterAlgorithm.DirectedGraph(5);
        g.addEdge(0, 1, -1);
        g.addEdge(0, 2, 4);
        g.addEdge(1, 2, 3);
        g.addEdge(1, 3, 2);
        g.addEdge(1, 4, 2);
        g.addEdge(3, 2, 5);
        g.addEdge(3, 1, 1);
        g.addEdge(4, 3, -3);
        ShortestPathFasterAlgorithm spfa = new ShortestPathFasterAlgorithm(g);
        spfa.findShortestPathFaster(0);
        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < spfa.dist.length; ++i) {
            System.out.println(i + "\t\t" + spfa.dist[i]);
        }
    }

    @Test(expected = Exception.class)
    public void testShortestPath_whenGraphHasNegativeCycles_BellmanFord() throws Exception {
        BellmanFordAlgorithm.DirectedGraph g = new BellmanFordAlgorithm.DirectedGraph(4);
        g.addEdge(0, 1, 1);
        g.addEdge(1, 2, -1);
        g.addEdge(2, 3, -1);
        g.addEdge(3, 0, -1);
        shortestPath.findShortestPath_bellmanFord(g, 0);
    }

    @Test(expected = Exception.class)
    public void testShortestPath_whenGraphHasNegativeCycles_SPFA() throws Exception {
        ShortestPathFasterAlgorithm.DirectedGraph g = new ShortestPathFasterAlgorithm.DirectedGraph(4);
        g.addEdge(0, 1, 1);
        g.addEdge(1, 2, -1);
        g.addEdge(2, 3, -1);
        g.addEdge(3, 0, -1);

    }

    @Test
    public void testAllPairShortestPath_FloydWarshall() {
        int[][] graph = { {0, 5, Integer.MAX_VALUE, 10},
                          {Integer.MAX_VALUE, 0, 3, Integer.MAX_VALUE},
                          {Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 1},
                          {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0}
                        };

        FloydWarshallAlgorithm flw = new FloydWarshallAlgorithm(graph.length);
        flw.findAllPairShortestPath(graph);
    }

}

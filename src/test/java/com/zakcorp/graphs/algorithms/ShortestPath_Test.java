package com.zakcorp.graphs.algorithms;

import org.junit.Test;
import java.util.*;

public class ShortestPath_Test {
    @Test
    public void testShortestPath_whenGraphIsUnWeighted() {
        BreadthFirstSearch.ModifiedBFS.Graph g = new BreadthFirstSearch.ModifiedBFS.Graph(8);
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
        BreadthFirstSearch.ModifiedBFS modifiedBFS = new BreadthFirstSearch.ModifiedBFS(g);
        Map<Integer, Integer[]> map = new HashMap<>();
        if( !modifiedBFS.findShortestPath(2, 6, map) ) {
            System.out.println("The destination is not found");
            return;
        }
        int distance = map.get(2)[1];
    }

    @Test
    public void testShortestPath_whenGraphIsWeighted_Dijkstra() {
        DijkstraAlgorithm.Dijkstra.Graph g = new DijkstraAlgorithm.Dijkstra.Graph(9);
        g.addEdge(0, 1, 4);
        g.addEdge(0, 7, 8);
        g.addEdge(1, 2, 8);
        g.addEdge(1, 7, 11);
        g.addEdge(2, 3, 7);
        g.addEdge(2, 5, 4);
        g.addEdge(2, 8, 2);
        g.addEdge(3, 4, 9);
        g.addEdge(3, 5, 14);
        g.addEdge(4, 5, 10);
        g.addEdge(5, 6, 2);
        g.addEdge(6, 7, 1);
        g.addEdge(6, 8, 6);
        g.addEdge(7, 8, 7);
        DijkstraAlgorithm.Dijkstra dijkstra = new DijkstraAlgorithm.Dijkstra(g);
        dijkstra.findShortestPath(0);
    }

    @Test
    public void testShortestPath_whenGraphIsWeighted_Dijkstra_PQ() {
        DijkstraAlgorithm.DijkstraPQ.Graph g = new DijkstraAlgorithm.DijkstraPQ.Graph(9);
        g.addEdge(0, 1, 4);
        g.addEdge(0, 7, 8);
        g.addEdge(1, 2, 8);
        g.addEdge(1, 7, 11);
        g.addEdge(2, 3, 7);
        g.addEdge(2, 5, 4);
        g.addEdge(2, 8, 2);
        g.addEdge(3, 4, 9);
        g.addEdge(3, 5, 14);
        g.addEdge(4, 5, 10);
        g.addEdge(5, 6, 2);
        g.addEdge(6, 7, 1);
        g.addEdge(6, 8, 6);
        g.addEdge(7, 8, 7);
        DijkstraAlgorithm.DijkstraPQ dijkstra_pQ = new DijkstraAlgorithm.DijkstraPQ(g);
        dijkstra_pQ.findShortestPath(0);
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
        BellmanFordAlgorithm bfa = new BellmanFordAlgorithm(g);
        bfa.findShortestPath(0);
        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < bfa.dist.length; ++i) {
            System.out.println(i + "\t\t" + bfa.dist[i]);
        }
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
        BellmanFordAlgorithm bfa = new BellmanFordAlgorithm(g);
        bfa.findShortestPath(0);
    }

    @Test(expected = Exception.class)
    public void testShortestPath_whenGraphHasNegativeCycles_SPFA() throws Exception {
        ShortestPathFasterAlgorithm.DirectedGraph g = new ShortestPathFasterAlgorithm.DirectedGraph(4);
        g.addEdge(0, 1, 1);
        g.addEdge(1, 2, -1);
        g.addEdge(2, 3, -1);
        g.addEdge(3, 0, -1);
        ShortestPathFasterAlgorithm spfa = new ShortestPathFasterAlgorithm(g);
        spfa.findShortestPathFaster(0);
    }

    @Test
    public void testAllPairShortestPath_FloydWarshall() {
        int[][] graph = { {0, 5, Integer.MAX_VALUE, 10},
                          {Integer.MAX_VALUE, 0, 3, Integer.MAX_VALUE},
                          {Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 1},
                          {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0}
                        };
        int V = graph.length;
        FloydWarshallAlgorithm flw = new FloydWarshallAlgorithm(V);
        flw.findAllPairShortestPath(graph);

        for(int i = 0; i < V; i++) {
            for(int j = 0; j < V; j++) {
                if(flw.distance[i][j] == Integer.MAX_VALUE)
                    System.out.print("INF ");
                else
                    System.out.print(flw.distance[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testAllPairShortestPath_FloydWarshall_1() {
        int[][] graph = { {0, 5, Integer.MAX_VALUE, 10},
                {Integer.MAX_VALUE, 0, 3, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 1},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0}
        };
        int V = graph.length;
        FloydWarshallAlgorithm flw = new FloydWarshallAlgorithm(V);
        flw.findAllPairShortestPath(graph);

        for(int i = 0; i < V; i++) {
            for(int j = 0; j < V; j++) {
                if(flw.distance[i][j] == Integer.MAX_VALUE)
                    System.out.print("INF ");
                else
                    System.out.print(flw.distance[i][j] + " ");
            }
            System.out.println();
        }
    }

}

package com.zakcorp.graphs;

import java.util.*;

public class ShortestPath {
    static class Result {
        public LinkedList<Integer> path;
        public int weight;
        public Result(LinkedList<Integer> path, int weight) {
            this.path = path;
            this.weight = weight;
        }

    }
    static class Solver {
        public int findShortestPath_whenGraphIsUnweighted(Graph g, int src, int dest) {
            return g.findShortestPath_whenGraphIsUnweighted(src, dest);
        }
        // This below implementation is
        public void findShortestPath_dijkstraPQ(Graph g, int src) {
            DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm(g);
            dijkstraAlgorithm.findShortestPath(src);

            // Print the shortest path to all the nodes
            // from the source node
            System.out.println("The shorted path from node :");
            for (int i = 0; i < dijkstraAlgorithm.dist.length; i++) {
                System.out.println(src + " to " + i + " is " + dijkstraAlgorithm.dist[i]);
            }
        }

        // This below implementation is
        public void findShortestPath_dijkstra(Graph g, int src) {
            DijkstraAlgorithmUsingBoolArray dijkstraAlgorithm = new DijkstraAlgorithmUsingBoolArray(g);
            dijkstraAlgorithm.findShortestPath(src);

            // Print the shortest path to all the nodes
            // from the source node
            System.out.println("The shorted path from node :");
            for (int i = 0; i < dijkstraAlgorithm.dist.length; i++) {
                System.out.println(src + " to " + i + " is " + dijkstraAlgorithm.dist[i]);
            }
        }

        // This below implementation is
        public void findShortestPath_bellmanFord(BellmanFordAlgorithm.DirectedGraph g, int src) throws Exception {
            BellmanFordAlgorithm bf = new BellmanFordAlgorithm(g);
            bf.findShortestPath(src);

            System.out.println("Vertex Distance from Source");
            for (int i = 0; i < bf.dist.length; ++i) {
                System.out.println(i + "\t\t" + bf.dist[i]);
            }
        }

        // This below implementation is
        public void findShortestPath_SPFA(ShortestPathFasterAlgorithm.DirectedGraph g, int src) throws Exception {
            ShortestPathFasterAlgorithm spfa = new ShortestPathFasterAlgorithm(g);
            spfa.findShortestPathFaster(src);

            System.out.println("Vertex Distance from Source");
            for (int i = 0; i < spfa.dist.length; ++i) {
                System.out.println(i + "\t\t" + spfa.dist[i]);
            }
        }
    }
}

package com.zakcorp.graphs;

import java.util.*;

/**
 * Created by Zakir Hussain B on 21/08/20.
 *
 * @source: CP-Algorithm
 * @topic: Graph
 * @sub-topic: ShortestPath
 * @platform: GeeksForGeeks, cp-algorithms.com
 * @problem_link: https://cp-algorithms.com/graph/bellman_ford.html, https://www.geeksforgeeks.org/shortest-path-faster-algorithm/
 * @pseudocode: Shortest Path Faster Algorithm (SPFA)
 * SPFA is an improvement of the Bellman-Ford algorithm.
 *
 * TODO:- It is efficient when compared to Bellman-Ford
 * TODO:- The worst case of this algorithm is equal to the O(nm) of the Bellman-Ford, but in practice it works much faster
 * TODO:- and some people claim that it works even in O(m) on average.
 *
 * dist[V] // result array of minimum distance, output
 * boolean inqueue[V]
 * counter[V];
 * spfa(source):
 *      for all u in V:
 *          dist(u) = Infinity
 *      dist[src] = 0
 *      Queue q;
 *      q.add(src)
 *      inqueue[src] = true;
 *      while(!q.isEmpty())
 *          u = q.poll()
 *          inqueue[u] = false
 *          for all v in u:
 *              if(dist[u] != INT_MAX && dist[v.node] > dist[u] + v.cost)
 *                  dist[v.node] = dist[u] + v.cost
 *                  if(!inqueue[v.node])
 *                      queue.add(v.node)
 *                      inqueue[v.node] = true;
 *                      counter[v.node]++;
 *                      if(counter[v.node] > V)
 *                          throw -> "Negative Cycle Detected"
 */
public class ShortestPathFasterAlgorithm {
    DirectedGraph g;
    int[] dist;
    boolean[] inQueue;
    int[] counter; // Maintain a counter to detect -ve cycles
    static class DirectedGraph {
        static class Vertex {
            private int node;
            private int cost;
            public Vertex(int node, int cost) {
                this.node = node;
                this.cost = cost;
            }
        }
        private int vertex;
        private LinkedList<Vertex>[] adjListArray;
        public DirectedGraph(int vertex) {
            this.vertex = vertex;
            adjListArray = new LinkedList[vertex];
            for(int i = 0; i < vertex; i++) {
                adjListArray[i] = new LinkedList<>();
            }
        }
        public void addEdge(int u, int v, int cost) {
            adjListArray[u].add(new Vertex(v, cost));
        }
//        public void printGraph() { }
    }
    public ShortestPathFasterAlgorithm(DirectedGraph g) {
        this.g = g;
        dist = new int[g.vertex];
        inQueue = new boolean[g.vertex];
        counter = new int[g.vertex];
    }
    public void findShortestPathFaster(int src) throws Exception {
        for(int i = 0;i < g.vertex; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        inQueue[src] = true;
        while( !queue.isEmpty() ) {
            int u = queue.poll();
            inQueue[u] = false;
            for(DirectedGraph.Vertex v : g.adjListArray[u]) {
                if(dist[u] != Integer.MAX_VALUE && dist[v.node] > dist[u] + v.cost) {
                    dist[v.node] = dist[u] + v.cost;
                    if( !inQueue[v.node] ) {
                        queue.add(v.node);
                        inQueue[v.node] = true;
                        counter[v.node]++;
                        if(counter[v.node] > g.vertex) {
                            throw new Exception("Negative Cycle Detected");
                        }
                    }
                }
            }
        }
    }
}
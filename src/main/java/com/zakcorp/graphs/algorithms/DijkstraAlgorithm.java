package com.zakcorp.graphs.algorithms;

import java.util.*;

public class DijkstraAlgorithm {
    /**
     * Created by Zakir Hussain B on 21/08/20.
     *
     * @source: General
     * @topic: Graph
     * @sub-topic: ShortestPath
     * @platform: GeeksForGeeks
     * @problem_link: https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-greedy-algo-7/
     * @pseudocode: Dijkstra Algorithm Using a Boolean Array
     * dijkstra(src):
     * // V -> No. of vertex in the graph
     * dist[V] // result array of minimum distance, output
     * settled[T/F] // boolean array to mark settled/relaxed nodes
     * dijkstra(src):
     *      for all u in V:
     *          dist(u) = Infinity
     *      dist[src] = 0
     *      for all v in V:
     *         u = getMinimumDistNode();
     *         settled[u] = true
     *         explore(u)
     *
     *  explore(u):
     *      for all v in u:
     *          if( settled does not contain "v" )
     *              dist[v] = min(dist[v], dist[u] + length(u, v))
     *              pq.add(v)
     */
    static class Dijkstra {
        Graph g;
        int[] dist;
        boolean[] settled;
        static class Graph {
            private int V;
            private LinkedList<Vertex>[] adjListArray;
            static class Vertex {
                private int node;
                private int cost;
                public Vertex(int node, int cost) {
                    this.node = node;
                    this.cost = cost;
                }
            }
            public Graph(int V) {
                this.V = V;
                adjListArray = new LinkedList[V];
                for(int i = 0; i < V; i++) {
                    adjListArray[i] = new LinkedList<>();
                }
            }
            public void addEdge(int u, int v, int cost) {
                adjListArray[u].add(new Vertex(v, cost));
                adjListArray[v].add(new Vertex(u, cost));
            }
        }
        public Dijkstra(Graph g) {
            this.g = g;
            dist = new int[g.V];
            settled = new boolean[g.V];
        }
        public void findShortestPath(int src) {
            for(int i = 0; i < g.V; i++) {
                dist[i] = Integer.MAX_VALUE;
            }
            dist[src] = 0;
            settled[src] = true;
            for(int i = 1; i < g.V; i++) {
                int u = getMinDistNode();
                settled[u] = true;
                explore(u);
            }
        }
        private void explore(int u) {
            for(Graph.Vertex v : g.adjListArray[u]) {
                if( !settled[v.node] && dist[u] != Integer.MAX_VALUE ) {
                    dist[v.node] = Math.min(dist[v.node], dist[u] + v.cost);
                }
            }
        }
        private int getMinDistNode() {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int v = 0; v < g.V; v++) {
                if( !settled[v] && dist[v] <= min) {
                    min = Math.min(min, dist[v]);
                    minIndex = v;
                }
            }
            return minIndex;
        }
    }
    /**
     * Created by Zakir Hussain B on 20/08/20.
     *
     * @source: General
     * @topic: Graph
     * @sub-topic: ShortestPath
     * @platform: GeeksForGeeks
     * @problem_link: https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-in-java-using-priorityqueue/
     * @pseudocode: DijkstraAlgorithm using PriorityQueue
     * // V -> No. of vertex in the graph
     * dist[V] // result array of minimum distance, output
     * PriorityQueue<> pq // To maintain vertices
     * settled<set> // mark nodes that are already settled/relaxed
     * dijkstra(src):
     *      for all u in V:
     *          dist(u) = Infinity
     *      pq.add(src, 0)
     *      dist[src] = 0
     *      while(settled.size != V)
     *         u = pq.remove()
     *         settled.add(u)
     *         explore(u)
     *
     *  explore(u):
     *      for all v in u:
     *          if( settled does not contain "v" )
     *              dist[v] = min(dist[v], dist[u] + length(u, v))
     *              pq.add(v)
     */
    static class DijkstraPQ {
        Graph g;
        int[] dist;
        PriorityQueue<Graph.Vertex> pq;
        Set<Integer> settledNodes;
        static class Graph {
            private int V;
            private LinkedList<Vertex>[] adjListArray;
            static class Vertex implements Comparator<Vertex> {
                private int node;
                private int cost;
                public Vertex() {};
                public Vertex(int node, int cost) {
                    this.node = node;
                    this.cost = cost;
                }
                @Override
                public int compare(Vertex v1, Vertex v2) {
                    return Integer.compare(v1.cost, v2.cost);
                }
            }
            public Graph(int V) {
                this.V = V;
                adjListArray = new LinkedList[V];
                for(int i = 0; i < V; i++) {
                    adjListArray[i] = new LinkedList<>();
                }
            }
            public void addEdge(int u, int v, int cost) {
                adjListArray[u].add(new Vertex(v, cost));
                adjListArray[v].add(new Vertex(u, cost));
            }
        }
        public DijkstraPQ(Graph g) {
            this.g = g;
            pq = new PriorityQueue<>(g.V, new Graph.Vertex());
            settledNodes = new HashSet<>();
        }
        public void findShortestPath(int src) {
            for(int i = 0; i < g.V; i++) {
                dist[i] = Integer.MAX_VALUE;
            }
            dist[src] = 0;
            pq.add(new Graph.Vertex(src, 0));
            while( settledNodes.size() != g.V ) {
                int u = pq.remove().node;
                settledNodes.add(u);
                explore(u);
            }
        }
        private void explore(int u) {
            for(Graph.Vertex v : g.adjListArray[u]) {
                if( !settledNodes.contains(v.node) ) {
                    dist[v.node] = Math.min(dist[v.node], dist[u] + v.cost);
                    pq.add(new Graph.Vertex(v.node, dist[v.node]));
                }
            }
        }
    }
}
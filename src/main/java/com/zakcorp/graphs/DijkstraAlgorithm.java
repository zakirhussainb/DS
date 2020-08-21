package com.zakcorp.graphs;

import java.util.*;

/**
 * Created by Zakir Hussain B on 20/08/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode: DijkstraAlgorithm using PriorityQueue
 * dist[] // result array of minimum distance, output
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
public class DijkstraAlgorithm {
    private Graph g;
    public int[] dist;
    private Set<Integer> settledNodes;
    private PriorityQueue<Vertex> pq;
    public DijkstraAlgorithm(Graph g) {
        this.g = g;
        dist = new int[g.vertex];
        settledNodes = new HashSet<>();
        pq = new PriorityQueue<>(g.vertex, new Vertex());
    }
    public void findShortestPath(int src) {
        for (int i = 0; i < g.vertex; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        pq.add(new Vertex(src, 0));
        dist[src] = 0;
        while( settledNodes.size() != g.vertex ) {
            // remove a node from the PQ (The node with minimum distance will be removed)
            int u = pq.remove().node;
            // adding the node whose distance is finalized
            settledNodes.add(u);
            // explore "u"
            exploreNeighbours(u);
        }
    }

    private void exploreNeighbours(int u) {
        // All the neighbors of "u"
        for(Vertex v : g.adjListArrayWithWeights[u]) {
            // If current node of the neighbour "v" hasn't already been settled/relaxed
            if ( !settledNodes.contains(v.node) ) {
                // If the new distance is cheaper in cost, update the distance
                dist[v.node] = Math.min(dist[v.node], dist[u] + v.cost);
                // Add the current node to the PQ.
                pq.add(new Vertex(v.node, dist[v.node]));
            }
        }
    }
}
class Vertex implements Comparator<Vertex> {
    public int node;
    public int cost;
    public Vertex() { }
    public Vertex(int node, int cost) {
        this.node = node;
        this.cost = cost;
    }
    @Override
    public int compare(Vertex node1, Vertex node2) {
        return Integer.compare(node1.cost, node2.cost);
    }
}
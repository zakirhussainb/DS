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
 */
public class DijkstraAlgorithm {
    private Graph g;
    public int dist[];
    private Set<Integer> settled;
    private PriorityQueue<Vertex> pq;
    public DijkstraAlgorithm(Graph g) {
        this.g = g;
        dist = new int[g.vertex];
        settled = new HashSet<>();
        pq = new PriorityQueue<>(g.vertex, new Vertex());
    }
    public void findShortestPath(int src) {
        for (int i = 0; i < g.vertex; i++)
            dist[i] = Integer.MAX_VALUE;
        pq.add(new Vertex(src, 0));
        dist[src] = 0;
        while( settled.size() != g.vertex ) {
            // remove the minimum distance node
            // from the priority queue
            int u = pq.remove().node;

            // adding the node whose distance is
            // finalized
            settled.add(u);

            exploreNeighbours(u);
        }
    }

    private void exploreNeighbours(int u) {
        int edgeDistance = -1;
        int newDistance = -1;

        // All the neighbors of u
        for (int i = 0; i < g.adjListArrayWithWeights[u].size(); i++) {
            Vertex v = g.adjListArrayWithWeights[u].get(i);

            // If current node hasn't already been processed
            if ( !settled.contains(v.node) ) {
                edgeDistance = v.cost;
                newDistance = dist[u] + edgeDistance;

                // If new distance is cheaper in cost
                dist[v.node] = Math.min(dist[v.node], newDistance);

                // Add the current node to the queue
                pq.add(new Vertex(v.node, dist[v.node]));
            }
        }
    }
}
class Vertex implements Comparator<Vertex> {
    public int node;
    public int cost;

    public Vertex()
    {
    }

    public Vertex(int node, int cost)
    {
        this.node = node;
        this.cost = cost;
    }

    @Override
    public int compare(Vertex node1, Vertex node2)
    {
        return Integer.compare(node1.cost, node2.cost);
    }
}
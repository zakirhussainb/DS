package com.zakcorp.graphs;

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
public class DijkstraAlgorithmUsingBoolArray {
    Graph g;
    int[] dist;
    boolean[] settled;

    public DijkstraAlgorithmUsingBoolArray(Graph g) {
        this.g = g;
        dist = new int[g.vertex];
        settled = new boolean[g.vertex];
    }
    public void findShortestPath(int src) {
        for(int i = 0; i < g.vertex; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;
        // Find Shortest Path for all vertices
        for(int i = 0; i < g.vertex - 1; i++) {
            int u = getMinDistanceNode();
            settled[u] = true;
            exploreNeighbours(u);
        }
    }

    private void exploreNeighbours(int u) {
        for(Vertex v : g.adjListArrayWithWeights[u]) {
            if( !settled[v.node] && dist[u] != Integer.MAX_VALUE) {
                dist[v.node] = Math.min(dist[v.node], dist[u] + v.cost);
            }
        }
    }

    private int getMinDistanceNode() {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int v = 0; v < g.vertex; v++) {
            if( !settled[v] && dist[v] <= min) {
                min = Math.min(min, dist[v]);
                minIndex = v;
            }
        }
        return minIndex;
    }

}
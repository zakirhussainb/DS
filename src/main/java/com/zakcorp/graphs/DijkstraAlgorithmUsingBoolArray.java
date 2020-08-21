package com.zakcorp.graphs;

/**
 * Created by Zakir Hussain B on 21/08/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
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
        for(int v = 0; v < g.vertex - 1; v++) {
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
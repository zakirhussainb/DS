package com.zakcorp.graphs.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zakir Hussain B on 26/08/20.
 *
 * @source: General
 * @topic: Graphs
 * @sub-topic: Minimum Cost Spanning Tree
 * @platform: GeeksForGeeks, CP-algorithm
 * @problem_link: https://cp-algorithms.com/graph/mst_kruskal.html, https://cp-algorithms.com/graph/mst_kruskal_with_dsu.html,
 * @pseudocode:
 */
public class KruskalsAlgorithm {
    static class Graph {
        int V;
        List<Edge> edgeList;
        static class Edge {
            int u;
            int v;
            int weight;
            public Edge(int u, int v, int weight) {
                this.u = u;
                this.v = v;
                this.weight = weight;
            }
        }
        public Graph(int V) {
            this.V = V;
            edgeList = new ArrayList<>();
        }
        public void addEdge(int u, int v, int weight) {
            edgeList.add(new Edge(u, v, weight));
        }
    }
    /**
     * Sorting the edge requires
     *  O(M log N) + (N(for all edges) * N(for all child in parent))
     *  => O(M log N + N * N)
     *  => O(M log N + N^2)
     */
    static class NaiveImpl {
        Graph g;
        int[] parent;
        public NaiveImpl(Graph g) {
            this.g = g;
            parent = new int[g.V];
            for(int i = 0; i < g.V; i++) {
                parent[i] = i;
            }
        }
        /**
         * This algorithm takes O(N log N + N^2) time
         * @return
         */
        public List<Graph.Edge> kruskalsMST() {
            // The edgeList is already sorted, so that will take O(N log N) time
            List<Graph.Edge> resultList = new ArrayList<>();
            for(Graph.Edge e : g.edgeList) { // This for loop takes O(E) time
                if( parent[e.u] != parent[e.v] ) {
                    resultList.add(e);
                    int u = parent[e.u];
                    int v = parent[e.v];
                    for(int i = 0; i < g.V; i++) { // This for loop takes O(V) time
                        if(parent[i] == u) {
                            parent[i] = v;
                        }
                    }
                }
            } // Both for loops take O(N^2) time
            return resultList;
        }
    }

    /**
     * In the efficient implementation we use the "find" and "union" methods from
     * "Weighted Quick Union With Path Compression"
     * Also the edgeList is always sorted in ascending order, to provide the edge with minimum weight.
     * This algorithm takes only O(M log N) time.
     */
    static class EfficientImpl {
        DisjointSetUnion.WeightedQuickUnionPathCompression wqupc;
        Graph g;
        public EfficientImpl(Graph g) {
            this.g = g;
            wqupc = new DisjointSetUnion.WeightedQuickUnionPathCompression(g.V);
        }
        /**
         * The time complexity will be
         *  O(M log N + M(initializing the parent[] in wqupc) + N (iterating over all the edges))
         *      => O(M log N + M + N)
         *      => O(M log N);;
         * @return
         */
        public List<Graph.Edge> kruskalsMST() {
            // The edgeList is already sorted, so that will take O(N log N) time
            List<Graph.Edge> resultList = new ArrayList<>();
            for(Graph.Edge e : g.edgeList) { // This for loop takes O(N)
                if( wqupc.find(e.u) != wqupc.find(e.v) ) { // Two finds take O(1) and O(1) each
                    resultList.add(e);
                    wqupc.union(e.u, e.v); // This union takes O(1)
                }
            }// This for loop takes -> O(N) + O(1) + O(1)
            return resultList;
        }

    }

}
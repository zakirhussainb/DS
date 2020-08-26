package com.zakcorp.graphs.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Zakir Hussain B on 26/08/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class KruskalsAlgorithm {

    static class NaiveImpl {

    }

    static class EfficientImpl {
        DisjointSetUnion.WeightedQuickUnionPathCompression wqupc;
        int[] parent;
        int[] rank;
        Graph g;
        static class Graph {
            int V;
            List<Edge> edgeList;
            static class Edge implements Comparator<Edge> {
                int u;
                int v;
                int weight;
                public Edge(int u, int v, int weight) {
                    this.u = u;
                    this.v = v;
                    this.weight = weight;
                }
                @Override
                public int compare(Edge e1, Edge e2) {
                    return Integer.compare(e1.weight, e2.weight);
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
        public EfficientImpl(Graph g) {
            this.g = g;
            wqupc = new DisjointSetUnion.WeightedQuickUnionPathCompression(g.V);
            parent = new int[g.V];
            rank = new int[g.V];
            for(int i = 0; i < g.V; i++) {
                parent[i] = i;
            }
        }

        public List<Graph.Edge> kruskalsMST() {
            int weight = 0;
            List<Graph.Edge> resultList = new ArrayList<>();
            for(Graph.Edge e : g.edgeList) {
                if( wqupc.find(e.u) != wqupc.find(e.v) ) {
                    weight += e.weight;
                    resultList.add(e);
                    wqupc.union(e.u, e.v);
                }
            }
            return resultList;
        }

    }

}
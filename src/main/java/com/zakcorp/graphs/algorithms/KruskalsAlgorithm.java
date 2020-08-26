package com.zakcorp.graphs.algorithms;

import java.util.ArrayList;
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
        }
        public EfficientImpl(Graph g) {
            this.g = g;
            parent = new int[g.V];
            rank = new int[g.V];
        }

    }

}
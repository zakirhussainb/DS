package com.zakcorp.graphs.algorithms;

import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by Zakir Hussain B on 25/08/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class PrimsAlgorithm {
    static class Graph {
        int V;
        LinkedList<Vertex>[] adjListArray;
        static class Vertex implements Comparator<Vertex> {
            private int node;
            private int cost;
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
            for (int i = 0; i < V; i++) {
                adjListArray[i] = new LinkedList<>();
            }
        }
        public void addEdge(int u, int v, int cost) {
            adjListArray[u].add(new Vertex(v, cost));
            adjListArray[v].add(new Vertex(u, cost));
        }
    }
    public void primsMST(Graph g) {
        boolean[] mst = new boolean[g.V];
        // Stores the parent of a vertex
        int[] parent = new int[g.V];
        Graph.Vertex[] edges = new Graph.Vertex[g.V];
        for() {

        }
    }
}
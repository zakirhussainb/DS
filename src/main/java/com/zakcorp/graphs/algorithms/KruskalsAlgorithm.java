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
        int[] parent;
        int[] size;
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
            parent = new int[g.V];
            size = new int[g.V];
            for(int i = 0; i < g.V; i++) {
                parent[i] = i;
            }
        }
        public int find(int a) {
            validate(a);
            int root = a;
            while(root != parent[root]) {
                root = parent[root];
            }
            while(a != root) {
                int newA = parent[a];
                parent[a] = root;
                a = newA;
            }
            return root;
        }
        // Validate that p is a valid index
        private void validate(int a) {
            int n = parent.length;
            if(a < 0 || a >= n)
                throw new IllegalArgumentException("index " + a + " is not between 0 and " + (n - 1));
        }
        /**
         * Merges the set containing element {a} with the
         * the set containing element {b}.
         */
        public void union(int a, int b) {
            int rootA = find(a);
            int rootB = find(b);
            if(rootA == rootB)
                return;
            // make smaller root point to larger one
            if(size[rootA] < size[rootB]) {
                int temp = parent[rootB];
                parent[rootB] = parent[rootA];
                parent[rootA] = temp;
            }
            parent[rootB] = rootA;
            if(size[rootA] == size[rootB]) {
                size[rootA]++;
            }
        }
        public List<Graph.Edge> kruskalsMST() {
            List<Graph.Edge> resultList = new ArrayList<>();
            for(Graph.Edge e : g.edgeList) {
                if( find(e.u) != find(e.v) ) {
                    resultList.add(e);
                    union(e.u, e.v);
                }
            }
            return resultList;
        }

    }

}
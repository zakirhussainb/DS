package com.zakcorp.graphs.algorithms;

import java.util.*;

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
    Graph g;
    int[] parent;
    boolean[] selected;
    Graph.Vertex[] min_edges;
    TreeSet<Graph.Vertex> treeSet;
    static class Graph {
        int V;
        LinkedList<Vertex>[] adjListArray;
        static class Vertex implements Comparator<Vertex> {
            private int node;
            private int cost;
            public Vertex() { }
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
    public PrimsAlgorithm(Graph g) {
        this.g = g;
        parent = new int[g.V];
        selected = new boolean[g.V];
        min_edges = new Graph.Vertex[g.V];
        treeSet = new TreeSet<>(new Graph.Vertex());
        Arrays.fill(parent, -1);
    }
    public void primsMST() {
        int total_weight = 0;
        min_edges[0].cost = 0;
        treeSet.add(new Graph.Vertex(0, 0));
        for(int i = 0; i < g.V; i++) {
            if(treeSet.isEmpty()) {
                System.out.println("NO MST! ");
                return;
            }
            Graph.Vertex v = treeSet.first();
            selected[v.node] = true;
            total_weight += v.cost;
            treeSet.pollFirst();

            if(min_edges[v.node].node != -1) {
                System.out.print(v + " " + min_edges[v.node].node + "\n");
            }

            for(Graph.Vertex e : g.adjListArray[v.node]) {
                if( !selected[e.node] && e.cost < min_edges[e.node].cost ) {
                    treeSet.remove(min_edges[e.node]);
                    min_edges[e.node] = new Graph.Vertex(e.node, e.cost);
                    treeSet.add(new Graph.Vertex(e.node, e.cost));
                    parent[e.node] = v.node;
                }
            }
        }
        System.out.println(" " + total_weight);
    }
}
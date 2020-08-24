package com.zakcorp.graphs.problems;

import com.zakcorp.leetcodemaster.Problem_100;

import java.util.*;

/**
 * Created by Zakir Hussain B on 24/08/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Routes {
    public static void main(String[] args) {
        Solver p = new Solver();
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            out.printLine(p.solve1(in, out));
            out.flush();
            out.close();
        } catch (Exception e){
        }
    }
    static class Solver {
        static class Graph {
            private int V;
            private LinkedList<Vertex>[] adjListArray;
            static class Vertex {
                private int src;
                private int dest;
                private int time;
                private int cost;
                public Vertex(int src, int dest, int time,
                              int cost) {
                    this.src = src;
                    this.dest = dest;
                    this.time = time;
                    this.cost = cost;
                }
            }
            public Graph(int V) {
                this.V = V;
                adjListArray = new LinkedList[V];
                for(int i = 0; i < V; i++) {
                    adjListArray[i] = new LinkedList<>();
                }
            }
            public void addEdge(int src, int dest, int time, int cost) {
                adjListArray[src].add(new Vertex(src, dest, time, cost));
            }
        }
        public int solve1(InputReader in, OutputWriter out) {
            int K = in.readInt();
            int V = in.readInt();
            int E = in.readInt();
            Graph g = new Graph(V);
            for(int e = 0; e < E; e++) {
                g.addEdge(in.readInt(), in.readInt(), in.readInt(), in.readInt());
            }
            int src = in.readInt();
            int dest = in.readInt();
            findShortestPath(K, V, E, g, src, dest);
            findTimeAndDistance(K, V, E, g, src, dest);
        }
        private void findShortestPath(int k, int v, int e, Graph g, int src, int dest) {

        }
        static class Pair {
            int time;
            int cost;
            public Pair(int time, int cost) {
                this.time = time;
                this.cost = cost;
            }
            public static Pair of(int time, int cost){
                return new Pair(time, cost);
            }
        }
        public int[] findTimeAndDistance(int k, int v, int e, Graph g, int src, int dest) {
            boolean[] settled = new boolean[v];
            Pair[] pairs = new Pair[v];
            pairs[src] = new Pair(0,0);
            for(int i = 1; i < v; i++) {
                int u = getMinimumDistance();
                settled[u] = true;
                explore(u, g, settled, pairs);
            }
        }
        private void explore(int u, Graph g, boolean[] settled, Pair[] pairs) {
            for(Graph.Vertex v : g.adjListArray[u]) {
                if( !settled[v.src] ) {
                    // First compute for time
                    pairs[v.src] = Math.min(pairs[v.src], );
                    // Compute for cost
                }
            }
        }
        private int getMinimumDistance() {

        }
    }
}
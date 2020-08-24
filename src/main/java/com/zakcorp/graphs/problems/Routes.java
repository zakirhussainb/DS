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
                private int node;
                private int time;
                private int cost;
                public Vertex(int node, int time,
                              int cost) {
                    this.node = node;
                    this.time = time;
                    this.cost = cost;
                }
            }
            public Graph(int V) {
                this.V = V;
                adjListArray = new LinkedList[V];
                for(int i = 1; i < V; i++) {
                    adjListArray[i] = new LinkedList<>();
                }
            }
            public void addEdge(int src, int dest, int time, int cost) {
                adjListArray[src].add(new Vertex(dest, time, cost));
                adjListArray[dest].add(new Vertex(src, time, cost));
            }
        }
        static class Pair {
            int time;
            int cost;
            public Pair() { }
            public Pair(int time, int cost) {
                this.time = time;
                this.cost = cost;
            }
            public static Pair of(int time, int cost){
                return new Pair(time, cost);
            }
        }
        public int solve1(InputReader in, OutputWriter out) {
            int K = in.readInt();
            int V = in.readInt();
            int E = in.readInt();
            Graph g = new Graph(V + 1);
            for(int e = 0; e < E; e++) {
                g.addEdge(in.readInt(), in.readInt(), in.readInt(), in.readInt());
            }
            int src = in.readInt();
            int dest = in.readInt();
//            findShortestPath(K, V, E, g, src, dest);
            Pair[] pairs = findTimeAndDistance(K, V, g, src);
            out.printLine(pairs[dest]);
            return 0;
        }
        private void findShortestPath(int k, int v, int e, Graph g, int src, int dest) {

        }
        public Pair[] findTimeAndDistance(int k, int v, Graph g, int src) {
            boolean[] settled = new boolean[v];
            Pair[] pairs = new Pair[v];
            for(int i = 0; i < g.V; i++) {
                pairs[i] = new Pair(Integer.MAX_VALUE,Integer.MAX_VALUE);
            }
            pairs[src] = new Pair(0,0);
            for(int i = 1; i < v; i++) {
                int u = getMinimumDistance(g, settled, pairs);
                settled[u] = true;
                explore(k, u, g, settled, pairs);
            }
            return pairs;
        }
        private void explore(int k, int u, Graph g, boolean[] settled, Pair[] pairs) {
            for(Graph.Vertex v : g.adjListArray[u]) {
                if( !settled[v.node] && pairs[u].cost != Integer.MAX_VALUE && pairs[u].time != Integer.MAX_VALUE ) {
                    // First compute for time
                    int time = Math.min(pairs[v.node].time, pairs[u].time + v.time);
                    // Compute for cost
                    int cost = Math.min(pairs[v.node].cost, pairs[u].cost + v.cost);
                    pairs[v.node] = Pair.of(time, cost);
                }
            }
        }
        private int getMinimumDistance(Graph g, boolean[] settled, Pair[] pairs) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int v = 0; v < g.V; v++) {
                if(!settled[v] && pairs[v].cost <= min) {
                    min = Math.min(min, pairs[v].cost);
                    minIndex = v;
                }
            }
            return minIndex;
        }
    }
}
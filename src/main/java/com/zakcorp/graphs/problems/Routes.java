package com.zakcorp.graphs.problems;

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
            int N = in.readInt();
            int V = in.readInt();
            int E = in.readInt();
            for() {

            }
        }
    }
}
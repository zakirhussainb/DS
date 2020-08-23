package com.zakcorp.graphs.problems;

import java.util.*;

/**
 * Created by Zakir Hussain B on 17/08/20.
 *
 * @source: HackerEarth General
 * @topic: Graph
 * @sub-topic: DFS
 * @platform: HackerEarth
 * @problem_link: https://www.hackerearth.com/practice/algorithms/graphs/graph-representation/practice-problems/algorithm/so-np-c559f406/description/
 */
public class SoNP {
    static class Graph {
        int V;
        LinkedList<Integer>[] adjListArray;
        public Graph(int V) {
            this.V = V;
            adjListArray = new LinkedList[V];
            for(int i = 0; i < V; i++) {
                adjListArray[i] = new LinkedList<>();
            }
        }
        public void addEdge(int u, int v) {
            adjListArray[u].add(v);
            adjListArray[v].add(u);
        }
        public void bfs(int src, boolean[] visited, Queue<Integer> queue) {
            queue.add(src);
            visited[src] = true;
            while( !queue.isEmpty() ) {
                int s = queue.poll();
                for(int u : adjListArray[s]) {
                    if( !visited[u] ) {
                        queue.add(u);
                        visited[u] = true;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Solver p = new Solver();
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int n = in.readInt();
            int m = in.readInt();
            int edges = m;
            int k = in.readInt();
            Graph g = new Graph(n + 1);
            while(m --> 0) {
                g.addEdge(in.readInt(), in.readInt());
            }
            out.printLine(p.solve1(g, edges, n, k));
            out.flush();
            out.close();
        } catch (Exception e){
        }
    }
    public static class Solver {
        public int solve1(Graph g, int m, int n, int k) {
            int cc = 0;
            boolean[] visit = new boolean[g.V];
            Queue<Integer> queue = new LinkedList<>();
            for(int i = 1; i < g.V; i++) {
                if( !visit[i] ) {
                    g.bfs(i, visit, queue);
                    cc++;
                }
            }
            if(cc > k) {
                return -1;
            } else {
                return m - (n - k);
            }
        }
    }
}
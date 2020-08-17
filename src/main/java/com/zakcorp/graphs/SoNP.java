package com.zakcorp.graphs;

import java.util.LinkedList;
import java.util.Queue;

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
            boolean[] visit = new boolean[g.vertex];
            Queue<Integer> queue = new LinkedList<>();
            for(int i = 1; i < g.vertex; i++) {
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
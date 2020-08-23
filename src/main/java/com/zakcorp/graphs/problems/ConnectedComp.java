package com.zakcorp.graphs.problems;

import com.zakcorp.graphs.InputReader;
import com.zakcorp.graphs.OutputWriter;

/**
 * Created by Zakir Hussain B on 17/08/20.
 *
 * @source: https://www.codechef.com/LRNDSA08?order=desc&sortBy=successful_submissions
 * @topic: Graph
 * @sub-topic: DFS
 * @platform: HackerEarth
 * @problem_link: https://www.geeksforgeeks.org/connected-components-in-an-undirected-graph/,
 * https://www.hackerearth.com/problem/algorithm/connected-components-in-a-graph/
 */
public class ConnectedComp {
    public static void main(String[] args) {
        Solver p = new Solver();
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int n = in.readInt();
            Graph g = new Graph(n + 1);
            int e = in.readInt();
            while(e --> 0) {
                g.addEdge(in.readInt(), in.readInt());
            }
            out.printLine(p.solve1(g));
            out.flush();
            out.close();
        } catch (Exception e){
        }
    }
    public static class Solver {
        public int solve1(Graph g) {
            int cc = 0;
            boolean[] visit = new boolean[g.vertex];
            for(int i = 1; i < g.vertex; i++) {
                if( !visit[i] ) {
                    g.dfsRec(i, visit);
                    cc++;
                }
            }
            return cc;
        }
    }
}
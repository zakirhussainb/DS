package com.zakcorp.graphs.problems;

import org.apache.xmlbeans.impl.xb.ltgfmt.Code;

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
public class CodeForces_1033A {
    Graph g;
    static class Graph {
        int V;
        int[][] adjMat;
        public Graph(int V) {
            this.V = V;
            adjMat = new int[V][V];
        }
    }
    public static void main(String[] args) {
        Solver p = new Solver();
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            p.solve1(in, out);
            out.flush();
            out.close();
        } catch (Exception e){
        }
    }
    public CodeForces_1033A(Graph g) {
        this.g = g;
    }
    static class Solver {
        public void solve1(InputReader in, OutputWriter out) {
            int V = in.readInt();
            int q1 = in.readInt();
            int q2 = in.readInt();
            int k1 = in.readInt();
            int k2 = in.readInt();
            int c1 = in.readInt();
            int c2 = in.readInt();
            CodeForces_1033A.Graph g = new CodeForces_1033A.Graph(V + 1);
            g.adjMat[q1][q2] = 1;
            for(int i = 1; i < g.adjMat.length; i++) {
                for(int j = 1; j < g.adjMat[i].length; j++) {
                    if(g.adjMat[i][j] == g.adjMat[q1][q2]) {

                    }
                }
            }

        }

    }
}
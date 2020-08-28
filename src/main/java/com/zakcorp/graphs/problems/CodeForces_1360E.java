package com.zakcorp.graphs.problems;

/**
 * Created by Zakir Hussain B on 27/08/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class CodeForces_1360E {
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
    static class Solver {
        public void solve1(InputReader in, OutputWriter out) {
            int tc = in.readInt();
            while(tc --> 0) {
                int n = in.readInt();
                int[][] mat = new int[n][n];
                for(int i = 0; i < n; i++) {
                    for(int j = 0; j < n; j++) {
                        mat[i][j] = in.readInt();
                    }
                }
                boolean answer = true;
                for(int i = n - 2; i >= 0; i--) {
                    for(int j = n - 2; j >= 0; j--) {
                        if (mat[i][j] == 1 && mat[i + 1][j] == 0 && mat[i][j + 1] == 0) {
                            answer = false;
                            break;
                        }
                    }
                }
                out.printLine(answer ? "YES" : "NO");
            }
        }
    }
}
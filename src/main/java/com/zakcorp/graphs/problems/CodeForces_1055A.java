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
public class CodeForces_1055A {
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
            int N = in.readInt();
            int S = in.readInt();
            int[] arr1 = new int[N + 1];
            int[] arr2 = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                arr1[i] = in.readInt();
            }
            for (int i = N; i > 0; i--) {
                arr2[i] = in.readInt();
            }
            int bob = 1;
            while(bob < N) {
                if(bob == S) {
                    if(arr1[S] == 0) {
                        bob++;
                    } else if(arr2[S] == 1) {

                    }
                } else {
                    bob++;
                }
            }
        }
    }
}
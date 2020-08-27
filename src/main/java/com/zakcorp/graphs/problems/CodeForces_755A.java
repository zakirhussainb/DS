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
public class CodeForces_755A {
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
            for(int m = 1; m < 1001; m++) {
                int ans = N * m + 1;
                if (!isPrime(ans)) {
                    out.printLine(m);
                    break;
                }
            }
        }
        public boolean isPrime(int num) {
            if(num <= 1){
                return false;
            }
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }

    }
}
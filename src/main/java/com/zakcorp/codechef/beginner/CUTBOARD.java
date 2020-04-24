package com.zakcorp.codechef.beginner;

class CUTBOARD {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                int M = in.readInt();
                System.out.println(new Solver().solve(N, M));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public int solve(int N, int M) {
            return (N - 1) * (M - 1);
        }
    }
}


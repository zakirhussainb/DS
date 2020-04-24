package com.zakcorp.codechef.beginner;

class PPSUM {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int D = in.readInt();
                int N = in.readInt();
                System.out.println(new Solver().solve(D, N));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public int solve(int D, int N) {
            if(D < 1) {
                return N;
            }
            return solve(D - 1, sum(N));
        }
        public int sum(int N) {
            if(N < 1) {
                return 0;
            }
            return N + sum(N - 1);
        }
    }
}


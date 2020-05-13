package com.zakcorp.codechef.beginner;

class PCJ18B {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                out.printLine(new Solver().solve(N));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public int solve(int N) {
            int sum = 0;
            for(; N > 0; N = N - 2) {
                sum += N * N;
            }
            return sum;
        }
    }
}

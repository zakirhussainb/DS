package com.zakcorp.codechef.beginner;

class TWONMS {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                long A = in.readInt();
                long B = in.readInt();
                long N = in.readInt();
                out.printLine(new Solver().solve(A, B, N));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public long solve(long A, long B, long N) {
            for(int i = 1; i <= N; i++){
                if(i % 2 == 0) {
                    B = B * 2;
                } else {
                    A = A * 2;
                }
            }
            return Math.max(A, B) / Math.min(A, B);
        }
    }
}


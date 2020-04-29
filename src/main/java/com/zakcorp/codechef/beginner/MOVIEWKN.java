package com.zakcorp.codechef.beginner;

class MOVIEWKN {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                int[] L = new int[N];
                int[] R = new int[N];
                for(int i = 0; i < N; i++){
                    L[i] = in.readInt();
                }
                for(int i = 0; i < N; i++){
                    R[i] = in.readInt();
                }
                out.printLine(new Solver().solve(N, L, R));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public int solve(int N, int[] L, int[] R) {
            int maxLR = 0;
            int maxR = 0;
            int resIndex = 0;
            for(int i = 0; i < N; i++) {
                if(L[i] * R[i] > maxLR) {
                    maxLR = L[i] * R[i];
                    maxR = R[i];
                    resIndex = i + 1;
                } else if(L[i] * R[i] == maxLR) {
                    if(R[i] > maxR) {
                        maxR = R[i];
                        resIndex = i + 1;
                    }
                }
            }
            return resIndex;
        }
    }
}


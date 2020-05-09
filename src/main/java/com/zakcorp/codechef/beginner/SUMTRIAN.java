package com.zakcorp.codechef.beginner;

import java.util.Arrays;

class SUMTRIAN {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                int[][] arr = new int[N][N];
                for(int i = 0; i < N; i++) {
                    for(int j = 0; j < i + 1; j++) {
                        arr[i][j] = in.readInt();
                    }
                }
                out.printLine(new Solver().solve(arr, N));
            }
            out.flush();
            out.close();
        } catch (Exception e){
        }
    }
    static class Solver {
        public int solve(int[][] arr, int N) {
            for(int i = N - 2; i >= 0; i--) {
                for(int j = 0; j < i + 1; j++) {
                    arr[i][j] += Math.max(arr[i + 1][j], arr[i + 1][j + 1]);
                }
            }
            return arr[0][0];
        }
    }
}


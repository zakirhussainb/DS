package com.zakcorp.codechef.beginner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class MSNSADM1 {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                int[] A = new int[N];
                int[] B = new int[N];
                for(int i = 0; i < N; i++) {
                    A[i] = in.readInt();
                }
                for(int i = 0; i < N; i++) {
                    B[i] = in.readInt();
                }
                out.printLine(new Solver().solve(A, N, B));
            }
            out.flush();
            out.close();
        } catch (Exception e){
        }
    }
    static class Solver {
        public int solve(int[] A, int N, int[] B) {
           int max = Integer.MIN_VALUE;
           for(int i = 0; i < N; i++) {
               max = Math.max(max, A[i] * 20 - B[i] * 10);
           }
           return Math.max(max, 0);
        }
    }
}


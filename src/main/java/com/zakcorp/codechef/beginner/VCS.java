package com.zakcorp.codechef.beginner;

import java.util.*;

class VCS {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                int M = in.readInt();
                int K = in.readInt();
                int[] mArr = new int[M];
                for(int i = 0; i < M; i++) {
                    mArr[i] = in.readInt();
                }
                int[] kArr = new int[K];
                for(int i = 0; i < K; i++) {
                    kArr[i] = in.readInt();
                }
                out.printLine(new Solver().solve(mArr, kArr, N, M, K));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(int[] mArr, int[] kArr, int N, int M, int K) {
            int tiCounter = 0;
            int uuCounter = 0;
            int[] mBin = new int[N + 1];
            int[] kBin = new int[N + 1];
            for(int i = 0; i < M; i++) {
                mBin[mArr[i]] = 1;
            }
            for(int i = 0; i < K; i++) {
                kBin[kArr[i]] = 1;
            }
            for(int i = 1; i <= N; i++) {
                if(mBin[i] == kBin[i]) {
                    if(mBin[i] == 1) {
                        tiCounter++;
                    } else {
                        uuCounter++;
                    }
                }
            }
            return tiCounter + " " + uuCounter;
        }
    }
}

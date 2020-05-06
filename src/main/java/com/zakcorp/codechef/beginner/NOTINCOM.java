package com.zakcorp.codechef.beginner;

import java.util.*;

class NOTINCOM {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                int M = in.readInt();
                int[] aliceCollection = new int[N];
                int[] bertaCollection = new int[M];
                for(int i = 0; i < N; i++) {
                    aliceCollection[i] = in.readInt();
                }
                for(int i = 0; i < M; i++) {
                    bertaCollection[i] = in.readInt();
                }
                out.printLine(new Solver().solve2(aliceCollection, N, bertaCollection, M));
            }
            out.flush();
            out.close();
        } catch (Exception e){
        }
    }
    static class Solver {
        public int solve(int[] aliceCollection, int N, int[] bertaCollection, int M) {
            Arrays.sort(aliceCollection);
            Arrays.sort(bertaCollection);
            int counter = 0;
            int i = 0, j = 0;
            while(i < N && j < M) {
                if(aliceCollection[i] < bertaCollection[j]) {
                    i++;
                } else if(aliceCollection[i] > bertaCollection[j]) {
                    j++;
                } else if(aliceCollection[i] == bertaCollection[j]) {
                    counter++;
                    i++;
                    j++;
                }
            }
            return counter;
        }
        public int solve1(int[] aliceCollection, int N, int[] bertaCollection, int M) {
            int counter = 0;
            Set<Integer> set = new HashSet<>();
            if(N > M) {
                for(int i = 0; i < N; i++) {
                    set.add(aliceCollection[i]);
                }
                for(int j = 0; j < M; j++) {
                    if(set.contains(bertaCollection[j])) {
                        counter++;
                    }
                }
            } else {
                for(int i = 0; i < M; i++) {
                    set.add(bertaCollection[i]);
                }
                for(int j = 0; j < N; j++) {
                    if(set.contains(aliceCollection[j])) {
                        counter++;
                    }
                }
            }
            return counter;
        }
        public int solve2(int[] aliceCollection, int N, int[] bertaCollection, int M) {
            int[] A = new int[1000010];
            int[] B = new int[1000010];
            for(int i = 0; i < N; i++){
                A[aliceCollection[i]]++;
            }
            for(int i = 0; i < M; i++){
                B[bertaCollection[i]]++;
            }
            int counter = 0;
            for(int i = 0; i < 1000010; i++) {
                if(A[i] == 1 && B[i] == 1) {
                    counter++;
                }
            }
            return counter;
        }
    }
}


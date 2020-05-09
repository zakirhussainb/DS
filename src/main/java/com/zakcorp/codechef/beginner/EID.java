package com.zakcorp.codechef.beginner;

import java.util.Arrays;

class EID {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                int[] arr = new int[N];
                for(int i = 0; i < N; i++) {
                    arr[i] = in.readInt();
                }
                out.printLine(new Solver().solve(arr, N));
            }
            out.flush();
            out.close();
        } catch (Exception e){
        }
    }
    static class Solver {
        public int solve(int[] arr, int N) {
            int min = Integer.MAX_VALUE;
            Arrays.sort(arr);
            for(int i = 1; i < N; i++) {
                min = Math.min(min, arr[i] - arr[i - 1]);
            }
            return min;
        }
        public int solve1(int[] arr, int n) {
            // Brute Force -> O(n^2)
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < n; i++) {
                for(int j = i + 1; j < n; j++) {
                    if(arr[j] > arr[i]) {
                        min = Math.min(min, arr[j] - arr[i]);
                    } else {
                        min = Math.min(min, arr[i] - arr[j]);
                    }
                }
            }
            return min;
        }
    }
}


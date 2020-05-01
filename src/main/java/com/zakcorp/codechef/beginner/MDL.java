package com.zakcorp.codechef.beginner;

import java.util.Arrays;

class MDL {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                int[] arr = new int[N];
                for(int i = 0; i < N; i++){
                    arr[i] = in.readInt();
                }
                out.printLine(new Solver().solve(arr, N));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(int[] arr, int N) {
            for(int i = 0; i < N; i++){
               int[] tripArr = new int[3];
               tripArr[0] = arr[i];
               tripArr[1] = arr[i + 1];
               tripArr[2] = arr[i + 2];
               removeMedian(tripArr);
            }
            return "";
        }
        private int[] removeMedian(int[] tripArr) {
            int[] res = new int[2];
            Arrays.sort(tripArr);
            res[0] = tripArr[0];
            res[1] = tripArr[2];
            return res;
        }
    }
}


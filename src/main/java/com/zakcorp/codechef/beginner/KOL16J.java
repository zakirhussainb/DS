package com.zakcorp.codechef.beginner;

import java.util.Arrays;

class KOL16J {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int n = in.readInt();
                int[] arr = new int[n];
                for(int i = 0; i < n; i++) {
                    arr[i] = in.readInt();
                }
                out.printLine(new Solver().solve(arr, n));
            }
            out.flush();
            out.close();
        } catch (Exception e){
        }
    }
    static class Solver {
        public String solve(int[] arr, int n) {
            int counter = 0;
            for(int i = 1; i < n; i++) {
                if(arr[i - 1] < arr[i] || arr[i - 1] > arr[i]) {
                    counter++;
                }
            }
            if(counter == n - 1){
                return "yes";
            }
            return "no";
        }
    }
}


package com.zakcorp.codechef.beginner;

import java.util.Arrays;

class SMPAIR {
    public static void main(String[] args) throws Exception {
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
                System.out.println(new Solver().solve1(arr));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public long solve(long[] arr) {
            Arrays.sort(arr);
            return arr[0] + arr[1];
        }
        public int solve1(int[] arr) {
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            for(int num : arr) {
                if(num < min1) {
                    min2 = min1;
                    min1 = num;
                } else if(num < min2) {
                    min2 = num;
                }
            }
            return min1 + min2;
        }
    }
}


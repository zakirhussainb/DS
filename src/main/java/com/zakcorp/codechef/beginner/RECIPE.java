package com.zakcorp.codechef.beginner;

class RECIPE {
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
                System.out.println(new Solver().solve(arr, N));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(int[] arr, int N) {
            StringBuilder sb = new StringBuilder();
            // We need to find the gcd here because we need a common value that can be used to divide
            // all the ingredients. i.e.
            // The problem here is divide all numbers by some constant so that the divisions
            // have no remainder.
            int gcd = arr[0];
            for (int i = 1; i < N; i++) {
                gcd = findGCD(gcd, arr[i]);
            }
            for (int i = 0; i < N; i++) {
                arr[i] = arr[i] / gcd;
            }
            for(int i=0;i<N;i++)
                sb.append(arr[i]).append(" ");
            return sb.toString().trim();
        }
        public int findGCD(int a, int b) {
            if(a == 0)
                return b;
            return findGCD(b % a, a);
        }
    }
}


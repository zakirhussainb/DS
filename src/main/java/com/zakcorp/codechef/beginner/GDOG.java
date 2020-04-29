package com.zakcorp.codechef.beginner;

class GDOG {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                int K = in.readInt();
                System.out.println(new Solver().solve(N, K));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public int solve(int N, int K) {
            int max = Integer.MIN_VALUE;
            // Because from a minimum of 1, to a maximum of K.
            // Consider a case where N = 11 and K = 11, then
            // the maximum profit(5) for the puppy will be when K = 6;
            for(int i = 1; i <= K; i++) {
                if(max < N % i){
                    max = N % i;
                }
            }
            return max;
        }
    }
}


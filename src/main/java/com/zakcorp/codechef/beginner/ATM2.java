package com.zakcorp.codechef.beginner;

class ATM2 {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                int K = in.readInt();
                int[] arr = new int[N];
                for(int i = 0; i < N; i++){
                    arr[i] = in.readInt();
                }
                out.printLine(new Solver().solve(N, K, arr));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(int N, int K, int[] arr) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < N; i++) {
                if(K >= arr[i]) {
                    K = K - arr[i];
                    sb.append("1");
                } else {
                    sb.append("0");
                }
            }
            return sb.toString();
        }
    }
}


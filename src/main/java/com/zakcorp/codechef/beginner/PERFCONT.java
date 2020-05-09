package com.zakcorp.codechef.beginner;

class PERFCONT {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                int P = in.readInt();
                int[] arr = new int[N];
                for(int i = 0; i < N; i++) {
                    arr[i] = in.readInt();
                }
                out.printLine(new Solver().solve(arr, N, P));
            }
            out.flush();
            out.close();
        } catch (Exception e){
        }
    }
    static class Solver {
        public String solve(int[] arr, int N, int P) {
            int cakeWalkCounter = 0, hardCounter = 0;
           int div2 = P / 2;
           int div10 = P / 10;
           for(int i = 0; i < N; i++) {
               if(arr[i] >= div2) {
                   cakeWalkCounter++;
               }
               if(arr[i] <= div10) {
                   hardCounter++;
               }
           }
           return (cakeWalkCounter == 1 && hardCounter == 2) ? "yes" : "no";
        }
    }
}


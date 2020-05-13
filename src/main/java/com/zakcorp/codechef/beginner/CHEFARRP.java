package com.zakcorp.codechef.beginner;

class CHEFARRP {
    public static void main(String[] args) {
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
        } catch (Exception e){}
    }
    static class Solver {
        public int solve(int[] arr, int N) {
            int counter = 0;
            for(int i = 0; i < N; i++) {
                int sum = 0;
                int product = 1;
                for(int j = i; j < N; j++) {
                    sum += arr[j];
                    product *= arr[j];
                    if(sum == product){
                        counter++;
                    }
                }
            }
            return counter;
        }
    }
}

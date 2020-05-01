package com.zakcorp.codechef.beginner;

class BIT2A {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0){
                int N = in.readInt();
                int[] arr = new int[N];
                for(int i = 0; i < N; i++){
                    arr[i] = in.readInt();
                }
                out.printLine(new Solver().solve(N, arr));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(int N, int[] arr) {
            int[] resArr = new int[N];
            int k = 0;
            for(int i = 0; i < N; i++){
                int counter = 0;
                for(int j = i + 1; j < N; j++) {
                    if(arr[i] < arr[j]) {
                        resArr[k] = ++counter;
                    }
                }
                k++;
            }
            StringBuilder sb = new StringBuilder();
            for(int num : resArr){
                sb.append(num).append(" ");
            }
            return sb.toString().trim();
        }
    }
}


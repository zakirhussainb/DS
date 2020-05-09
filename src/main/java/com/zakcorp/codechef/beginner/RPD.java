package com.zakcorp.codechef.beginner;

class RPD {
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
        public int solve(int[] arr, int n) {
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++) {
                for(int j = i + 1; j < n; j++) {
                    int prod = arr[i] * arr[j];
                    int sum = 0;
                    while(prod > 0){
                        sum += prod % 10;
                        prod /= 10;
                    }
                    max = Math.max(max, sum);
                }
            }
            return max;
        }
    }
}


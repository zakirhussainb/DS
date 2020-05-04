package com.zakcorp.codechef.beginner;

class PRGIFT {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int n = in.readInt();
                int k = in.readInt();
                int[] arr = new int[n];
                for(int i = 0; i < n; i++) {
                    arr[i] = in.readInt();
                }
                out.printLine(new Solver().solve(arr, n, k));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(int[] arr, int n, int k) {

            for(int i = 0; i < n; i++) {
                if(k == 0) {
                    return "yes";
                }
                if(k == 1)
                if(arr[i] % 2 == 0 && arr[i + 1] % 2 == 0) {
                    k = k - 2;
                }
            }
            return "yes";
        }
    }
}


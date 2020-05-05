package com.zakcorp.codechef.beginner;

class WATSCORE {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                int[] arr = new int[11];
                for(int i = 0; i < N; i++) {
                    int P = in.readInt();
                    int S = in.readInt();
                    arr[P - 1] = Math.max(arr[P - 1], S);
                }
                int sum = 0;
                for(int i = 0; i < 8; i++) {
                    sum += arr[i];
                }
                out.printLine(sum);
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
}


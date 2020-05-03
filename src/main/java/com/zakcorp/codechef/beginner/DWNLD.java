package com.zakcorp.codechef.beginner;

class DWNLD {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                int K = in.readInt();
                int amount = 0;
                while(N --> 0) {
                    int T = in.readInt();
                    int D = in.readInt();
                    if(K >= T) {
                        K = K - T;
                    } else {
                        amount = amount + ((T - K) * D);
                        K = 0;
                    }
                }
                out.printLine(amount);
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
}
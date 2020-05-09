package com.zakcorp.codechef.beginner;

import java.util.Stack;

class COPS {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int[] hashArr = new int[101];
                int M = in.readInt();
                int x = in.readInt();
                int y = in.readInt();
                for(int i = 0; i < M; i++) {
                    int mH = in.readInt();
                    hashArr[mH] = 1;
                    int prod = x * y;
                    int k = Math.max(1, mH - prod);
                    int l = Math.min(mH + prod, 100);
                    for(int j = k; j <= l; j++){
                        hashArr[j] = 1;
                    }
                }
                int counter = 0;
                for(int i = 1; i <= 100; i++) {
                    if(hashArr[i] == 0) {
                        counter++;
                    }
                }
                out.printLine(counter);
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
}

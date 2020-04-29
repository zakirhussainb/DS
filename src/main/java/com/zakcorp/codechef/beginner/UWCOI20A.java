package com.zakcorp.codechef.beginner;

import java.util.ArrayList;
import java.util.List;

class UWCOI20A {
    public static void main(String[] args) throws Exception {
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
                int max = 0;
                for(int num : arr) {
                    max = Math.max(num, max);
                }
                out.printLine(max);
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
}


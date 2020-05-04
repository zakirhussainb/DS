package com.zakcorp.codechef.beginner;

import java.util.Arrays;

class RECTANGL {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int[] arr = new int[4];
                for(int i = 0; i < 4; i++) {
                    arr[i] = in.readInt();
                }
                Arrays.sort(arr);
                out.printLine(arr[0] == arr[1] && arr[2] == arr[3] ? "YES" : "NO");
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
}


package com.zakcorp.codechef.beginner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class CHEFSQ {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                StringBuilder sb1 = new StringBuilder();
                for(int i = 0; i < N; i++) {
                    sb1.append(in.readInt());
                    sb1.append(".");
                }
                int F = in.readInt();
                StringBuilder sb2 = new StringBuilder();
                for(int i = 0; i < F; i++) {
                    sb2.append(in.readInt());
                    sb2.append(".");
                }
                out.printLine(sb1.toString().contains(sb2.toString()) ? "Yes" : "No");
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
}


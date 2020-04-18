package com.zakcorp.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class CHOPRT {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int A = in.readInt();
                int B = in.readInt();
                System.out.println(new Solver().solve(A, B));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(int A, int B) {
            if(A < B){
                return "<";
            } else if(A > B) {
                return ">";
            } else {
                return "=";
            }
        }
    }
}


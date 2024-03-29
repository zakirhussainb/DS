package com.zakcorp.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class CIELRCPT {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int num = in.readInt();
                System.out.println(new Solver().solve(num));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public int solve(int num) {
            int minMenus = 0;
            for(int i = 2048; i > 0; i = i / 2) {
                while(num - i >= 0) {
                    num = num - i;
                    minMenus++;
                }
            }
            return minMenus;
        }
    }
}


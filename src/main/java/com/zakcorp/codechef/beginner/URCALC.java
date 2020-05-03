package com.zakcorp.codechef.beginner;

import java.util.HashSet;
import java.util.Set;

class URCALC {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int A = in.readInt();
            int B = in.readInt();
            String C = in.readString();
            out.printLine(new Solver().solve(A, B, C));
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public double solve(int A, int B, String C) {
            switch (C) {
                case "+":
                    return A + B;
                case "-":
                    return A - B;
                case "*":
                    return A * B;
                case "/":
                    return (double)A / B;
            }
            return 0;
        }
    }
}
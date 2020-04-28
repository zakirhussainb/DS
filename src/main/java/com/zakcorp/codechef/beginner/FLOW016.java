package com.zakcorp.codechef.beginner;

import java.text.DecimalFormat;

class FLOW016 {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                long A = in.readInt();
                long B = in.readInt();
                System.out.println(new Solver().solve(A, B));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(long A, long B) {
            long gcd = findGCD(A, B);
            long lcm = (A * B) / gcd;
            return gcd + " " + lcm;
        }
        private long findGCD(long a, long b) {
            if(a == 0){
                return b;
            }
            return findGCD(b % a, a);
        }
    }
}


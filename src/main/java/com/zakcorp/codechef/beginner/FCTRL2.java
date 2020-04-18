package com.zakcorp.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

class FCTRL2 {
    // The reason for using BigInteger is:-
    // An integer t, 1<=t<=100, denoting the number of test cases, followed by t lines,
    // each containing a single integer n, 1<=n<=100.
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int tc = Integer.parseInt(br.readLine());
            while(tc --> 0) {
                String str = br.readLine();
                System.out.println(new Solver().solve(str));
            }
        } catch (Exception e){}
    }
    static class Solver {
        public BigInteger solve(String str) {
            BigInteger num = new BigInteger(str);
            BigInteger sum = BigInteger.ONE;
            while(num.compareTo(BigInteger.ZERO) > 0) {
                sum = sum.multiply(num);
                num = num.subtract(BigInteger.ONE);
            }
            return sum;
        }
    }
}


package com.zakcorp.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class FLOW018 {
    // The reason for using BigInteger is:-
    // An integer t, 1<=T<=1000, denoting the number of test cases, followed by t lines,
    // each containing a single integer n, 0 ≤ N ≤ 20.
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
        public long solve(String str) {
            long num = Long.parseLong(str);
            long sum = 1;
            while(num > 0) {
                sum = sum * num;
                num--;
            }
            return sum;
        }
    }
}


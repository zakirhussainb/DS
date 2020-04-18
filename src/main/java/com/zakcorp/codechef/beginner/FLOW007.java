package com.zakcorp.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class FLOW007 {
    public static void main(String[] args) throws Exception {
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
        public int solve(String str) {
            int num = Integer.parseInt(str);
            int sum = 0;
            while(num > 0) {
                int rem = num % 10;
                sum = sum * 10 + rem;
                num = num/10;
            }
            return sum;
        }
    }
}


package com.zakcorp.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class REMISS {
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
        public String solve(String str) {
            String[] splitArr = str.split("\\s+");
            int A = Integer.parseInt(splitArr[0]);
            int B = Integer.parseInt(splitArr[1]);
            int realMin = Math.max(A, B);
            int realMax = A + B;
            return realMin + " " + realMax;
        }
    }
}


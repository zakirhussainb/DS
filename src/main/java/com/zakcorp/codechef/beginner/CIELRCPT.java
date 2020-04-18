package com.zakcorp.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class CIELRCPT {
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


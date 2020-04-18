package com.zakcorp.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class LUCKFOUR {
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
            char[] chars = str.toCharArray();
            int fourCounter = 0;
            for(char ch : chars) {
                if(ch - '0' == 4){
                    fourCounter++;
                }
            }
            return fourCounter;
        }
    }
}


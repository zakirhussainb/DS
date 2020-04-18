package com.zakcorp.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class DIFFSUM {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            System.out.println(new Solver().solve(n1, n2));
        }catch (Exception e){}
    }
    static class Solver {
        public int solve(int n1, int n2) {
            return n1 > n2 ? n1 - n2 : n1 + n2;
        }
    }
}


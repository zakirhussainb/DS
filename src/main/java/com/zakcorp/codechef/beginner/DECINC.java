package com.zakcorp.codechef.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DECINC {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int num = Integer.parseInt(br.readLine());
            System.out.println(new Solver().solve(num));
        }catch (Exception e){}
    }
    static class Solver {
        public int solve(int num) {
            return num % 4 == 0 ? ++num : --num;
        }
    }
}


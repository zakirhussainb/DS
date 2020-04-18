package com.zakcorp.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class FLOW017 {
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
        public int solve(String str) {
            String[] splitArr = str.split("\\s+");
            int[] arr = new int[splitArr.length];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(splitArr[i]);
            }
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            for(int num : arr) {
                if(num >= max1) {
                    max2 = max1;
                    max1 = num;
                } else if(num >= max2) {
                    max2 = num;
                }
            }
            return max2;
        }
    }
}


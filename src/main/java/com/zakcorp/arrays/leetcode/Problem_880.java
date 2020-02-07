package com.zakcorp.arrays.leetcode;

public class Problem_880 {
    // Decoded String At Index
    public static void main(String[] args) {
        String S = "ha22";
        int K = 5;
        String output = decodeAtIndex(S, K);
        System.out.println("output..." + output);
    }

    public static String decodeAtIndex(String S, int K){
        long size = 0;
        int N = S.length();

        for(int i = 0; i < N; i++){
            char c = S.charAt(i);
            if(Character.isDigit(c)){
                size = size * c - '0';
            } else {
                size++;
            }
        }

        return null;
    }
}

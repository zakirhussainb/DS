package com.zakcorp.arrays.fivehundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_2_0 {
    /*
           1. Check if subarray with 0 sum is exists or not -> 1 variation
                1.1 boolean isZeroSumExists(arr);    -> (sum == 0) return true;
     */
    public static void main(String[] args) throws IOException {
        Array_2_0 p = new Array_2_0();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String str = br.readLine();
            String[] splitArr = str.split("\\s+");
            int[] intArr = new int[splitArr.length];
            for(int i = 0; i < splitArr.length; i++) {
                intArr[i] = Integer.parseInt(splitArr[i]);
            }
            System.out.println(p.isZeroSumExists(intArr));
        }
    }

    private boolean isZeroSumExists(int[] arr) {
        // O(N)
        int sum = 0;
        for (int value : arr) {
            sum = sum + value;
            if (sum == 0) {
                return true;
            }
        }
        return false;
    }

}

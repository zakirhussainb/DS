package com.zakcorp.arrays.fivehundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem_13 {
    /*
        Find maximum product of two integers in an array

        Given an array of integers, find maximum product of two integers in an array.

        Consider, {-10, -3, 5, 6, -2} -> O/P: {-10, -3} or {5, 6}
     */
    public static void main(String[] args) throws IOException {
        Problem_13 p = new Problem_13();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str1 = br.readLine();
            String[] splitArr1 = str1.split("\\s+");
            int[] intArr1 = new int[splitArr1.length];
            for (int i = 0; i < splitArr1.length; i++) {
                intArr1[i] = Integer.parseInt(splitArr1[i]);
            }
            System.out.println(Arrays.toString(p.getPairOfMaxProduct(intArr1)));
        }
    }

    private int[] getPairOfMaxProduct(int[] X) {
//        X[] = { -10, -3, 5, 6, -2 }
        int maxProduct = 0;
        for(int i = 0; i < X.length; i++) {
            int product = 0;
            int j = i + 1;
            product = X[i] * X[j];
            if(product > maxProduct) {
//                maxProduct = product;
                return new int[]{X[i], X[j]};
            }
        }
        return null;
    }
}

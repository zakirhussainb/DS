package com.zakcorp.arrays.fivehundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem_10 {
    /*
        In-place merge two sorted arrays

     */
    public static void main(String[] args) throws IOException {
        Problem_10 p = new Problem_10();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str1 = br.readLine();
            String[] splitArr1 = str1.split("\\s+");
            int[] intArr1 = new int[splitArr1.length];
            for (int i = 0; i < splitArr1.length; i++) {
                intArr1[i] = Integer.parseInt(splitArr1[i]);
            }
            String str2 = br.readLine();
            String[] splitArr2 = str2.split("\\s+");
            int[] intArr2 = new int[splitArr2.length];
            for (int i = 0; i < splitArr2.length; i++) {
                intArr2[i] = Integer.parseInt(splitArr2[i]);
            }
            p.mergeTwoSortedArraysInPlace(intArr1, intArr2);
            String str = "SAMPLE";
            System.out.println(str.toLowerCase());
//            p.mergeTwoSortedArraysToSingleArray(intArr1, 3, intArr2, 3);
//            System.out.println(Arrays.toString(intArr1));
//            System.out.println(Arrays.toString(intArr2));
        }
    }

    private void mergeTwoSortedArraysInPlace(int[] X, int[] Y) {
        // arr1 -> 1 4 7 8 10
        // arr2 -> 2 3 9
        int m = X.length;
        int n = Y.length;
        for(int i = 0; i < m; i++) {
            if(X[i] > Y[0]){
                //swap
                int temp = X[i];
                X[i] = Y[0];
                Y[0] = temp;

                int first = Y[0];
                int k;
                for(k = 1; k < n && Y[k] < first; k++){
                    Y[k - 1] = Y[k];
                }
                Y[k - 1] = first;
            }
        }
        System.out.println(Arrays.toString(X));
        System.out.println(Arrays.toString(Y));
    }

    private void mergeTwoSortedArraysToSingleArray(int[] X, int m, int[] Y, int n) {
        // X - 1 2 3 0 0 0;  m - 3;   Y - 2 5 6;   n - 3
        while(m > 0 && n > 0) {
            X[m + n - 1] = (X[m - 1] > Y[n - 1]) ? X[--m] : Y[--n];
        }
        System.arraycopy(Y,0, X, 0, n);
        System.out.println(Arrays.toString(X));
        System.out.println(Arrays.toString(Y));

    }
}

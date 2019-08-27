package com.zakcorp.arrays.fivehundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem_11 {
    /*
        Merge two arrays by satisfying given constraints

        Given two sorted arrays X[] and Y[] of size m and n each where m &gt;= n and X[] has exactly n vacant cells,
        merge elements of Y[] in their correct position in array X[] i.e. merge (X, Y) by keeping the sorted order

        For example,
        Input
        X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0}
        Y[] = { 1, 8, 9, 10, 15 }

        The vacant cells in X[] is represented by 0
        Output:
        X[] = { 1, 2, 3, 5, 6, 8, 9, 10, 15 }
     */
    public static void main(String[] args) throws IOException {
        Problem_11 p = new Problem_11();
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
            p.mergeTwoSortedArraysByConstraintsToOneArray(intArr1, intArr2);
        }
    }

    private void mergeTwoSortedArraysByConstraintsToOneArray(int[] X, int[] Y) {
//        X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0}
        int k = 0;
        for (int i = 0; i < X.length; i++){
            if(X[i] != 0){
                X[k++] = X[i];
            }
        }
        int m = k;
        for(int i = k; i < X.length; i++){
            X[i] = 0;
        }
        int n = Y.length;
        while(m > 0 && n > 0){
            X[m + n - 1] = (X[m - 1] > Y[n - 1]) ? X[--m] : Y[--n];
        }
        System.arraycopy(Y, 0, X, 0, n);
        System.out.println(Arrays.toString(X));
    }
}

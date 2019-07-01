package com.zakcorp.arrays.basic;

import java.util.Scanner;

/**
 * @author : Zakir
 * Result: Correct Answer
 * Execution Time: 0.17
 * TODO: Look at the N size in the problem. Dont use binarysearch unnecessarily for very small size.
 */
public class GFGArrB004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T --> 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int s = sc.nextInt();
            System.out.println(findIndex(N, arr, s));
        }
    }

    private static int findIndex(int n, int[] arr, int s) {
        for(int i = 0; i < n; i++) {
            if(arr[i] == s) {
                return i;
            }
        }
        return -1;
    }
}

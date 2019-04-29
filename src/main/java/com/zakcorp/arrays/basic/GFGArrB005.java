package com.zakcorp.arrays.basic;

import java.util.Scanner;

public class GFGArrB005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T --> 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int arr[] = new int[N];
            for(int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            for(int j = N - M; j >= 0; j--) {
                System.out.print(arr[j] + " ");
            }
            for(int k = M; k < N; k++) {
                System.out.print(arr[k] + " ");
            }
        }
    }
}

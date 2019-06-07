package com.zakcorp.arrays.basic;

import java.util.Scanner;
/**
 * @author : Zakir
 * Result: Correct Answer
 * Execution Time: 2.12
 * TODO:
 */
public class GFGArrB005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T --> 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] arr = new int[N];
            for(int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            reverseArray(arr, N, M);
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < N; i++) {
                sb.append(arr[i]).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }

    private static void reverseArray(int[] arr, int n, int m) {
        for(int i = 0; i < n; i += m) {
            int left = i;
            int right = Math.min(i + m - 1, n - 1);
            int temp;
            while (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left += 1;
                right -= 1;
            }
        }
    }
}

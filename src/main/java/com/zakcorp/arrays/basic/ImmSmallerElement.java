package com.zakcorp.arrays.basic;

import java.util.Scanner;
/**
 * @author : Zakir
 * Result: Correct Answer
 * Execution Time: 1.74
 * TODO: Remember that this solution throws TLE when used a resultArray to store new elements instead use StringBuilder
 */
public class ImmSmallerElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T --> 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            printImmediateSmallerElement(N,arr);
        }
    }
    private static void printImmediateSmallerElement(int n, int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            if(j != n) {
                if(arr[i] > arr[j]) {
                    sb.append(arr[j]).append(" ");
                } else {
                    sb.append("-1 ");
                }
            }
        }
        sb.append(-1);
        System.out.println(sb);
    }
}

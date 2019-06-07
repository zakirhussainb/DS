package com.zakcorp.arrays.basic;

import java.util.Scanner;
/**
 * @author : Zakir
 * Result: Correct Answer
 * Execution Time: 0.26
 * TODO:
 */
public class GFGArrB006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T --> 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for(int i = k; i < n; i++) {
                sb.append(arr[i]).append(" ");
            }
            for(int i = 0; i < k; i++) {
                sb.append(arr[i]).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}

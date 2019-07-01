package com.zakcorp.arrays.basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Zakir
 * Result: Correct Answer
 * Execution Time: 2.48
 * TODO: Need to find an efficient solution for this problem, In O(n) time.
 */
public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T --> 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            if(isTriplet(arr)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
    private static boolean isTriplet(int[] arr) {
        Arrays.sort(arr);
        for (int m = arr.length - 1; m >=0; m--) {
            double c = Math.pow(arr[m], 2);
            double a;
            double b;
            for(int i = 0; i < arr.length - 1; i++) {
                a = Math.pow(arr[i], 2);
                for(int j = i + 1; j < arr.length - 1; j++) {
                    b = Math.pow(arr[j], 2);
                    if(a + b == c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

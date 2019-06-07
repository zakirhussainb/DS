package com.zakcorp.gfg.md.course.arrays;

import java.util.Scanner;
/**
 * @author : Zakir
 * Question: Missing number in an array
 * Result: Correct Answer
 * Execution Time: 1.66
 * TODO:
 */
public class MDGFG_Arr01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T --> 0) {
            int N = sc.nextInt();
            int[] arr = new int[N - 1];
            for(int i = 0; i < N - 1; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(findMissingNumber(N, arr));
        }
    }

    private static int findMissingNumber(int n, int[] arr) {
        int array_sum = 0;
        for(int i = 1; i <= n; i++) {
            array_sum += i;
        }
        int sum = 0;
        for(int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }
        return array_sum - sum;
    }
}

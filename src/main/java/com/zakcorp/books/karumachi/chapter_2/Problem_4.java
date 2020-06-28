package com.zakcorp.books.karumachi.chapter_2;

import java.util.Arrays;

public class Problem_4 {
    /**
     * Generate all strings length n drawn from 0...k - 1.
     */
    private static int[] arr;
    public static void main(String[] args) {
        Problem_4 p = new Problem_4();
        arr = new int[2];
        p.k_string(arr.length, 5);
    }
    private void k_string(int n, int k) {
        if(n < 1) {
            System.out.println(Arrays.toString(arr));
        } else {
            for(int i = 0; i < k; i++) {
                arr[n - 1] = i;
                k_string(n - 1, k);
            }
        }
    }
}

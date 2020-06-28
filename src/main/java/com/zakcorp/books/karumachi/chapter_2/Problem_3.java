package com.zakcorp.books.karumachi.chapter_2;

import java.util.Arrays;

public class Problem_3 {
    /**
     * Generate all strings  of n bits. Assume[0,....n-1] is an array of size n.
     */
    private static int[] arr;
    public static void main(String[] args) {
        Problem_3 p = new Problem_3();
        arr = new int[4];
        p.binary(arr.length);
    }
    private void binary(int n) {
        if(n < 1) {
            System.out.println(Arrays.toString(arr));
        } else {
            arr[n - 1] = 0;
            binary(n - 1);
            arr[n - 1] = 1;
            binary(n - 1);
        }
    }
}

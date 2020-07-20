package com.zakcorp.leetcodemaster;

import java.util.Arrays;

public class Problem_976 {
    /*
        1. Given that a <= b <= c, then there exists a triangle if "a + b < c".
        2. Perimeter of triangle => a + b + c, where a,b,c are the sides/lengths of the triangle.
     */
    public int largestPerimeter(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = n - 1; i > 1; i--) {
            if(arr[i - 2] + arr[i - 1] > arr[i]) {
                return arr[i - 2] + arr[i - 1] + arr[i];
            }
        }
        return 0;
    }
}

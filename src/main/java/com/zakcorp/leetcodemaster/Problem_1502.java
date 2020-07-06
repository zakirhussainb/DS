package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int num = arr[1] - arr[0];
        int n = arr.length;
        for(int i = 2; i < n; i++) {
            if(arr[i] - arr[i - 1] != num) {
                return false;
            }
        }
        return true;
    }
}

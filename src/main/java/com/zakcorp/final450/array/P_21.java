package com.zakcorp.final450.array;

import java.math.BigInteger;

/* Reverse the array */
public class P_21 {
    static class Solver {
        // Produces TLE
        public boolean solve1(int[] arr, int n) {
            for(int i = 0; i < n; i++) {
                int sum = arr[i];
                if(sum == 0)
                    return true;
                for(int j = i + 1; j < n; j++) {
                    sum += arr[j];
                    if(sum == 0)
                        return true;
                }
            }
            return false;
        }
        public boolean solve2(int[] arr, int n) {

        }
    }
}

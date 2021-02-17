package com.zakcorp.final450.array;

import java.math.BigInteger;
import java.util.*;

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
        // This below code can be re-written to find the sub array sum for a given K.
        public boolean solve2(int[] arr, int n) {
            int k = 0;
            int sum = 0;
            Set<Integer> hSet = new HashSet<>();
            for(int i = 0; i < n; i++) {
                sum += arr[i];
                if(arr[i] == k || sum == k || hSet.contains(sum)) {
                    return true;
                }
                hSet.add(sum);
            }
            return false;
        }
    }
}

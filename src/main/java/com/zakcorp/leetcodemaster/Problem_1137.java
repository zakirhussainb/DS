package com.zakcorp.leetcodemaster;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Problem_1137 {
    static class Solver {
        public int tribonacci(int n) {
            if(n == 0) {
                return 0;
            }
            if(n == 1 || n == 2) {
                return 1;
            }
            int t0 = 0; int t1 = 1; int t2 = 1;
            int[] arr = new int[n + 1];
            arr[0] = t0; arr[1] = t1; arr[2] = t2;
            for(int i = 3; i <= n; i++) {
                int t3 = t0 + t1 + t2;
                arr[i] = t3;
                t0 = t1;
                t1 = t2;
                t2 = t3;
            }
            return arr[n];
        }
    }
    static class Solver1 {
        public int tribonacci(int n) {
            if(n == 0) {
                return 0;
            }
            if(n == 1 || n == 2) {
                return 1;
            }
            return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        }
    }
}

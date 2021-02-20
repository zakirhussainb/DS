package com.zakcorp.final450.array;

import java.util.Arrays;

/* Reverse the array */
public class P_10 {
    // This is a recursive solution, you will get a TLE. Lets memoize the solution
    static class Solver {
        int minJumps;
        public int solve1(int[] arr) {
            minJumps = arr.length - 1;
            int[] counter = new int[]{0};
            recursive(0, arr, counter);
            return minJumps;
        }
        private void recursive(int index, int[] arr, int[] counter) {
            if(index >= arr.length)
                return;
            if(index == arr.length - 1) {
                minJumps = Math.min(minJumps, counter[0]);
                return;
            }
            for(int i = index; i < index + arr[index]; i++) {
                counter[0]++;
                recursive(i + 1, arr, counter);
                counter[0]--;
            }
        }
    }

    // Memoize solution
    static class Solver1 {
        public int solve1(int[] arr) {
            int n = arr.length;
            int[] counter = new int[]{0};
            int[] memo = new int[n + 1];
            Arrays.fill(memo, n - 1);
            return recursive(0, arr, counter, memo);
        }
        private int recursive(int index, int[] arr, int[] counter, int[] memo) {
            if(index >= arr.length)
                return Integer.MAX_VALUE;
            if(index == arr.length - 1) {
                return Math.min(memo[index], counter[0]);
            }
            if(memo[index] != arr.length - 1) {
                return memo[index];
            }
            for(int i = index; i < index + arr[index]; i++) {
                counter[0]++;
                memo[index] = Math.min(memo[index], recursive(i + 1, arr, counter, memo));
                counter[0]--;
            }
            return memo[index];
        }
    }
}

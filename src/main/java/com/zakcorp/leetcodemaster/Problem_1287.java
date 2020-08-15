package com.zakcorp.leetcodemaster;

public class Problem_1287 {
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            if(n == 1) {
                return 1;
            }
            double num = (double) n / 4;
            int mm = (int) Math.ceil(num);
            int max = arr[0];
            for(int x : arr) {
                max = Math.max(max, x);
            }
            int[] hash = new int[max + 1];
            for(int x : arr) {
                hash[x]++;
            }
            for(int i = 0; i < hash.length; i++) {
                if(hash[i] > mm) {
                    return i;
                }
            }
            return 0;
        }
        public int solve2(int[] arr) {
            int n = arr.length;
            if(n == 1) {
                return 1;
            }
            double num = (double) n / 4;
            int mm = (int) Math.ceil(num);
            int i = 0, j = 1;
            int x = 1;
            while(j < n) {
                if(arr[i] == arr[j]) {
                    x++;
                } else {
                    if(x > mm) {
                        return arr[i];
                    }
                    i = j;
                    x = 1;
                }
                j++;
            }
            if(x > mm) {
                return arr[i];
            }
            return 0;
        }
    }
}

package com.zakcorp.leetcodemaster;

public class Problem_605 {
    static class Solver {
        public boolean canPlaceFlowers(int[] arr, int n) {
            if(n == 0){
                return true;
            }
            int len = arr.length;
            int i = 0;
            while(i < len) {
                if(arr[i] == 1) {
                    i = i + 2;
                } else if( (i + 1 < len) && (arr[i + 1] == 1) ) {
                    i = i + 3;
                } else {
                    i = i + 2;
                    n = n - 1;
                }
            }
            return n <= 0;
        }
    }
}

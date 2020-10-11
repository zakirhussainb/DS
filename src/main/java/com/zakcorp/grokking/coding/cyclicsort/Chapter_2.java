package com.zakcorp.grokking.coding.cyclicsort;

public class Chapter_2 {
    static class Solver {
        public int[] solve1(int[] arr) {
            int n = arr.length;
            for(int i = 0; i < n;) {
                if(arr[i] != i + 1) {
                    int temp = arr[i];
                    arr[i] = arr[arr[i] - 1];
                    arr[temp - 1] = temp;
                } else {
                    i++;
                }
            }
            return arr;
        }
    }
}

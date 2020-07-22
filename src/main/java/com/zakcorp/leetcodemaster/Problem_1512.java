package com.zakcorp.leetcodemaster;

public class Problem_1512 {
    public int numIdenticalPairs(int[] arr) {
        int n = arr.length;
        int counter = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }
}

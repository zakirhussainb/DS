package com.zakcorp.arrays.leetcode;

import java.util.Arrays;

public class Problem_147 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 4, 1, 5, 3};
        int[] result = insertionSortArr(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] insertionSortArr(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int value = arr[i];
            int hole = i;
            while(hole > 0 && arr[hole - 1] > value){
                arr[hole] = arr[hole - 1];
                hole = hole - 1;
            }
            arr[hole] = value;
        }
        return arr;
    }
}

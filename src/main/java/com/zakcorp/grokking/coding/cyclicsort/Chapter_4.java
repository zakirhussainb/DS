package com.zakcorp.grokking.coding.cyclicsort;

import java.util.*;

public class Chapter_4 {
    /*
    There are many ways to solve this type of problems,
    But here we are going to use Cyclic Sort Pattern to solve this problem.
    It might not be an efficient approach, but it has to be done for understanding
    the Cyclic Sort Pattern
     */
    public List<Integer> getAllMissingNumbers(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n;) {
            int j = arr[i] - 1;
            if(arr[i] != arr[j]) {
                swap(arr, i, j);
            } else {
                i++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(arr[i] != i + 1) {
                result.add(i + 1);
            }
        }
        return result;
    }
    private void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}

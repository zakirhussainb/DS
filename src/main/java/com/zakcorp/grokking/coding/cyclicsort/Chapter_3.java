package com.zakcorp.grokking.coding.cyclicsort;

public class Chapter_3 {
    /*
    There are many ways to solve this type of problems,
    But here we are going to use Cyclic Sort Pattern to solve this problem.
    It might not be an efficient approach, but it has to be done for understanding
    the Cyclic Sort Pattern
     */
    public int findMissingNumber(int[] arr) {
        int n = arr.length;
        int i = 0;
        while(i < n) {
            if(arr[i] < n && arr[i] != arr[arr[i]]) {
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        } // 0 1 4 3
        for(i = 0 ; i < n; i++) {
            if(arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }
    private void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}

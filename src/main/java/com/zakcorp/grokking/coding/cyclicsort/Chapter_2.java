package com.zakcorp.grokking.coding.cyclicsort;

public class Chapter_2 {
    /*
    There are many ways to solve this type of problems,
    But here we are going to use Cyclic Sort Pattern to solve this problem.
    It might not be an efficient approach, but it has to be done for understanding
    the Cyclic Sort Pattern
     */
    public int[] sort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n;) {
            int j = arr[i] - 1;
            if(arr[i] != arr[j]) {
                swap(arr, i, j);
            } else {
                i++;
            }
        }
        return arr;
    }
    private void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}

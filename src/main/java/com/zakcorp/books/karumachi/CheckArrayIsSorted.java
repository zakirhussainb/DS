package com.zakcorp.books.karumachi;

public class CheckArrayIsSorted {
    // Recursion - Taken from Narasimhan Karumachi Notes
    public static void main(String[] args) {
        CheckArrayIsSorted p = new CheckArrayIsSorted();
        int[] arr = {10, 9, 8, 7, 6};
        int[] arr1 = {6, 6, 7, 7};
        System.out.println(p.isArraySortedRecur(arr1, arr1.length));
    }
    private boolean isArraySortedRecur(int[] arr, int n) {
        if(n == 1) {
            return true;
        }
        return (arr[n - 1] < arr[n - 2])?false : isArraySortedRecur(arr, n - 1);
    }
}

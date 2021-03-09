package com.zakcorp.arrays;

public class QuickSortArrays {
    static class Solver {
        // Recursive Quick Sort Procedure
        public int[] solve1(int[] arr) {
            quickSortRec(arr, 0, arr.length - 1);
            return arr;
        }
        private void quickSortRec(int[] arr, int start, int end) {
            if(start < end) {
                int pIndex = partition(arr, start, end);
                quickSortRec(arr, start, pIndex - 1);
                quickSortRec(arr, pIndex + 1, end);
            }
        }
        private int partition(int[] arr, int start, int end) {
            int pivot = arr[end];
            int pIndex = start;
            for(int i = start; i < end; i++) {
                if(arr[i] <= pivot) {
                    swap(arr, i, pIndex);
                    pIndex++;
                }
            }
            swap(arr, pIndex, end);
            return pIndex;
        }
        private void swap(int[] arr, int x, int y) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
    }
}

package com.zakcorp.leetcodemaster;

import java.util.Arrays;

public class Problem_31
{
    static class Solver {
        public int[] solve1(int[] arr) {
            int n = arr.length;
            int index = -1;
            // Find the index of the element that is less than the next element, but from the backwards
            for(int i = n - 2; i >= 0; i--) {
                if(arr[i] < arr[i + 1]) {
                    index = i;
                    break;
                }
            }
            // If there is no index found, then the next permutation will be the first permutation of that particular array
            // Which means you have to completely reverse the array.
            if(index == -1) {
                reverse(arr, 0, n - 1);
                return arr;
            }
            // After finding the index, swap the element that is greater than the given element's index
            for(int i = n - 1; i > index; i--) {
                if(arr[i] > arr[index]) {
                    swap(arr, i, index);
                    break;
                }
            }
            // Finally reverse the array from index + 1 till the end of the array.
            reverse(arr, index + 1, n - 1);
            return arr;
        }

        private void reverse(int[] arr, int low, int high) {
            while(low < high) {
                int temp = arr[high];
                arr[high] = arr[low];
                arr[low] = temp;
                low++;
                high--;
            }
        }

        private void swap(int[] arr, int x, int y) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
    }
}

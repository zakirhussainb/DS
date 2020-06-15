package com.zakcorp.leetcodemaster;

public class Problem_1122 {
    static class Solver {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            // Find the maximum element in arr1, this is required to create an aux array with size 1 greater than this max value.
            int max = arr1[0];
            for (int num : arr1) {
                max = Math.max(max, num);
            }
            // Create an auxiliary array and store the count of each and every element in arr1.
            int[] aux = new int[max + 1];
            for (int num : arr1) {
                aux[num]++;
            }
            // Keeping arr2 as relative and iterate over the aux array to update arr1.
            int k = 0;
            for(int num : arr2) {
                while(aux[num] > 0) {
                    arr1[k++] = num;
                    aux[num]--;
                }
            }
            // Fill the remaining elements that are present in auxiliary array and update arr1.
            for(int i = 0; i < aux.length; i++) {
                while(aux[i] > 0) {
                    arr1[k++] = i;
                    aux[i]--;
                }
            }
            return arr1;
        }
    }
    static class Solver1 {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            int[] aux = new int[1001];
            for (int num : arr1) {
                aux[num]++;
            }
            int k = 0;
            for(int num : arr2) {
                while(aux[num] --> 0) {
                    arr1[k++] = num;
                }
            }
            for(int i = 0; i < 1001; i++) {
                while(aux[i] --> 0) {
                    arr1[k++] = i;
                }
            }
            return arr1;
        }
    }

}

package com.zakcorp.grokking.coding.cyclicsort;

/**
 * Created by Zakir Hussain B on 14/10/20.
 *
 * @source: Grokking Coding
 * @topic: Cyclic Sort
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Chapter_7 {
    public int[] findNumbers(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n;) {
            int j = arr[i] - 1;
            if(arr[i] != arr[j]) {
                swap(arr, i, j);
            } else {
                i++;
            }
        }
        int[] result = new int[2];
        for(int i = 0; i < n; i++) {
            if(arr[i] != i + 1) {
                result[0] = arr[i];
                result[1] = i + 1;
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
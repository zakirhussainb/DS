package com.zakcorp.grokking.coding.cyclicsort;

/**
 * Created by Zakir Hussain B on 13/10/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Chapter_5 {
    public int findNumber(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n;) {
            int j = arr[i] - 1;
            if(arr[i] != arr[j]) {
                swap(arr, i, j);
            } else {
                i++;
            }
        }
        return arr[n - 1];
//        for(int i = 0; i < n; i++) {
//            if(arr[i] != i + 1) {
//                return arr[i];
//            }
//        }
//        return -1;
    }
    private void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
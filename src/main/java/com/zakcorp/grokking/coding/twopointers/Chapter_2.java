package com.zakcorp.grokking.coding.twopointers;

/**
 * Created by Zakir Hussain B on 23/09/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Chapter_2 {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int nextNonDup = 1;
        for(int i = 1; i < n; i++) {
            if(arr[i] != arr[nextNonDup - 1]) {
                arr[nextNonDup] = arr[i];
                nextNonDup++;
            }
        }
        return nextNonDup;
    }
}
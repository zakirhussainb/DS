package com.zakcorp.leetcodemaster;

/**
 * Created by Zakir Hussain B on 22/09/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_80 {
    public int removeDuplicates(int[] arr) {
        // [2, 3, 3, 3, 6, 9, 9]
        int n = arr.length;
        int nextNonDup = 1;
        for(int i = 1; i < n; i++) {
            if(arr[nextNonDup - 1] != arr[i]) {
                arr[nextNonDup] = arr[i];
                nextNonDup++;
            }
        }
        return nextNonDup;
    }
}
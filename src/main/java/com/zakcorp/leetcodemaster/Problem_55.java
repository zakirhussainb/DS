package com.zakcorp.leetcodemaster;

/**
 * Created by Zakir Hussain B on 30/08/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_55 {
    public boolean canJump(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int j = start;
        while(j < n) {
            if(j == end) {
                return true;
            }
            if(arr[j] != 0) {
                j = j + arr[j];
            } else {
                return false;
            }
        }
        return j >= end;
    }
}
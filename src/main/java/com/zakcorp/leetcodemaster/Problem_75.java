package com.zakcorp.leetcodemaster;

/**
 * Created by Zakir Hussain B on 02/10/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_75 {
    public int[] sortColors(int[] arr) {
        int[] counter = new int[3];
        for (int num : arr) {
            counter[num]++;
        }
        int k = 0;
        while(counter[0] --> 0) {
            arr[k++] = 0;
        }
        while(counter[1] --> 0) {
            arr[k++] = 1;
        }
        while(counter[2] --> 0) {
            arr[k++] = 2;
        }
        return arr;
    }
}
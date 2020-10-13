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
        int dup = arr[0];
        for(int i = 1; i < n; i++) {
            dup = dup ^ arr[i];
        }
        return dup;
    }
}
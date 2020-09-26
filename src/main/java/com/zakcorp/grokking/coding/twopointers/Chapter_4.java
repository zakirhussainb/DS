package com.zakcorp.grokking.coding.twopointers;

import java.util.*;

/**
 * Created by Zakir Hussain B on 27/09/20.
 *
 * @source: Grokking Coding Interview
 * @topic: Two Pointers
 * @sub-topic: Squaring a Sorted Array (easy)
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Chapter_4 {
    public int[] makeSquares(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            result[i] = arr[i] * arr[i];
        }
        Arrays.sort(result);
        return result;
    }
}
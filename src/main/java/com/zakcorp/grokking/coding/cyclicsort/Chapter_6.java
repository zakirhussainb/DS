package com.zakcorp.grokking.coding.cyclicsort;

import java.util.*;

/**
 * Created by Zakir Hussain B on 13/10/20.
 *
 * @source: Grokking Coding
 * @topic: Cyclic Sorting
 * @sub-topic: Find all Duplicate Numbers (easy)
 * @platform: GC, LeetCode
 * @problem_link: https://leetcode.com/problems/find-all-duplicates-in-an-array/
 * @pseudocode:
 */
public class Chapter_6 {
    public List<Integer> getAllDuplicates(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n;) {
            int j = arr[i] - 1;
            if(arr[i] != arr[j]) {
                swap(arr, i, j);
            } else {
                i++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(arr[i] != i + 1) {
                result.add(arr[i]);
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
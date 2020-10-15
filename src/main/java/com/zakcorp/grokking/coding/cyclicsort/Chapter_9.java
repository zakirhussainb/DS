package com.zakcorp.grokking.coding.cyclicsort;

import java.util.*;

/**
 * Created by Zakir Hussain B on 15/10/20.
 *
 * @source: Grokking Coding
 * @topic: Cyclic Sort
 * @sub-topic: Find the Smallest Missing Positive Number
 * @platform: LeetCode
 * @problem_link: https://leetcode.com/problems/first-missing-positive/
 * @pseudocode: // TODO:- For solution  using HashSet refer LeetCode Problem 41
 */
public class Chapter_9 {

    public int findNumber(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(arr[i] >= 0 && arr[i] < n) {
                int j = arr[i] - 1;
                if(arr[i] != arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
        for(int i = 0; i < n; i++) {
            if(arr[i] != i + 1) {
                return i + 1;
            }
        }
        return 1;
    }
    private void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
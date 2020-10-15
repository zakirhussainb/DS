package com.zakcorp.grokking.coding.cyclicsort;

import java.util.*;

/**
 * Created by Zakir Hussain B on 15/10/20.
 *
 * @source: Grokking Coding
 * @topic: Cyclic Sort
 * @sub-topic: Find the First K Missing Positive Numbers (hard)
 * @platform: LeetCode
 * @problem_link: Similar Problem Not Same -> https://leetcode.com/problems/kth-missing-positive-number/
 * @pseudocode:
 */
public class Chapter_11 {
    // This below solution will work only if the array is sorted. Otherwise you need to sort the array.
    // Which will then give you O(N logN) time complexity.
    public List<Integer> findNumberX(int[] arr, int k) {
        Arrays.sort(arr);
        List<Integer> missingNumbers = new ArrayList<>();
        int n = arr.length, m = 1, i = 0;
        while(i < n && k > 0) {
            if(arr[i] < 0) {
                i++;
                continue;
            }
            if(arr[i] != m) {
                k--;
                missingNumbers.add(m);
            } else if(arr[i] == m) {
                i++;
            }
            m++;
        }
        int lastValue = arr[n - 1];
        while(k --> 0) {
            missingNumbers.add(++lastValue);
        }
        return missingNumbers;
    }

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
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
    /*
    Here the array is sorted, so we can just use two-pointers to solve the problem.
    But when the array is not sorted and you need to return the index of the pair, then you must use a HashMap to store
    the array element and index, See:- com/zakcorp/leetcodemaster/Problem_1.java
     */
    public int[] findPairWithTargetSum(int[] arr, int target) {
        int[] result = new int[2];
        int n = arr.length;
        int i = 0, j = n - 1;
        while(i < n && j > 0) {
            int sum = arr[i] + arr[j];
            if(sum > target) {
                j--;
            } else if(sum < target) {
                i++;
            } else {
                result[0] = i;
                result[1] = j;
                break;
            }
        }
        return result;
    }
}
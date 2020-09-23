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
package com.zakcorp.leetcodemaster;

public class Problem_34 {
    public int[] searchRange(int[] arr, int target) {
        int n = arr.length;
        int low = 0; int high = n - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] < target) {
                low = mid + 1;
            } else if(arr[mid] > target) {
                high = mid - 1;
            } else {
                return targetIndex(low, high, arr, target);
            }
        }
        return new int[]{-1, -1};
    }
    private int[] targetIndex(int low, int high, int[] arr, int target) {
        int[] result = new int[2];
        boolean isLow = false, isHigh = false;
        while(low <= high) {
            if(arr[low] == target && !isLow) {
                result[0] = low;
                isLow = true;
            } else {
                low++;
            }
            if(arr[high] == target && !isHigh) {
                result[1] = high;
                isHigh = true;
            } else {
                high--;
            }
            // Once you have found both starting and ending positions of the given target break,
            // to avoid unnecessary iterations
            if(isLow && isHigh)
                break;
        }
        if(!isHigh)
            result[1] = result[0];
        return result;
    }
}

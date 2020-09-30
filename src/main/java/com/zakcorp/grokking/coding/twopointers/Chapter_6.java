package com.zakcorp.grokking.coding.twopointers;

/**
 * Created by Zakir Hussain B on 30/09/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Chapter_6 {
    public int searchTriplet(int[] arr, int target) {
        int n = arr.length;
        int aDist = Integer.MAX_VALUE, bDist = Integer.MAX_VALUE, x = Integer.MAX_VALUE, y = Integer.MAX_VALUE;
        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    int currentSum = arr[i] + arr[j] + arr[k];
                    if(currentSum == target)
                        return currentSum;
                    else if(currentSum < target) {
                        if(aDist > target - currentSum) {
                            aDist = target - currentSum;
                            x = currentSum;
                        }
                    } else {
                        if(bDist > currentSum - target) {
                            bDist = currentSum - target;
                            y = currentSum;
                        }
                    }
                }
            }
        }
        if(aDist == bDist)
            return Math.min(x, y);
        else if(aDist < bDist)
            return x;
        else
            return y;
    }
}
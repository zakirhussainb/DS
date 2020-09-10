package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 10/09/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_239 {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n - k + 1];
        int f = 0;
        for(int end = 0; end <= n - k; end++) {
            int windowMax = Integer.MIN_VALUE;
            int m = end;
            while(m < k + end) {
                windowMax = Math.max(windowMax, arr[m]);
                m++;
            }
            result[f++] = windowMax;
        }
        return result;
    }
}
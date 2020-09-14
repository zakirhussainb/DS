package com.zakcorp.grokking.coding.slidingwindow;

/**
 * Created by Zakir Hussain B on 14/09/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Chapter_8 {
    public static void main(String[] args) {
        Chapter_8 p = new Chapter_8();
        System.out.println(p.findLength(new int[]{0,1,1,0,0,0,1,1,0,1,1}, 2));
        System.out.println(p.findLength(new int[]{0,1,0,0,1,1,0,1,1,0,0,1,1}, 3));
    }
    private int findLength(int[] arr, int K) {
        int n = arr.length;
        int start = 0, maxLength = 0;
        int onesCount = 0; // The idea is to capture the onesCount in the current window
        for(int end = 0; end < n; end++) {
            if(arr[end] == 1)
                onesCount++;
            if(end - start + 1 - onesCount > K) {
                if(arr[start] == 1)
                    onesCount--;
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
package com.zakcorp.arrays.fivehundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem_6 {
    /*
        Find largest sub-array formed by consecutive integers
            1. int getLengthOfLargestSubArray(arr); --> Completed
            2. int[2] getStartAndEndIndexOfLargestSubArray(arr); --> Completed
            3. int[subArraySize] getLargestSubArray(arr);
     ***NOTE:- You need to solve this problem for two different scenarios for all the above variations.
                1. When all the integers in the array are distinct.
                2. When array contains duplicate elements.
     */
    public static void main(String[] args) throws IOException {
        Problem_6 p = new Problem_6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str = br.readLine();
            String[] splitArr = str.split("\\s+");
            int[] intArr = new int[splitArr.length];
            for (int i = 0; i < splitArr.length; i++) {
                intArr[i] = Integer.parseInt(splitArr[i]);
            }
//            System.out.println(p.getLengthOfLargestSubArray(intArr, intArr.length));
            System.out.println(Arrays.toString(p.getStartAndEndIndexOfLargestSubArray(intArr, intArr.length)));
        }
    }

    private int getLengthOfLargestSubArray(int[] arr, int n) {
        int maxLen = 1;
        for(int i = 0; i < n - 1; i++){
            int min = arr[i];
            int max = arr[i];
            for(int j = i + 1; j < n; j++) {
                min = Math.min(min, arr[j]);
                max = Math.max(max, arr[j]);
                if(max - min == j - i){
                    maxLen = Math.max(maxLen, max - min + 1);
                }
            }
        }
        return maxLen;
    }

    private int[] getStartAndEndIndexOfLargestSubArray(int[] arr, int n) {
        int[] result = new int[2];
        int maxLen = 1;int start = 0, end = 0;
        for(int i = 0; i < n - 1; i++) {
            int min = arr[i];
            int max = arr[i];
            for(int j = i + 1; j < n; j++) {
                min = Math.min(min, arr[j]);
                max = Math.max(max, arr[j]);
                if(max - min == j - i){
                    maxLen = Math.max(maxLen, max - min);
                    if(j - i == maxLen) {
                        start = i;
                        end = j;
                    }
                }
            }
        }
        result[0] = start;
        result[1] = end;
        return result;
    }
}

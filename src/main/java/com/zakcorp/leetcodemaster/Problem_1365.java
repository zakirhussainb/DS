package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1365 {
    static class Solver {
        public int[] smallerNumbersThanCurrent_BruteForce(int[] arr) {
            int n = arr.length;
            int[] resultArr = new int[n];
            for(int i = 0; i < n; i++) {
                for(int j = i + 1; j < n; j++) {
                    if(arr[i] > arr[j]){
                        resultArr[i]++;
                    } else if(arr[i] < arr[j]){
                        resultArr[j]++;
                    }
                }
            }
            return resultArr;
        }
        public int[] smallerNumbersThanCurrent_Efficient(int[] arr) {
            int n = arr.length;
            int[] count = new int[101];
            int[] result = new int[n];
            for(int num : arr) {
                count[num]++;
            }
            for(int i = 1; i < 101; i++){
                count[i] = count[i] + count[i - 1];
            }
            for(int i = 0; i < n; i++){
                result[i] = (arr[i] == 0) ? 0 : count[arr[i] - 1];
            }
            return result;
        }
    }

}

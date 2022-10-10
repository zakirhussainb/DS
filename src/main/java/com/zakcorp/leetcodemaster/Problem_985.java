package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_985 {
    // TLE for this solution
    static class Solver {
        public int[] sumEvenAfterQueries(int[] arr, int[][] queries) {
            int[] res = new int[queries.length];
            int i = 0;
            for(int[] query : queries) {
                int val = query[0];
                int index = query[1];
                arr[index] = arr[index] + val;
                res[i++] = getEvenSum(arr);
            }
            return res;
        }
        private int getEvenSum(int[] arr) {
            int sum = 0;
            for(int num : arr) {
                if(num % 2 == 0)
                    sum += num;
            }
            return sum;
        }
    }
    // TLE for this solution
    static class Solver1 {
        public int[] sumEvenAfterQueries(int[] arr, int[][] queries) {
            int[] res = new int[queries.length];
            int evenSum = getEvenSum(arr);
            for(int i = 0; i < queries.length; i++) {
                int val = queries[i][0];
                int index = queries[i][1];
                if(arr[index] % 2 == 0) {
                    evenSum -= arr[index];
                    arr[index] += val;
                    if(arr[index] % 2 == 0) {
                        evenSum += arr[index];
                    }
                } else {
                    arr[index] += val;
                    if(arr[index] % 2 == 0) {
                        evenSum += arr[index];
                    }
                }
                res[i] = evenSum;
            }
            return res;
        }
        private int getEvenSum(int[] arr) {
            int sum = 0;
            for(int num : arr) {
                if(num % 2 == 0)
                    sum += num;
            }
            return sum;
        }
    }
}

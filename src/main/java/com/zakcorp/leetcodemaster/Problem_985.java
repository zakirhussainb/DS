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
    // Solution is accepted. I drew/written the solution/debugging logic on the Wacom Tablet and then figured it out.
    static class Solver1 {
        public int[] sumEvenAfterQueries(int[] arr, int[][] queries) {
            int[] res = new int[queries.length];
            int evenSum = 0;
            for(int num : arr) {
                if(num % 2 == 0)
                    evenSum += num;
            }
            for(int i = 0; i < queries.length; i++) {
                int val = queries[i][0];
                int index = queries[i][1];
                // Before updating the array, if arr[i] is even then subtract it from the evenSum.
                if(arr[index] % 2 == 0)
                    evenSum -= arr[index];
                // Update the arr[i]
                arr[index] += val;
                // After the updating the array, if arr[i] is even then add it to the evenSum.
                if(arr[index] % 2 == 0)
                    evenSum += arr[index];

                res[i] = evenSum;
            }
            return res;
        }
    }
}

package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_985 {
    public int[] sumEvenAfterQueries(int[] arr, int[][] queries) {
        int[] res = new int[arr.length];
        int x = 0;
        for(int i = 0; i < queries.length; i++) {
            for(int j = 0; j < queries[0].length; j++) {
                arr[queries[i][j + 1]] = arr[queries[i][j + 1]] + queries[i][j];
                int sum = 0;
                for(int m = 0; m < arr.length; m++) {
                    if(arr[m] % 2 == 0) {
                        sum += arr[m];
                    }
                }
                res[x++] = sum;
                break;
            }
        }
        return res;
    }
}

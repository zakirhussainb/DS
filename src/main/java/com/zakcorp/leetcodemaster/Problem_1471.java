package com.zakcorp.leetcodemaster;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_1471 {
    static class Solver {
        public int[] solve1(int[] arr, int k) {
            Arrays.sort(arr);
            int n = arr.length;
            int median = arr[((n - 1) / 2)];
            int i = 0, j = n - 1;
            int[] strongArr = new int[n];
            int x = 0;
            boolean processJFirst = true;
            boolean processIFirst = true;
            while(i <= j) {
                if(processJFirst) {
                    int v1 = Math.abs(arr[j] - median);
                    int v2 = Math.abs(arr[j - 1] - median);
                    if(v1 > v2) {
                        strongArr[x++] = arr[j];
                    } else if(v1 == v2) {
                        strongArr[x++] = Math.max(arr[j], arr[j - 1]);
                    }
                    if(arr[j] == arr[j - 1]) {
                        j--;
                        continue;
                    } else {
                        processJFirst = false;
                    }
                }
                if(processIFirst) {
                    int v1 = Math.abs(arr[i] - median);
                    int v2 = Math.abs(arr[i + 1] - median);
                    if(v1 > v2) {
                        strongArr[x++] = arr[i];
                    } else if(v1 == v2) {
                        strongArr[x++] = Math.max(arr[i], arr[i + 1]);
                    }
                    if(arr[i] == arr[i + 1]) {
                        i++;
                        continue;
                    } else {
                        processIFirst = false;
                    }
                }
                processIFirst = !processIFirst;
                processJFirst = !processJFirst;
                i++;
                j--;
            }
            return strongArr;
        }
    }
}

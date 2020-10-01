package com.zakcorp.grokking.coding.twopointers;

import java.util.*;

/**
 * Created by Zakir Hussain B on 01/10/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Chapter_7 {
    static class Solver {
        public int solve1(int[] arr, int target) {
            int n = arr.length;
            Arrays.sort(arr);
            int tripletCounter = 0;
            for(int i = 0; i < n - 2; i++) {
                int j = i + 1;
                while(j < n - 1) {
                    int sum = arr[i] + arr[j] + arr[j + 1];
                    if(sum < target) {
                        tripletCounter++;
                        j++;
                    }
                }
            }
            return tripletCounter;
        }
    }

}
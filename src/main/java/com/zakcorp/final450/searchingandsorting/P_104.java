package com.zakcorp.final450.searchingandsorting;

import java.util.*;

/* Reverse the array */
public class P_104 {
    static class Solver {
        public List<int[]> solve1(int[] arr)
        {
            int n = arr.length;
            List<int[]> result = new ArrayList<>();
            int curr_sum ;
            for(int i = 0; i < n; i++) {
                curr_sum = arr[i];
                for(int j = i + 1; j < n; j++) {
                    if(curr_sum == 0) {
                        result.add(new int[]{arr[i], arr[j]});
                    }
                    curr_sum += arr[j];
                }
            }
            return result;
        }
    }
}

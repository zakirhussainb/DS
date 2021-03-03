package com.zakcorp.final450.searchingandsorting;

import java.util.*;

public class P_103 {
    // Time Complexity:- O(m * n) and Space Complexity:- O(1)
    // Getting TLE while running in GFG, need to write a better solution with O(m + n) time complexity
    static class Solver {
        public List<int[]> solve1(int[] arr1, int[] arr2)
        {
            List<int[]> list = new ArrayList<>();
            int m = arr1.length, n = arr2.length;
            for(int y = n - 1; y >= 0; y--) {
                int x, last = arr1[m - 1];
                for(x = m - 2; x >= 0 && arr1[x] > arr2[y]; x--) {
                    arr1[x + 1] = arr1[x];
                }
                if(x != m - 2 || last > arr2[y]) {
                    arr1[x + 1] = arr2[y];
                    arr2[y] = last;
                }
            }
            list.add(arr1);
            list.add(arr2);
            return list;
        }
    }
}

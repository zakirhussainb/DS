package com.zakcorp.final450.searchingandsorting;

import java.util.*;

public class P_107 {
    // minimum no. of swaps required to sort the array
    static class Solver {
        public int solve1(int[] arr)
        {
            int n = arr.length;
            int ans = 0;
            int[] temp = Arrays.copyOfRange(arr, 0, n);
            Arrays.sort(temp);
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++) {
                map.put(arr[i], i);
            }
            for(int i = 0; i < n; i++) {
                if(arr[i] != temp[i]) {
                    ans++;
                    int init = arr[i];
                    swap(arr, i, map.get(temp[i]));
                    map.put(init, map.get(temp[i]));
                    map.put(temp[i], i);
                }
            }
            return ans;
        }
        private void swap(int[] arr, int x, int y) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
    }
}

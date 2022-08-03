package com.zakcorp.leetcodemaster;

import java.util.*;

// TODO:- Need to implement the Quick Select version
public class Problem_215 {
    static class Solver {
        public int solve1(int[] arr, int k) {
            Arrays.sort(arr);
            int l = 0, h = arr.length - 1;
            while(l <= h) {
                int temp = arr[l];
                arr[l] = arr[h];
                arr[h] = temp;
                l++;
                h--;
            }
            return arr[k - 1];
        }
        public int solve2(int[] arr, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(arr.length, Collections.reverseOrder());
            for (int value : arr) {
                pq.add(value);
            }
            while( !pq.isEmpty() && k --> 1 ) {
                pq.poll();
            }
            return pq.poll();
        }
        public int solve3(int[] arr, int k) {
            Arrays.sort(arr);
            int n = arr.length;
            int i = n - 1;
            while(i >= 0 && k --> 1) {
                i--;
            }
            return arr[i];
        }
    }
}

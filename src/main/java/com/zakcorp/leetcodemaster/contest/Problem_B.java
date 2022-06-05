package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_B {
    static class Solver {
        public int solve1(int[] arr, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for (int num : arr) {
                pq.add(num); // O(log N) * O(N) => O(N log N) -> sorting
            }

            int base = pq.peek();
            int ans = 0;

            while (!pq.isEmpty()) { // O (N)
                int val = pq.poll(); //  O(log N) * O(N)
                if ((base - val) > k) {
                    ans++;
                    base = val;
                }
            }
//            O(n log N) + O(n log N)
            return ans + 1;
        }
        public int solve2(int[] arr, int k) {
            Arrays.sort(arr); // O(N log N)
            int n = arr.length;
            int base = arr[n - 1];
            int ans = 0;
            for(int i = n - 1; i >= 0; i--) { // O(N)
                if ((base - arr[i]) > k) {
                    ans++;
                    base = arr[i];
                }
            }
//            O(N) + O(n log N)
            return ans + 1;
        }
    }
}

package com.zakcorp.leetcodemaster;


import java.util.*;

public class Problem_849 {
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            int max = 0;
            int i = 0;
            while(i < n) {
                while(i < n && arr[i] == 1) {
                    i++;
                }
                int j = i;
                while(i < n && arr[i] == 0) {
                    i++;
                }
                if(j == 0 || i == n) {
                    max = Math.max(max, i - j);
                } else {
                    max = Math.max(max, (i - j + 1) / 2 );
                }
            }
            return max;
        }
        public int solve2(int[] arr) {
            TreeSet<Integer> tSet = new TreeSet<>();
            int max = 0;
            int n = arr.length;
            for(int i = 0; i < n; i++) {
                if(arr[i] == 1)
                    tSet.add(i);
            }
            for(int i = 0; i < n; i++) {
                if(arr[i] == 1)
                    continue;
                Integer leftSeat = tSet.lower(i);
                Integer rightSeat = tSet.higher(i);
                int left = leftSeat == null ? n : i - leftSeat;
                int right = rightSeat == null ? n : rightSeat - i;
                max = Math.max(max, Math.min(left, right));
            }
            return max;
        }
    }
}

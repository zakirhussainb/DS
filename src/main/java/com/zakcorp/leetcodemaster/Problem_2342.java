package com.zakcorp.leetcodemaster;

import java.util.*;
import java.util.stream.Collectors;

public class Problem_2342 {
    static class Solver {
        public int solve1(int[] arr) {
            Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
            for(int num : arr) {
                int key = getSumOfDigits(num);
                if(!map.containsKey(key)) {
                    map.put(key, new PriorityQueue<>(Comparator.reverseOrder()));
                }
                map.get(key).add(num);
            }
            int maxSum = 0;
            for(Map.Entry<Integer, PriorityQueue<Integer>> entry : map.entrySet()) {
                int sum = 0;
                PriorityQueue<Integer> pq = entry.getValue();
                if(!pq.isEmpty()) {
                    sum += pq.poll();
                }
                if(!pq.isEmpty()) {
                    sum += pq.poll();
                } else {
                    sum = 0;
                }
                maxSum = Math.max(maxSum, sum);
            }
            return maxSum == 0 ? -1 : maxSum;
        }
    }
    static class Solver1 {
        static class Pair {
            int max1;
            int max2;
            int sum;
            public Pair() {}
        }
        public int solve1(int[] arr) {
            Map<Integer, Pair> map = new HashMap<>();
            int maxSum = 0;
            for(int num : arr) {
                int key = getSumOfDigits(num);
                if(!map.containsKey(key)) {
                    map.put(key, new Pair());
                }
                if (num > map.get(key).max1) {
                    map.get(key).max2 = map.get(key).max1;
                    map.get(key).max1 = num;
                } else if (num > map.get(key).max2) {
                    map.get(key).max2 = num;
                }
                int max1 = map.get(key).max1;
                int max2 = map.get(key).max2;
                if(max1 != 0 && max2 != 0) {
                    map.get(key).sum = Math.max(map.get(key).sum, max1 + max2);
                    maxSum = Math.max(maxSum, map.get(key).sum);
                }
            }
//            Map.Entry<Integer, Pair> sortedMap = map.entrySet().
//                    stream().
//                    sorted((s1, s2) -> s2.getValue().sum - s1.getValue().sum).
//                    filter((s) -> s.getValue().max1 != 0 && s.getValue().max2 != 0).
//                    findFirst().orElse(null);
            return maxSum == 0 ? -1 : maxSum;
        }
    }
    private static int getSumOfDigits(int num) {
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}

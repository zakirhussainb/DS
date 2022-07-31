package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_B {
    static class Solver {
        public int solve1(int[] grades) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
            for(int num : grades)
                pq.add(num);
            int c = 1;
            int currMaxSum = 0;
            int groups = 0;
            while (!pq.isEmpty()) {
                LinkedList<Integer> list = new LinkedList<>();
                int sum = 0;
                for(int i = 1; i <= c; i++) {
                    int x = pq.poll();
                    if(currMaxSum < sum) {
                        break;
                    }
                    sum += x;
                    list.add(x);
                    currMaxSum = sum;
                    groups++;
                }
                c++;
            }
            return groups;
        }
    }
}
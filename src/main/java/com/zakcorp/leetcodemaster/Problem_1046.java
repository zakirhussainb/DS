package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1046 {
    static class Solver {
        public int lastStoneWeight_Approach1(int[] stones) {
            Arrays.sort(stones);
            for(int i = stones.length - 1; i > 0; i--) {
                stones[i - 1] = stones[i] - stones[i - 1];
                Arrays.sort(stones);
            }
            return stones[0];
        }
        public int lastStoneWeight_Approach2(int[] stones) {
            Queue<Integer> priorityQue = new PriorityQueue<>(stones.length, Comparator.reverseOrder());
            for(int stone : stones) {
                priorityQue.add(stone);
            }
            while(priorityQue.size() > 1){
                int x = priorityQue.poll();
                int y = priorityQue.poll();
                priorityQue.add(x - y);
            }
            return priorityQue.poll();
        }
    }
}

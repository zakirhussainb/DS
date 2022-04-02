package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_B {
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            if(n == 1)
                return arr[0];
            Queue<Integer> queue = new LinkedList<>();
            for(int j = 1; j < n; j++) {
                int val = (arr[j - 1] + arr[j]) % 10;
                queue.add(val);
            }
            for(int k = 2; k < n; k++) {
                int size = queue.size();
                int z = 1;
                while(z < size) {
                    int x = queue.isEmpty() ? 0 : queue.poll();
                    int y = queue.isEmpty() ? 0 : queue.peek();
                    int val = (x + y) % 10;
                    queue.add(val);
                    z++;
                }
                queue.poll();
            }
            return queue.isEmpty() ? 0 : queue.peek();
        }
    }
}

package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_967 {
    static class Solver {
        public int[] solve1(int N, int K) {
            if (N == 1)
                return new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

            List<Integer> queue = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9); // This represents the first level.
            for(int level = 1; level < N; ++ level) {
                ArrayList<Integer> nextQueue = new ArrayList<>();
                // iterate through each number within the level
                for (Integer num : queue) {
                    int tailDigit = num % 10;

                    ArrayList<Integer> nextDigits = new ArrayList<>();
                    if(tailDigit + K < 10)
                        nextDigits.add(tailDigit + K);
                    // Why do we need to check, whether K != 0, because when K == 0, duplicate will be added, as the result
                    // of tailDigit + K and tailDigit - K => both will be same. For. Eg, 1 - 0 == 1 and 1 + 0 == 1
                    if(K != 0 && tailDigit - K >= 0)
                        nextDigits.add(tailDigit - K);

                    for (Integer nextDigit : nextDigits) {
                        Integer newNum = num * 10 + nextDigit;
                        nextQueue.add(newNum);
                    }
                }
                // prepare for the next level
                queue = nextQueue;
            }

            return queue.stream().mapToInt(i -> i).toArray();
        }
    }
}

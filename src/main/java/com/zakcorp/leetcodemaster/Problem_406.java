package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_406 {
    static class Solver {
        public int[][] solve1(int[][] people) {
            // Sort the people 2D array by height in descending order.
            // Insert them one by one based on their index.

            //Arrays.sort(people, Collections.reverseOrder(Comparator.comparingInt(h -> h[0])));

            // Cannot use the above sorting technique, because when the heights are same, we need to
            // sort them by k.

            Arrays.sort(people, (p1, p2) -> p1[0] == p2[0] ? p1[1] - p2[1] : p2[0] - p1[0]);

            List<int[]> resultList = new ArrayList<>();
            for(int[] p : people) {
                resultList.add(p[1], p);
            }
            return resultList.toArray(new int[people.length][2]);
        }
    }
}

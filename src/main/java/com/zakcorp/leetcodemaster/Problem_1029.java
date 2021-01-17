package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1029 {
    // Two Steps to remember for majority of the "Greedy" problems: Sort the input and Parse the input
        /*
        Step 1: Sort the persons in the ascending order by price_A - price_B parameter, which indicates the company additional costs.
        Step 2: To minimise the costs, send n persons with the smallest (price_A - price_B) to the city A, and the others to the city B.
         */
    static class Solver {
        public int solve1(int[][] costs) {
            Arrays.sort(costs, new MyComparator());
            int total = 0, i = 0;
            for(; i < costs.length / 2; i++) {
                total += costs[i][0];
            }
            for(; i < costs.length; i++) {
                total += costs[i][1];
            }
            return total;
        }
    }
    static class MyComparator implements Comparator<int[]>{
        @Override
        public int compare(int[] o1, int[] o2) {
            return o1[0] - o1[1] - ( o2[0] - o2[1] );
        }
    }
    static class Solver1 {
        public int solve1(int[][] costs) {
            Arrays.sort( costs, Comparator.comparingInt( a -> (a[0] - a[1]) ) );
            int total = 0;
            for(int i = 0; i < costs.length / 2; i++) {
                total += costs[i][0] + costs[i + costs.length / 2][1];
            }
            return total;
        }
    }
}

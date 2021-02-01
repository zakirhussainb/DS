package com.zakcorp.leetcodemaster;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Problem_1356 {
    static class Pair {
        int num;
        int ones;
        public Pair(int num, int ones) {
            this.num = num;
            this.ones = ones;
        }
    } // 3000 problems - 100 problems
    static class MyComparator implements Comparator<Pair> {

        @Override
        public int compare(Pair p1, Pair p2) {
            if(p1.ones < p2.ones) {
                return -1;
            } else if(p1.ones > p2.ones) {
                return 1;
            } else {
                return Integer.compare(p1.num, p2.num);
            }
        }
    }
    static class Solver {
        /*
        1. Counting the number of ones - in a number
        2. Creating a Pair<Number, Ones in the Number>
        3. Iterating the array elements and adding them to a PQ
        4. Writing a custom comparator based on the problem constraints
        */
        public int[] solve1(int[] arr) {
            PriorityQueue<Pair> pq = new PriorityQueue<>(new MyComparator());
            for(int e : arr) {
                pq.add(new Pair(e, Integer.bitCount(e)));
            }
            int[] op = new int[arr.length];
            int i = 0;
            while( !pq.isEmpty() ) {
                op[i] = pq.remove().num;
                i++;
            }
            return op;
        }
        // Can use Integer.bitCount(num)
        private int countOnes(int num) {
            int c = 0;
            while(num != 0) {
                num = (num & (num - 1));
                c++;
            }
            return c;
        }



    }
}

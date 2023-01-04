package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1387
{
    static class Solver {
        static class Pair{
            int num;
            int steps;
            public Pair(int num, int steps) {
                this.num = num;
                this.steps = steps;
            }
        }
        public int solve1(int lo, int hi, int k) {
            PriorityQueue<Pair> pq = new PriorityQueue<>(new MyComparator());
            for(int i = lo; i <= hi; i++) {
                int[] steps = {0};
                recursive( i, steps );
                pq.add( new Pair( i, steps[0] ) );
            }
            while(!pq.isEmpty() && k --> 1) {
                pq.poll();
            }
            return pq.poll().num;
        }
        private void recursive(int num, int[] steps) {
            if(num == 1)
                return;
            if(num % 2 == 0) {
                num = num / 2;
            } else {
                num = 3 * num + 1;
            }
            steps[0]++;
            recursive( num, steps );
        }
        static class MyComparator implements Comparator<Pair> {
            @Override
            public int compare( Pair o1, Pair o2 )
            {
                return o1.steps == o2.steps ? o1.num - o2.num : o1.steps - o2.steps;
            }
        }
    }
}

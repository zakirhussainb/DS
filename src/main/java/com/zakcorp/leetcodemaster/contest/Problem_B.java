package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_B {
    public long maxKelements(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int num : arr) {
            pq.add( num );
        }
        long score = 0;
        while(!pq.isEmpty() && k > 0) {
            int m = pq.poll();
            score += m;
            double x = (double) m / 3;
            pq.add( (int)Math.ceil(x) );
            k--;
        }
        return score;
    }
}

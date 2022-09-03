package com.zakcorp.leetcodemaster;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Problem_1985
{
    static class Solver {
        public String solve1(String[] arr, int k) {
            PriorityQueue<BigDecimal> pq = new PriorityQueue<>( Comparator.reverseOrder());
            for(int i = 0; i < arr.length; i++) {
                pq.add(new BigDecimal(arr[i]));
            }
            while(!pq.isEmpty() && k --> 1) {
                pq.poll();
            }
            return String.valueOf(pq.poll());
        }
    }
    static class Solver1 {
        public String solve1(String[] arr, int k) {
            PriorityQueue<String> pq = new PriorityQueue<>( ( str1, str2 ) -> {
                if(str1.length() == str2.length()) {
                    return str1.compareTo( str2 );
                }
                return Integer.compare( str1.length(), str2.length() );
            } );

            for(String num : arr) {
                pq.add( num );
                if(pq.size() > k) {
                    pq.poll();
                }
            }
            return pq.poll();
        }
    }
}

package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public int solve1(int[][] arr) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr.length; j++) {
                    if(i == j || ( (i + j) == (arr.length - 1) ) ) {
                        pq.add(arr[i][j]);
                    }
                }
            }
            while(!pq.isEmpty()) {
                int num = pq.poll();
                if(isPrime( num )) {
                    return num;
                }
            }
            return 0;
        }
        public boolean isPrime(int num) {
            if(num <= 1){
                return false;
            }
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}

package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1535
{
    static class Solver {
        public int solve1(int[] arr, int k) {
            int n = arr.length;
            LinkedList<Integer> ll = new LinkedList<>();
            for(int num : arr) {
                ll.add(num);
            }
            Map<Integer, Integer> winnerMap = new HashMap<>();
            int ans = 0;
            while(true) {
                int nowSelected = 0;
                if(ll.get( 0 ) > ll.get( 1 )) {
                    int numZero = ll.get( 0 );
                    winnerMap.put( numZero, winnerMap.getOrDefault( numZero, 0 ) + 1 );
                    nowSelected = numZero;
                    int m = ll.get( 1 );
                    ll.remove(1);
                    ll.addLast( m );
                } else {
                    int numOne = ll.get( 1 );
                    winnerMap.put( numOne, winnerMap.getOrDefault( numOne, 0 ) + 1 );
                    nowSelected = numOne;
                    int m = ll.get( 0 );
                    ll.remove(0);
                    ll.addLast( m );
                }
                if(winnerMap.get( nowSelected ) >= k || winnerMap.get( nowSelected ) >= n) {
                    ans = nowSelected;
                    break;
                }
            }
            return ans;
        }
    }
}

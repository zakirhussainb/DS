package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_900 {

    static class RLEIterator {

        LinkedHashMap<Integer, Integer> map;
        public RLEIterator( int[] encoding ) {
            map = new LinkedHashMap<>();
            for(int i = 0; i < encoding.length; i += 2) {
                if(encoding[i] == 0)
                    continue;
                if(!map.containsKey( encoding[i + 1] )) {
                    map.put(encoding[i + 1], encoding[i]);
                } else {
                    map.put( encoding[i + 1], map.get( encoding[i + 1] ) + encoding[i] );
                }
            }
        }

        public int next( int n ) {
            int lastExhausted = -1;
            Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();
            int num = itr.next().getKey();
            int val = map.get( num ) - n;
            map.put( num, Math.max( val, 0 ) );
            lastExhausted = num;
            if(map.remove( num, 0 )) {
                if(val < 0) {
                    lastExhausted = -1;
                }
            }
            return lastExhausted;
        }
    }
}

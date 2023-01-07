package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_B {
    static class DataStream {
        Map<Integer, Integer> map;
        LinkedList<Integer> queue;
        private final int size;
        private final int sVal;
        public DataStream(int value, int k) {
            map = new HashMap<>();
            queue = new LinkedList<>();
            size = k;
            sVal = value;
        }

        public boolean consec(int num) {
            queue.add(num);
            if(queue.size() > size) {
                int s = queue.removeFirst();
                if( map.containsKey( s ) ) {
                    map.put(s, map.get( s ) - 1);
                }
                map.remove( s, 0 );
            }
            if(num == sVal && map.containsKey( num ) ) {
                if(map.get( num ) < size) {
                    map.put(num, map.get( num ) + 1);
                }
            } else {
                map.put(num, 1);
            }
            return num == sVal && map.get( num ) == size;
        }
    }
}

package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_C {
    static class NumberContainers {
        // <Number, <Index, Number>>
        private final Map<Integer, TreeMap<Integer, Integer>> map;
        public NumberContainers() {
            map = new HashMap<>();
        }

        public void change(int index, int number) {
            if(!map.containsKey(number)) {
                map.put(number, new TreeMap<>());
            }
            // <10, <1,10>> ->
            for(Map.Entry<Integer, TreeMap<Integer, Integer>> entry : map.entrySet()) {
                if(entry.getValue().containsKey(index)) {
                    entry.getValue().remove(index);
                    break;
                }
            }

            map.get(number).put(index, number);
        }

        public int find(int number) {
            if(!map.containsKey(number)) {
                return -1;
            }
            if(map.get(number).size() == 0) {
                map.remove(number);
                return -1;
            } else {
                return map.get(number).firstKey();
            }
        }
    }
    static class NumberContainers1 {
        // <Number, <Index, Number>>
        private final Map<Integer, TreeSet<Integer>> map;
        public NumberContainers1() {
            map = new HashMap<>();
        }

        public void change(int index, int number) {
            if(!map.containsKey(number)) {
                map.put(number, new TreeSet<>());
            }
            // <10, <1,10>> ->
            for(Map.Entry<Integer, TreeSet<Integer>> entry : map.entrySet()) {
                if(entry.getValue().contains(index)) {
                    entry.getValue().remove(index);
                    break;
                }
            }

            map.get(number).add(index);
        }

        public int find(int number) {
            if(!map.containsKey(number)) {
                return -1;
            }
            if(map.get(number).size() == 0) {
                map.remove(number);
                return -1;
            } else {
                return map.get(number).first();
            }
        }
    }
    static class NumberContainers2 {
        // <Number, <Index, Number>>
        private final Map<Integer, PriorityQueue<Integer>> map;
        public NumberContainers2() {
            map = new HashMap<>();
        }

        public void change(int index, int number) {
            if(!map.containsKey(number)) {
                map.put(number, new PriorityQueue<>());
            }
            // <10, <1,10>> ->
            for(Map.Entry<Integer, PriorityQueue<Integer>> entry : map.entrySet()) {
                if(entry.getValue().contains(index)) {
                    entry.getValue().remove(index);
                    break;
                }
            }

            map.get(number).add(index);
        }

        public int find(int number) {
            if(!map.containsKey(number)) {
                return -1;
            }
            if(map.get(number).isEmpty()) {
                map.remove(number);
                return -1;
            } else {
                return map.get(number).peek();
            }
        }
    }
}

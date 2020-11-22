package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_981 {
    static class Solver {

        Map<String, TreeMap<Integer, String>> timeMap;
        public Solver() {
            timeMap = new HashMap<>();
        }
        public void set(String key, String value, int timestamp) {
            if( !timeMap.containsKey(key) ) {
                timeMap.put(key, new TreeMap<>());
            }
            timeMap.get(key).put(timestamp, value);
        }
        public String get(String key, int timestamp) {
            if( !timeMap.containsKey(key) ) {
                return "";
            }
            TreeMap<Integer, String> tree = timeMap.get(key);
            Integer t = tree.floorKey(timestamp);
            return t != null ? tree.get(t) : "";
        }
    }
}

package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_380 {
    /**
     * Your RandomizedSet object will be instantiated and called as such:
     * RandomizedSet obj = new RandomizedSet();
     * boolean param_1 = obj.insert(val);
     * boolean param_2 = obj.remove(val);
     * int param_3 = obj.getRandom();
     */

    // Very Good - Efficient Solution - Time O(1)
    static class RandomizedSet1 {
        Map<Integer, Integer> map;
        List<Integer> list;
        /** Initialize your data structure here. */
        public RandomizedSet1() {
            map = new HashMap<>();
            list = new ArrayList<>();
        }

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            if( map.containsKey(val) ) return false;

            map.put(val, list.size());
            list.add(list.size(), val);
            return true;
        }

        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            if( !map.containsKey(val) ) return false;

            int lastIndex = list.size() - 1;
            int lastElement = list.get(lastIndex);
            int currElementIndex = map.get(val);

            // list - swap the last element with the current index and then remove the last Index
            list.set(currElementIndex, lastElement);
            list.remove(lastIndex);

            // map - update the current index with the lastElement taken
            map.put(lastElement, currElementIndex);
            map.remove(val);

            return true;
        }

        /** Get a random element from the set. */
        public int getRandom() {
            return list.get(new Random().nextInt(list.size()));
        }
    }

    // Efficient Solution - Time O(N)
    static class RandomizedSet {
        Map<Integer, Integer> map;
        /** Initialize your data structure here. */
        public RandomizedSet() {
            map = new HashMap<>();
        }

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            if( !map.containsKey(val) ) {
                map.put(val, 1);
                return true;
            } else {
                map.put(val, map.get(val) + 1);
                return false;
            }
        }

        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            if( !map.containsKey(val) ) {
                return false;
            } else {
                map.remove(val);
                return true;
            }
        }

        /** Get a random element from the set. */
        public int getRandom() {
            int size = map.size();
            int item = new Random().nextInt(size);
            int i = 0;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(i == item) {
                    return entry.getKey();
                }
                i++;
            }
            return 0;
        }
    }
}

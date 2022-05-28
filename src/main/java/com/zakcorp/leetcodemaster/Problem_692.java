package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_692 {
    static class Solver {
        public List<String> solve1( String[] words, int k ) {
            Map<String, Integer> wordFreqMap = new HashMap<>();
            for(String word : words) {
                wordFreqMap.put( word, wordFreqMap.getOrDefault(word, 0) + 1 );
            }

/*
            PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>( ( entry1, entry2 ) ->
                    entry1.getValue() == entry2.getValue() ? entry1.getKey().compareTo(entry2.getKey()) : entry2.getValue() - entry1.getValue() );
*/

            // THE COMPARATOR WORKS WHEN ELEMENT IS ADDED TO PQ AND ALSO WHEN REMOVED FROM PQ
            PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>( new MyComparator() );
            pq.addAll( wordFreqMap.entrySet() );

            List<String> result = new LinkedList<>();
            for(int i = 0; i < k; i++) {
                result.add(pq.remove().getKey());
            }
            return result;
        }
    }

     /*  IF TWO ENTRIES HAVE SAME VALUES THEN
      -> THIS COMPARATOR WILL FIRST SORT IN DESCENDING ORDER OF VALUES
      -> THEN IT WILL SORT IN ASCENDING ORDER OF KEYS -> i.e. lexicographically the smallest word*/
    static class MyComparator implements Comparator<Map.Entry<String, Integer>> {
        @Override
        public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
            return e1.getValue().equals(e2.getValue()) ? e1.getKey().compareTo(e2.getKey()) : e2.getValue() - e1.getValue();
        }
    }
}

package com.zakcorp.leetcodemaster;

import com.zakcorp.codeforces.practice.Problem_230_A;

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
                    entry1.getValue() == entry2.getValue() ? entry2.getKey().compareTo(entry1.getKey()) : entry1.getValue() - entry2.getValue() );
*/

            List<String> result = new ArrayList<>();
            PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>( new MyComparator() );
            pq.addAll( wordFreqMap.entrySet() );
            while( !pq.isEmpty() && k > 0 ) {
                if(pq.size() > k) {
                    pq.poll();
                } else {
                    result.add(0, pq.remove().getKey());
                    k--;
                }
            }
            return result;
        }
    }
    static class MyComparator implements Comparator<Map.Entry<String, Integer>> {
        @Override
        public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
            return e1.getValue().equals(e2.getValue()) ? e2.getKey().compareTo(e1.getKey()) : e1.getValue() - e2.getValue();
        }
    }
}

package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_B {
    static class Solver {
        public String solve1(String[] messages, String[] senders) {
            Map<String, Integer> map = new HashMap<>();
            for(int i = 0; i < senders.length; i++) {
                int wordCount = getWordsCountInMessage(messages[i]);
                if(!map.containsKey(senders[i])) {
                    map.put(senders[i], wordCount);
                } else {
                    map.put(senders[i], map.get(senders[i]) + wordCount);
                }
            }
            PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>( new SortByValuesThenByKeyComparator() );
            pq.addAll( map.entrySet() );
            return pq.poll().getKey();
        }
        private int getWordsCountInMessage(String message) {
            String[] words = message.split("\\s+");
            return words.length;
        }
    }
    /*  IF TWO ENTRIES HAVE SAME VALUES THEN
      -> THIS COMPARATOR WILL FIRST SORT IN DESCENDING ORDER OF VALUES
      -> THEN IT WILL SORT IN DESCENDING ORDER OF KEYS -> i.e. lexicographically the largest word*/
    static class SortByValuesThenByKeyComparator implements Comparator<Map.Entry<String, Integer>> {
        @Override
        public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
            return e1.getValue().equals(e2.getValue()) ? e2.getKey().compareTo(e1.getKey()) : e2.getValue() - e1.getValue();
        }
    }
}

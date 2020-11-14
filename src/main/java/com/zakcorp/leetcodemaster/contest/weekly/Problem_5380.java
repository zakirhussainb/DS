package com.zakcorp.leetcodemaster.contest.weekly;
import java.util.*;
public class Problem_5380 {
    static class Solver {
        public List<String> stringMatchingUsingSet(String[] words) {
            List<String> list = new ArrayList<>();
            for(String w : words){
                Set<String> set = new HashSet<>();
                for(String q : words) {
                    if (!q.equals(w) && q.contains(w)) {
                        set.add(w);
                    }
                }
                list.addAll(set);
            }
            return list;
        }
        public List<String> stringMatching(String[] words) {
            List<String> list = new ArrayList<>();
            for(String s : words) {
                for(String q : words) {
                    if(q.equals(s))
                        continue;
                    if(q.contains(s)){
                        list.add(s);
                        break;
                    }
                }
            }
            return list;
        }
    }
}

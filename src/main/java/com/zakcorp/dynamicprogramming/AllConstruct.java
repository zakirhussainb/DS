package com.zakcorp.dynamicprogramming;

import java.util.*;
import java.util.stream.Collectors;

public class AllConstruct {
    static class Solver {
        public List<List<String>> solve1(String targetStr, List<String> wordDict) {
            if(targetStr.isEmpty()) {
                return Collections.singletonList(new ArrayList<>());
            }
            List<List<String>> resultList = new ArrayList<>();
            for(String word : wordDict) {
                if(targetStr.startsWith(word)) {
                    String suffix = targetStr.substring(word.length());
                    List<List<String>> ways = solve1(suffix, wordDict);
                    for(List<String> list : ways) {
                        list.add(0, word);
                    }
                    resultList.addAll(ways);
                }
            }
            return resultList;
        }
    }
    static class Solver1 {
        public List<List<String>> solve1(String targetStr, List<String> wordDict) {
            return memoized(targetStr, wordDict, new HashMap<>());
        }
        public List<List<String>> memoized(String targetStr, List<String> wordDict, HashMap<String, List<List<String>>> memo) {
            if(memo.containsKey(targetStr)) {
                return memo.get(targetStr);
            }
            if(targetStr.isEmpty()) {
                return Collections.singletonList(new ArrayList<>());
            }
            List<List<String>> resultList = new ArrayList<>();
            for(String word : wordDict) {
                if(targetStr.startsWith(word)) {
                    String suffix = targetStr.substring(word.length());
                    List<List<String>> ways = memoized(suffix, wordDict, memo)
                            .stream()
                            .map(ArrayList::new)
                            .collect( Collectors.toList() );
                    for(List<String> list : ways) {
                        list.add(0, word);
                    }
                    resultList.addAll(ways);
                }
            }
            memo.put(targetStr, resultList);
            return resultList;
        }
    }
}

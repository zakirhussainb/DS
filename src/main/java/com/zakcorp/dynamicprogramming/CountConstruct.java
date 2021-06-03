package com.zakcorp.dynamicprogramming;

import java.util.*;

public class CountConstruct {
    static class Solver {
        public int solve1(String targetStr, List<String> wordDict) {
            if(targetStr.isEmpty())
                return 1;
            int count = 0;
            for(String word : wordDict) {
                if( targetStr.startsWith(word) ) {
                    String suffix = targetStr.substring(word.length());
                    count += solve1(suffix, wordDict);
                }
            }
            return count;
        }
    }

    static class Solver1 {
        public int solve1(String targetStr, List<String> wordDict) {
            return memoFunc(targetStr, wordDict, new HashMap<>());
        }
        public int memoFunc(String targetStr, List<String> wordDict, HashMap<String, Integer> memo) {
            if(memo.containsKey(targetStr)) {
                return memo.get(targetStr);
            }
            if(targetStr.isEmpty())
                return 1;
            int count = 0;
            for(String word : wordDict) {
                if( targetStr.startsWith(word) ) {
                    String suffix = targetStr.substring(word.length());
                    count += memoFunc(suffix, wordDict, memo);
                }
            }
            memo.put(targetStr, count);
            return count;
        }
    }
}

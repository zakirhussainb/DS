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

    static class Solver2 {
        public int solve1(String targetStr, List<String> wordDict) {
            int m = targetStr.length();
            int[] dp = new int[m + 1];
            dp[0] = 1;
            for(int i = 0; i < dp.length; i++) {
                if(dp[i] != 0) {
                    String suffix = targetStr.substring(i);
                    for(String word : wordDict) {
                        if(suffix.startsWith(word)) {
                            dp[i + word.length()] += dp[i];
                        }
                    }
                }
            }
            return dp[m];
        }
    }





















}

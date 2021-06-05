package com.zakcorp.revision;

import java.util.ArrayList;
import java.util.List;

public class RevisionProblem {
    public static class RevisionSolver {
        public boolean canSum(int targetSum, int[] arr) {
            boolean[] dp = new boolean[targetSum + 1];
            dp[0] = true;
            for(int i = 0; i < dp.length; i++) {
                 for(int j = 0; j < arr.length; j++) {
                     if(dp[i] && i + arr[j] < dp.length) {
                         dp[i + arr[j]] = dp[i];
                     }
                 }
                 if(dp[targetSum])
                     break;
            }
            return dp[targetSum];
        }
        public List<Integer> howSum(int targetSum, int[] arr) {
            int n = arr.length;
            List<List<Integer>> dp = new ArrayList<>();
            dp.add(new ArrayList<>());
            for(int i = 1; i <= targetSum; i++) {
                dp.add(null);
            }
            for(int i = 0; i < dp.size(); i++) {
                if(dp.get(i) != null) {
                    for(int j = 0; j < n; j++ ) {
                        int dpIndex = i + arr[j];
                        if( dpIndex < dp.size() ) {
                            List<Integer> innerList = new ArrayList<>( dp.get(i) );
                            innerList.add(0, arr[j]);
                            if( dpIndex == targetSum ) {
                                return innerList;
                            }
                            dp.set( dpIndex, innerList );
                        }
                    }
                }
            }
            return null;
        }
        public List<Integer> bestSum(int targetSum, int[] arr) {
            int n = arr.length;
            List<List<Integer>> dp = new ArrayList<>();
            dp.add(new ArrayList<>());
            for(int i = 1; i <= targetSum; i++) {
                dp.add(null);
            }
            List<Integer> shortestComb = null;
            for(int i = 0; i < dp.size(); i++) {
                if(dp.get(i) != null) {
                    for(int j = 0; j < n; j++ ) {
                        int dpIndex = i + arr[j];
                        if( dpIndex < dp.size() ) {
                            List<Integer> innerList = new ArrayList<>( dp.get(i) );
                            innerList.add(0, arr[j]);
                            if( dpIndex == targetSum ) {
                                if(shortestComb == null || innerList.size() < shortestComb.size()) {
                                    shortestComb = innerList;
                                }
                            }
                            dp.set( dpIndex, innerList );
                        }
                    }
                }
            }
            return shortestComb;
        }
    }
}

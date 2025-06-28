package com.zakcorp.leetcodemaster;

public class Problem_3361 {
    static class Solver {
        public long solve1(String s, String t, int[] nextCost, int[] previousCost) {
            int p = previousCost.length;
            int[] psPC = new int[p];
            psPC[0] = previousCost[0];
            for(int i=1;i<p;i++) {
                psPC[i] = previousCost[i] + psPC[i - 1];
            }

            int n = nextCost.length;
            int[] psNC = new int[n];
            psNC[n - 1] = nextCost[n - 1];
            for(int i = n - 2; i >= 0; i--) {
                psNC[i] = nextCost[i] + psNC[i + 1];
            }

            long totalMinCost = 0;
            long minCost = 0;
            for(int i = 0; i < s.length(); i++) {
                char sch = s.charAt(i);
                char tch = t.charAt(i);

                int temp =  Math.abs(psPC[sch - 'a'] - psPC[tch - 'a']);
                int prevCostVal = Math.abs(temp - psPC[25]);

                temp = Math.abs(psNC[sch - 'a'] - psNC[tch - 'a']);
                int nextCostVal = Math.abs(temp - psNC[0]);
                // Calculation using prevCost
                // from 'l' to 'c' - { Calculate 'l' - 'a' then 'c' - 'a' = will give you the distance between 'l' - 'c' }
                minCost = Math.min(prevCostVal, nextCostVal);
                totalMinCost += minCost;
            }

            return totalMinCost;
        }
        public long solve2(String s, String t, int[] nextCost, int[] previousCost) {
            int n = s.length();
            long[] next = new long[26]; // A prefix sum array for nextCost
            long[] prev = new long[26]; // A suffix sum array for previousCost

            for (int i = 0; i < 26; i++) {
                next[i] = nextCost[i];
                prev[i] = previousCost[i];
            }

            // Calculate cumulative costs for next and previous
            for (int i = 1; i < 26; i++) {
                next[i] += next[i - 1];
            }

            for (int i = 24; i >= 0; i--) {
                prev[i] += prev[i + 1];
            }

            long cost = 0;
            for(int i = 0; i < n; i++){
                if(s.charAt(i) != t.charAt(i)){
                    int start = s.charAt(i) - 'a', end = t.charAt(i) - 'a';

                    if(start < end){ // case 1
                        long forwardCost = next[end - 1];
                        if(start > 0) {
                            forwardCost -= next[start - 1];
                        }
                        long backwardCost = prev[0];
                        if(start + 1 < 26) {
                            backwardCost -= prev[start + 1];
                            if(end != 25) {
                                backwardCost += prev[end + 1];
                            }
                        }
                        cost += Math.min(forwardCost, backwardCost);
                    }
                    else { // case 2
                        long backwardCost = prev[end + 1];
                        if(start < 25) {
                            backwardCost -= prev[start + 1];
                        }
                        long forwardCost = next[25] - next[start - 1];
                        if(end != 0) {
                            forwardCost += next[end - 1];
                        }
                        cost += Math.min(forwardCost, backwardCost);
                    }
                }
            }

            return cost;
        }
    }
}

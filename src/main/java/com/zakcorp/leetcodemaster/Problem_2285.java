package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.Graph;

import java.util.*;

public class Problem_2285
{
    /*
    What is degree of a node in a graph ?
        - Sum of (No. of edges that go from the node + No. of edges that come towards the node)
    What is inDegree ?
        - No. of edges that come towards the node
    What is outDegree ?
        - No. of edges that go from the node
     */
    static class Solver {
        public long solve1(int n, int[][] roads) {
            long ans = 0, cityVal = 1;
            long[] degree = new long[n];
            for(int[] road : roads) {
                degree[road[0]]++;
                degree[road[1]]++;
            }
            Arrays.sort( degree );
            for(long i : degree)
                ans += i * (cityVal++);
            return ans;
        }
    }
}

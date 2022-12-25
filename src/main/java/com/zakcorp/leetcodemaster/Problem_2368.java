package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.Graph;

import java.util.*;

public class Problem_2368
{
    static class Solver {
        public int solve1(int n, int[][] edges, int[] restricted) {
            Set<Integer> set = new HashSet<>();
            for(int num : restricted)
                set.add(num);
            Graph g = new Graph( n );
            for(int[] edge : edges) {
                g.addEdge( edge[0], edge[1] );
            }
            int[] res = {1};
            dfs(0, g, res, set, new boolean[n]);
            return res[0];
        }
        private void dfs(int src, Graph g, int[] res, Set<Integer> set, boolean[] visited) {
            visited[src] = true;
            for(int x : g.adjListArray[src]) {
                if(!set.contains( x ) && !visited[x]) {
                    res[0]++;
                    dfs(x, g, res, set, visited);
                }
            }
        }
    }
}

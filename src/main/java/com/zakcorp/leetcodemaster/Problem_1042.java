package com.zakcorp.leetcodemaster;

import java.util.Arrays;
import java.util.LinkedList;

/*
Good Graph + Backtracking problem
To understand the solution/theory behind this problem -> please refer this video.
Striver Recursion Series
https://youtu.be/wuVwUK25Rfc?list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9
There is a variation for this problem in L16 M Coloring Problem
 */
public class Problem_1042 {
    static class Graph {
        private int V;
        private LinkedList<Integer>[] adjListArr;
        public Graph(int V) {
            this.V = V;
            adjListArr = new LinkedList[V];
            for(int i = 1; i < V; i++) {
                adjListArr[i] = new LinkedList<>();
            }
        }
        private void addEdge(int u, int v) {
            adjListArr[u].add(v);
            adjListArr[v].add(u);
        }
    }
    static class Solver {
        public int[] solve1(int n, int[][] paths) {
            Graph g = new Graph(n + 1);
            for(int[] path : paths) {
                g.addEdge(path[0], path[1]);
            }
            int[] colors = new int[g.V];
            backtrack(1, g, g.V, colors);
            return Arrays.copyOfRange(colors, 1, colors.length);
        }
        private boolean backtrack(int node, Graph g, int n, int[] colors) {
            if(node == n) {
                return true;
            }
            for(int flower = 1; flower <= 4; flower++) {
                if(isSafeToPlantFlowers(node, g, colors, flower)) {
                    colors[node] = flower;
                    if(backtrack(node + 1, g, n, colors))
                        return true;
                    colors[node] = 0;
                }
            }
            return false;
        }
        private boolean isSafeToPlantFlowers(int node, Graph g, int[] colors, int flower) {
            for(int src : g.adjListArr[node]) {
                if(colors[src] == flower) {
                    return false;
                }
            }
            return true;
        }
    }
}

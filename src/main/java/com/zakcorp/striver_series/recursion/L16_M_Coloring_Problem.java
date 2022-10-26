package com.zakcorp.striver_series.recursion;

import java.util.LinkedList;

/*
Good Graph + Backtracking problem
Striver Recursion Series
https://youtu.be/wuVwUK25Rfc?list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9
There is a variation for this problem in LeetCode -> No. 1042
 */
public class L16_M_Coloring_Problem
{
    static class Graph {
        public int V;
        public LinkedList<Integer>[] adjListArray;
        public Graph(int V) {
            this.V = V;
            adjListArray = new LinkedList[V];
            for(int i = 1; i < V; i++) {
                adjListArray[i] = new LinkedList<>();
            }
        }
        public void addEdge(int u, int v) {
            adjListArray[u].add(v);
            adjListArray[v].add(u);
        }
    }
    static class Solver {
        public boolean colorGraph(int n, int[][] paths, int m) {
            Graph g = new Graph(n + 1);
            for(int[] path : paths) {
                g.addEdge(path[0], path[1]);
            }
            return backtrack(1, g, g.V, m, new int[g.V]);
        }
        private boolean backtrack(int node, Graph g, int n, int m, int[] colors) {
            if(node == n)
                return true;
            for(int col = 1; col <= m; col++) {
                if(isSafeToColor(node, g, col, colors)) {
                    colors[node] = col;
                    if( backtrack(node + 1, g, n, m, colors) )
                        return true;
                    colors[node] = 0;
                }
            }
            return false;
        }
        private boolean isSafeToColor(int node, Graph g, int col, int[] colors) {
            for(int src : g.adjListArray[node]) {
                if(colors[src] == col) {
                    return false;
                }
            }
            return true;
        }
    }
}

package com.zakcorp.striver_series.graphs.hard_problems_ii;

import com.zakcorp.striver_series.graphs.mst.DisjointSet;

public class NumberOfOperationsToMakeNwConn {
    static class Solver {

        public int solve(int n, int[][] edges) {
            DisjointSet ds = new DisjointSet(n);
            int extraEdges = 0;

            for(int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];

                if(ds.find(u, v)) { // If u and v both have same ultimate parent
                    extraEdges++;
                } else {
                    ds.unionBySize(u, v);
                }
            }

            // find connected components
            int cc = 0;
            for(int i = 0; i < n; i++) {
                if(ds.parent[i] == i) {
                    cc++;
                }
            }
            if(extraEdges >= cc - 1) {
                return extraEdges;
            }
            return -1;
        }
    }
}

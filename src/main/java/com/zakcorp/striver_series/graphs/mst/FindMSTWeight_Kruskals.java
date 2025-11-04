package com.zakcorp.striver_series.graphs.mst;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class FindMSTWeight_Kruskals {
    static class Solver {
        public int spanningTree(int V, List<List<List<Integer>>> adj) {
            List<int[]> edges = new ArrayList<>();
            for(int i = 0; i < V; i++) {
                for(List<Integer> n : adj.get(i)) {
                    int u = i;
                    int v = n.get(0);
                    int wt = n.get(1);

                    edges.add(new int[]{wt, u, v});
                }
            }

            edges.sort(Comparator.comparingInt(a -> a[0])); // sort edges by weight

            int sum = 0;

            DisjointSet ds = new DisjointSet(V);

            for(int[] it : edges) {
                int wt = it[0];
                int u = it[1];
                int v = it[2];

                if(!ds.find(u, v)) {
                    sum += wt;
                    ds.unionBySize(u, v);
                }
            }

            return sum;
        }
    }
}

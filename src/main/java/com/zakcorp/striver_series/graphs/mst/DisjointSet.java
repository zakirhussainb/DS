package com.zakcorp.striver_series.graphs.mst;

import java.util.*;
public class DisjointSet {
    public int[] rank;
    public int[] parent;
    public int[] size;
    public DisjointSet(int n) {
        rank = new int[n + 1];
        parent = new int[n + 1];
        size = new int[n + 1];
        Arrays.fill(size, 1); // every node is a component in itself when we start this, so default size is 1

        for(int i = 0; i <= n; i++) {
            parent[i] = i; // parent will be themselves
        }
    }

    // Helper function to find ultimate parent along with path compression
    private int findUPar(int node) {
        if(node == parent[node]) {
            return node;
        }
        parent[node] = findUPar(parent[node]); // path compression - store ultimate parent, instead of immediate parent
        return parent[node];
    }

    // Function to determine if two nodes are in same component or not
    public boolean find(int u, int v) {
        return findUPar(u) == findUPar(v);
    }

    // When do you union two nodes, when they belong to different components.
    public void unionByRank(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);

        // Nodes already belong to same component
        if(ulp_u == ulp_v) return;

        if(rank[ulp_u] < rank[ulp_v]) {
            parent[ulp_u] = ulp_v;
        } else if(rank[ulp_v] < rank[ulp_u]) {
            parent[ulp_v] = ulp_u;
        } else {
            parent[ulp_v] = ulp_u;
            rank[ulp_u]++;
        }
    }

    public void unionBySize(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);

        if(ulp_u == ulp_v) return;

        if(size[ulp_u] < size[ulp_v]) {
            parent[ulp_u] = ulp_v;
            size[ulp_v] += size[ulp_u];
        } else {
            parent[ulp_v] = ulp_u;
            size[ulp_u] += size[ulp_v];
        }
    }
}

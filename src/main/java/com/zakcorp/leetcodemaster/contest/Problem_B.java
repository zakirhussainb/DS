package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_B {

    static class Solver1 {
        /**
         * Disjoint Set Union (DSU) or Union-Find data structure.
         * Used to efficiently track connected components.
         */
        class DSU {
            private int[] parent;
            private int components;

            public DSU(int n) {
                this.components = n;
                this.parent = new int[n];
                for (int i = 0; i < n; i++) {
                    parent[i] = i;
                }
            }
            public int find(int i) {
                if (parent[i] == i) {
                    return i;
                }
                parent[i] = find(parent[i]);
                return parent[i];
            }

            public void union(int i, int j) {
                int rootI = find(i);
                int rootJ = find(j);

                if (rootI != rootJ) {
                    parent[rootI] = rootJ;
                    components--;
                }
            }
            public int getComponents() {
                return components;
            }
        }

        public int solve1(int n, int[][] edges, int k) {
            // Binary search on the answer (the cost).
            // The lowest possible cost is 0, the highest is the max weight.
            int low = 0;
            int high = 1_000_000; // Max weight given by constraints.
            int ans = high;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                // Check if it's possible to achieve at most k components
                // if we only use edges with weight <= mid.
                if (isPossible(n, edges, k, mid)) {
                    // 'mid' is a potential answer. Try for an even smaller cost.
                    ans = mid;
                    high = mid - 1;
                } else {
                    // 'mid' is too small. We need to allow more expensive edges
                    // to connect more components.
                    low = mid + 1;
                }
            }
            return ans;
        }

        /**
         * Checks if it's possible to have at most 'k' components using only edges
         * with weight less than or equal to 'maxAllowedCost'.
         */
        private boolean isPossible(int n, int[][] edges, int k, int maxAllowedCost) {
            DSU dsu = new DSU(n);

            // Connect nodes using all "affordable" edges.
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int weight = edge[2];

                if (weight <= maxAllowedCost) {
                    dsu.union(u, v);
                }
            }

            // If the number of components is within the limit, it's possible.
            return dsu.getComponents() <= k;
        }
    }
}

package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        private static final int MOD = 1000000007;
        public int[] baseUnitConversions(int[][] conversions) {
            int n = conversions.length + 1;
            List<List<int[]>> graph = new ArrayList<>();
            int[] inDegree = new int[n];
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }
            for (int[] conv : conversions) {
                int u = conv[0];
                int v = conv[1];
                int factor = conv[2];
                graph.get(u).add(new int[]{v, factor});
                inDegree[v]++;
            }

            // Initialize conversion factors
            int[] baseUnitConversion = new int[n];
            Arrays.fill(baseUnitConversion, -1);
            baseUnitConversion[0] = 1;

            // Topological sort using Kahn's algorithm
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                if (inDegree[i] == 0) {
                    queue.offer(i);
                }
            }

            while (!queue.isEmpty()) {
                int current = queue.poll();

                for (int[] neighbor : graph.get(current)) {
                    int target = neighbor[0];
                    int factor = neighbor[1];

                    // Calculate the conversion factor
                    long conversion = ((long) baseUnitConversion[current] * factor) % MOD;
                    if (baseUnitConversion[target] == -1) {
                        baseUnitConversion[target] = (int) conversion;
                    } else {
                        // Since paths are unique, this shouldn't happen per problem statement
                        baseUnitConversion[target] = (int) conversion;
                    }

                    inDegree[target]--;
                    if (inDegree[target] == 0) {
                        queue.offer(target);
                    }
                }
            }

            return baseUnitConversion;
        }

    }
}

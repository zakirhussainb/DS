package com.zakcorp.striver_series.graphs.shortestpathalgos;

import java.util.*;
public class NumberOfWaysToArriveAtDest {
    static class Solver {
        public int countPaths(int n, List<List<Integer>> roads) {
            int MOD = 1000_000_007;
            // Create adjacency list for forming a graph
            List<int[]>[] adjList = new ArrayList[n];
            for(int i = 0; i < n; i++) {
                adjList[i] = new ArrayList<>();
            }
            // Initialize the edges from the given input
            for(List<Integer> road : roads) {
                int u = road.get(0);
                int v = road.get(1);
                int w = road.get(2);

                adjList[u].add(new int[]{v, w}); // node, edgeTime
                adjList[v].add(new int[]{u, w}); // node, edgeTime
            }

            // Create the minimum time array
            long[] minTime = new long[n];
            Arrays.fill(minTime, Long.MAX_VALUE);

            // Create the array to store the number of ways
            int[] ways = new int[n];

            // Initialize the defaults
            minTime[0] = 0;
            ways[0] = 1;

            // Create a min-heap priority queue
            PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
            pq.add(new long[]{0, 0}); // time, node

            while(!pq.isEmpty()) {
                long[] cell = pq.poll();

                long time = cell[0];
                int node = (int) cell[1];

                for(int[] neighbor : adjList[node]) {
                    int neighborNode = neighbor[0];
                    int neighborTime = neighbor[1];

                    if(time + neighborTime < minTime[neighborNode]) {
                        minTime[neighborNode] = time + neighborTime;
                        ways[neighborNode] = ways[node];
                        pq.add(new long[]{minTime[neighborNode], neighborNode});
                    } else if(time + neighborTime == minTime[neighborNode]) {
                        ways[neighborNode] = (ways[neighborNode] + ways[node]) % MOD;
                    }
                }
            }
            return ways[n - 1] % MOD;
        }
    }
}

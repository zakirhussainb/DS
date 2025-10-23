package com.zakcorp.striver_series.graphs.shortestpathalgos;

import java.util.*;

public class CheapestFlightWithinKStops {
    static class Solver {
        public int cheapestFlight(int n, int[][] flights, int src, int dst, int K) {
            List<int[]>[] adjList = new ArrayList[n];
            for(int i = 0; i < n; i++) {
                adjList[i] = new ArrayList<>();
            }

            for(int[] flight : flights) {
                int u = flight[0];
                int v = flight[1];
                int price = flight[2];

                adjList[u].add(new int[]{v, price}); // only directed edge
            }

            int[] prices = new int[n];
            Arrays.fill(prices, (int)1e9);
            prices[src] = 0;

            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{0, src, -1}); // price, node, edge

            while(!queue.isEmpty()) {
                int[] nodeInfo = queue.poll();

                int price = nodeInfo[0];
                int node = nodeInfo[1];
                int edgeCount = nodeInfo[2];

                if(edgeCount > K) continue;

                for(int[] neighbor : adjList[node]) {
                    int neighborNode = neighbor[0];
                    int neighborPrice = neighbor[1];
                    int updatedEdgeCount = edgeCount + 1;

                    if(price + neighborPrice < prices[neighborNode] && updatedEdgeCount <= K) {
                        prices[neighborNode] = price + neighborPrice;
                        queue.add(new int[]{prices[neighborNode], neighborNode, updatedEdgeCount});
                    }
                }
            }

            if(prices[dst] == (int)1e9) return -1;

            return prices[dst];
        }
    }
}

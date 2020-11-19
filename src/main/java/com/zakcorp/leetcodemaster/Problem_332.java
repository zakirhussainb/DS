package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_332 {
    static class Solver {
        Map<String, LinkedList<String>> flightMap = new HashMap<>();
        LinkedList<String> result = new LinkedList<>();
        public List<String> solve1(List<List<String>> tickets) {
            // Build the Graph
            constructGraph(tickets);

            // Order the Destinations
            flightMap.forEach( (k, v) -> Collections.sort(v) );

            // Post Order DFS
            dfs("JFK");
            return result;
        }
        private void constructGraph(List<List<String>> tickets) {
            for(List<String> ticket : tickets) {
                String origin = ticket.get(0);
                String destination = ticket.get(1);
                if(!flightMap.containsKey(origin)) {
                    flightMap.put(origin, new LinkedList<>());
                }
                flightMap.get(origin).add(destination);
            }
        }
        private void dfs(String origin) {
            // Visit all the out going edges first
            if(flightMap.containsKey(origin)) {
                LinkedList<String> destinationList = flightMap.get(origin);
                while( !destinationList.isEmpty() ) {
                    dfs(destinationList.pollFirst());
                }
            }
            result.addFirst(origin);
        }
    }
}

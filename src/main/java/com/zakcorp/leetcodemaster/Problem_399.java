package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 02/09/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_399 {
    /**
     * equations = [ ["a", "b"], ["b", "c"] ],
     * values = [2.0, 3.0],
     * queries = [ ["a", "c"], ["b", "a"], ["a", "e"], ["a", "a"], ["x", "x"] ].
     */
    static class Solver {
        public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
            int m = queries.size();
            double[] result = new double[m];
            Map<String, Map<String, Double>> graph = buildGraph(equations, values);
            for(int i = 0; i < m; i++) {
                result[i] = getPathWeight(queries.get(i).get(0), queries.get(i).get(1), new HashSet<>(), graph);
            }
            return result;
        }

        private double getPathWeight(String start, String end, Set<String> visited, Map<String, Map<String, Double>> graph) {
            // Rejection Case
            if( !graph.containsKey(start) ) {
                return -1.0;
            }
            // Accepting Case
            if( graph.get(start).containsKey(end) ) {
                return graph.get(start).get(end);
            }

            visited.add(start);
            for(Map.Entry<String, Double> entry : graph.get(start).entrySet()) {
                if( !visited.contains(entry.getKey()) ) {
                    double productWeight = getPathWeight(entry.getKey(), end, visited, graph);
                    if( productWeight != -1.0 ) {
                        return entry.getValue() * productWeight;
                    }
                }
            }
            return -1.0;
        }

        private Map<String, Map<String, Double>> buildGraph(List<List<String>> equations, double[] values) {
            Map<String, Map<String, Double>> graph = new HashMap<>();
            String u, v;
            for(int i = 0; i < equations.size(); i++) {
                u = equations.get(i).get(0);
                v = equations.get(i).get(1);
                graph.putIfAbsent(u, new HashMap<>());
                graph.get(u).put(v, values[i]);
                graph.putIfAbsent(v, new HashMap<>());
                graph.get(v).put(u, 1 / values[i]);
            }
            return graph;
        }
    }
}
package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_797 {
    static class Solver {
        private int[][] graph;
        private List<List<Integer>> results;
        private int targetNode;

        public List<List<Integer>> solve1(int[][] graph) {
            this.graph = graph;
            this.targetNode = graph.length - 1;
            this.results = new ArrayList<>();

            int currNode = 0;
            LinkedList<Integer> path = new LinkedList<>();
            path.addLast(currNode);
            backtrack(currNode, path);
            return results;
        }
        private void backtrack(int currNode, LinkedList<Integer> path) {
            if(currNode == targetNode) {
                results.add(new ArrayList<>(path));
                return;
            }
            // explore the neighbours of the currNode
            for(int node : graph[currNode]) {
                path.addLast(node);
                backtrack(node, path);
                path.removeLast();
            }
        }
    }
    static class Solver1 {
        public List<List<Integer>> solve1(int[][] graph) {
            int targetNode = graph.length - 1;
            int currentNode = 0;
            List<List<Integer>> results = new ArrayList<>();
            LinkedList<Integer> path = new LinkedList<>();
            path.addLast(currentNode);
            backtrack(graph, currentNode, targetNode, path, results);
            return results;
        }
        private void backtrack(int[][] graph, int currentNode, int targetNode, LinkedList<Integer> path, List<List<Integer>> results) {
            if(currentNode == targetNode) {
                results.add( new ArrayList<>(path) );
                return;
            }
            for(int node : graph[currentNode]) {
                path.addLast( node );
                backtrack( graph, node, targetNode, path, results );
                path.removeLast();
            }
        }
    }
}

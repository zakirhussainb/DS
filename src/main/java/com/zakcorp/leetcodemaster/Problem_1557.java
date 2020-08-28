package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 28/08/20.
 *
 * @source: LeetCode
 * @topic: Graphs
 * @sub-topic: DFS, InDegree of a graph
 * @platform: LeetCode
 * @problem_link: https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/
 * @pseudocode: Just add the nodes with no-indegrees.
 */
public class Problem_1557 {
    /**
     * The solution in Solver doesn't work and fails for some edge cases, this is here to just to make you remember of your mistakes.
     */
    /*static class Solver {
        static class Graph {
            private LinkedList<Integer>[] adjListArr;
            public Graph(int V){
                adjListArr = new LinkedList[V];
                for(int i = 0; i < V; i++) {
                    adjListArr[i] = new LinkedList<>();
                }
            }
            public void addEdge(List<List<Integer>> edges) {
                for (List<Integer> edge : edges) {
                    for (int j = 0; j < 1; j++) {
                        adjListArr[edge.get(j)].add(edge.get(j + 1));
                    }
                }
            }
        }

        public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
            Graph g = new Graph(n);
            g.addEdge(edges);
            List<Integer> resList = new ArrayList<>();
            boolean[] visited = new boolean[n];
            for(int i = 0; i < n; i++) {
                if( !visited[i] ) {
                    resList.add(i);
                    dfs(i, visited, g);
                }
            }
            return resList;
        }
        public void dfs(int s, boolean[] visited, Graph g){
            visited[s] = true;
            for(Integer i : g.adjListArr[s]){
                if( !visited[i] ){
                    dfs(i, visited, g);
                }
            }
        }
    }*/
    static class Solver1 {
        public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
            Set<Integer> inDegreeSet = new HashSet<>();
            Set<Integer> outDegreeSet = new HashSet<>();
            for(List<Integer> list : edges) {
                outDegreeSet.add(list.get(1));
            }
            for(List<Integer> list : edges) {
                if(!outDegreeSet.contains(list.get(0))) {
                    inDegreeSet.add(list.get(0));
                }
            }
            return new ArrayList<>(inDegreeSet);
        }
    }
    static class Solver2 {
        public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
            List<Integer> resultList = new ArrayList<>();
            int[] hash = new int[n];
            for(List<Integer> list : edges) {
                hash[list.get(1)] = 1; // It is enough to be seen.
//                hash[list.get(1)]++;// Don't need to increment values, it is enough to be seen.
            }
            for(int i = 0; i < hash.length; i++) {
                if(hash[i] == 0) {
                    resultList.add(i);
                }
            }
            return resultList;
         }
    }
}
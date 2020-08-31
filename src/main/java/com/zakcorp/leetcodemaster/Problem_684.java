package com.zakcorp.leetcodemaster;

/**
 * Created by Zakir Hussain B on 31/08/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_684 {
    static class Solver {
        int[] resultEdge = new int[2];
        public int[] findRedundantConnection(int[][] edges) {
            int n = edges.length;
            boolean[] visited = new boolean[n + 1];
            for(int[] arr : edges) {
                isArrayVisited(arr, visited);
            }
            return resultEdge;
        }

        private void isArrayVisited(int[] arr, boolean[] visited) {
            int count = 0;
            for(int i : arr) {
                if( !visited[i] ) {
                    visited[i] = true;
                    count++;
                }
            }
            if(count == 0) {
                resultEdge = arr;
            }
        }
    }
}
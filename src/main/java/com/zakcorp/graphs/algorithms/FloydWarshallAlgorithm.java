package com.zakcorp.graphs.algorithms;

/**
 * Created by Zakir Hussain B on 23/08/20.
 *
 * @source: General
 * @topic: Graphs
 * @sub-topic: ShortestPath
 * @platform: GeeksForGeeks
 * @problem_link: https://www.geeksforgeeks.org/floyd-warshall-algorithm-dp-16/,
 * https://cp-algorithms.com/graph/all-pair-shortest-path-floyd-warshall.html
 * @pseudocode:
 */
public class FloydWarshallAlgorithm {
    public int[][] distance;
    public int V;
    public FloydWarshallAlgorithm(int V) {
        this.V = V;
        distance = new int[V][V];
    }
    public void findAllPairShortestPath(int[][] graph) {
        for(int i = 0; i < V; i++) {
            System.arraycopy(graph[i], 0, distance[i], 0, V);
        }
        for(int k = 0; k < V; k++) {
            for(int i = 0; i < V; i++) {
                for(int j = 0; j < V; j++) {
                    if(distance[i][k] != Integer.MAX_VALUE && distance[k][j] != Integer.MAX_VALUE)
                        distance[i][j] = Math.min(distance[i][j], distance[i][k] + distance[k][j]);
                }
            }
        }
    }
}
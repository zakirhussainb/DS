package com.zakcorp.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Zakir Hussain B on 21/08/20.
 *
 * @source: General
 * @topic: Graph
 * @sub-topic: ShortestPath
 * @platform: GeeksForGeeks
 * @problem_link: https://www.geeksforgeeks.org/bellman-ford-algorithm-dp-23/
 * @pseudocode: Bellman–Ford Algorithm
 *
 * TODO:- Don't use an adjacency list of vertices, it is sufficient enough to use list of edges.
 *
 * bellmanFord(src):
 * // V -> No. of vertex in the graph
 * dist[V] // result array of minimum distance, output
 * settled[T/F] // boolean array to mark settled/relaxed nodes
 * dijkstra(src):
 *      for all u in V:
 *          dist(u) = Infinity
 *      dist[src] = 0
 *      for all v in V:
 *         u = getMinimumDistNode();
 *         settled[u] = true
 *         explore(u)
 *
 *  explore(u):
 *      for all v in u:
 *          if( settled does not contain "v" )
 *              dist[v] = min(dist[v], dist[u] + length(u, v))
 *              pq.add(v)
 */
public class BellmanFordAlgorithm {
    DirectedGraph g;
    int[] dist;
    int[] pathArr;

    public BellmanFordAlgorithm(DirectedGraph g) {
        this.g = g;
        dist = new int[g.vertex];
        pathArr = new int[g.vertex];
    }
    public void findShortestPath(int src) {
        for(int i = 0; i < g.vertex; i++) {
            dist[i] = Integer.MAX_VALUE;
            pathArr[i] = -1;
        }
        dist[src] = 0;
        // Find Shortest Path for all vertices
        while(true) {
            boolean flag = false;
            for(Edge e : g.edgeList) {
                if( dist[e.src] != Integer.MAX_VALUE ) {
                    dist[e.dest] = Math.min(dist[e.dest], dist[e.src] + e.cost);
                    flag = true;
                }
            }
            if (flag) {
                break;
            }
        }
        int lastV = g.vertex - 1;
        if(dist[lastV] == Integer.MAX_VALUE) {
            System.out.println("No path from " + src + " to " + lastV);
        } else {
            List<Integer> shortestPaths = new ArrayList<>();
            for(int cur = lastV; cur != -1; cur = pathArr[cur]) {
                shortestPaths.add(cur);
            }
            Collections.reverse(shortestPaths);
            System.out.print("Path From " + src + " to " + lastV + ": ");
            for(Integer i : shortestPaths) {
                System.out.println(pathArr[i] + ' ');
            }
        }
    }
}
class Edge {
    protected int src;
    protected int dest;
    protected int cost;
    public Edge(int src, int dest, int cost) {
        this.src = src;
        this.dest = dest;
        this.cost = cost;
    }
}

class DirectedGraph {
    protected int vertex;
    public int[] distance;
    protected List<Edge> edgeList;
    public DirectedGraph(int vertex) {
        this.vertex = vertex;
        distance = new int[vertex];
        edgeList = new LinkedList<>();
    }
    protected void addEdge(int src, int dest, int cost) {
        edgeList.add(new Edge(src, dest, cost));
    }
    private void printGraph() {
//        for (int i = 0; i < vertex; i++) {
//            System.out.print("head");
//            for (int j = 0; j < adjListArray[i].size(); j++) {
//                System.out.print(" -> " + adjListArray[i].get(j).node + "(" +
//                        adjListArray[i].get(j).cost + ")");
//            }
//            System.out.println();
//        }
    }
}
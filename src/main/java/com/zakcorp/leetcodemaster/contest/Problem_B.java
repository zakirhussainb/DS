package com.zakcorp.leetcodemaster.contest;

import com.zakcorp.graphs.algorithms.PrimsAlgorithm;
import com.zakcorp.leetcodemaster.Problem_207;

import java.util.*;

public class Problem_B {
    // Good Brute Force Solution, Got TLE, since the arr size is 10 ^ 5;
    static class Solver {
        static class Graph {
            private int V;
            private LinkedList<Integer>[] adjListArr;
            static class Vertex {
                private int node;
                private List<Integer> languages;
                public Vertex() { }
                public Vertex(int node, List<Integer> languages) {
                    this.node = node;
                    this.languages = languages;
                }
            }
            public Graph(int V) {
                this.V = V;
                adjListArr = new LinkedList[V];
                for(int i = 0; i < V; i++) {
                    adjListArr[i] = new LinkedList<>();
                }
            }
        }
        public int solve1(int n, int[][] languages, int[][] friendships) {

            return 0;
        }
    }
}

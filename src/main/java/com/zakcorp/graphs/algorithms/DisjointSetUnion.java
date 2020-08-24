package com.zakcorp.graphs.algorithms;

/**
 * Created by Zakir Hussain B on 24/08/20.
 *
 * @source: https://youtu.be/BcRLmCS8pfw?list=PLRdD1c6QbAqJn0606RlOR6T3yUqFWKwmX -> Robert Sedgewick Youtube Channel
 * @topic: Graphs
 * @sub-topic: Disjoint-Set-Union (DSU)
 * @platform: General
 * @problem_link: https://youtu.be/BcRLmCS8pfw?list=PLRdD1c6QbAqJn0606RlOR6T3yUqFWKwmX
 * @pseudocode: DisjointSetUnion (DSU) attempts to solve the dynamic connectivity problems.
 */
public class DisjointSetUnion {
    /**
     * Cost Model:- Number of array accesses (for read or write).
     *
     * Initialize:- O(N)
     * Union:- O(N)
     * Union:- O(N)
     * Find:- O(1)
     *
     * NOTE:- Takes O(N^2) array accesses to process sequence of "N union commands on N objects", i.e. quadratic time.
     * Talking rough:- Let's say we have 1 Billion objects and we perform 1 Billion Union operations on them -> 10^18 operations
     * So it will take 30 years to complete.
     *
     * Quick-Find drawbacks:-
     *   1. Union is too expensive(N array accesses).
     *   2. Trees are flat(which is fine), but are too expensive to keep them flat.
     */
    static class QuickFind {
        private int[] parent;
        // Set id of each object to itself (N array accesses)
        public QuickFind(int N) {
            parent = new int[N];
            for(int i = 0; i < N; i++) {
                parent[i] = i;
            }
        }
        // Check whether a and b are in the same component (2 array accesses)
        public boolean connected(int a, int b) {
            return parent[a] == parent[b];
        }
        // Change all entries with parent[a] to parent[b]
        // At most (2N + 2) array accesses
        public void union(int a, int b) {
            int aId = parent[a];
            int bId = parent[b];
            for(int i = 0; i < parent.length; i++) {
                if(parent[i] == aId) {
                    parent[i] = bId;
                }
            }
        }
    }

    /**
     * Lazy approach to algorithm design, where we try to avoid the work until we have to.
     *
     * Cost Model:- Number of array accesses (for read or write).
     *
     * Initialize:- O(N)
     * Union:- O(N)
     * Union:- O(N)
     * Find:- O(N) -> In worst case
     *
     * Quick-Union drawbacks:-
     *  1. Trees can get tall.
     *  2. Find too expensive (could be N array accesses).
     */
    static class QuickUnion {
        private int[] parent;
        // Set id of each object to itself (N array accesses)
        public QuickUnion(int N) {
            parent = new int[N];
            for(int i = 0; i < N; i++){
                parent[i] = i;
            }
        }
        // Chase parent pointers until reach root(depth of i array accesses)
        private int root(int i) {
            while(i != parent[i]) {
                i = parent[i];
            }
            return i;
        }
        // Check whether a and b have same root (depth of a and b array accesses)
        public boolean connected(int a, int b) {
            return root(a) == root(b);
        }
        // Change root of a to point to root of b (depth of a and b array accesses)
        public void union(int a, int b) {
            int i = root(a);
            int j = root(b);
            parent[i] = j;
        }
    }
    /**
     * Weighted Quick Union
     * Proposition:- Depth of any node x is at most log N.
     *
     * Find:- Takes time proportional to depth of a and b -> O(log N)
     * Union:- Takes constant time, given roots -> O(log N)
     *
     */
    static class WeightedQuickUnion {

    }

    /**
     * Weighted Quick Union With Path Compression
     *
     * Two-Pass implementation:- Add a second loop to root() to set the parent[] of each examined node to the "root".
     * One-Pass implementation:- Making every other node in path point to its grandparent(thereby halving path length).
     *
     * NOTE:- Only one extra line of code.
     *
     * In practice:- No reason not to! Keeps tree almost completely flat.
     *
     * Proposition: [Hopcroft-Ulman, Tarjan]
     * Starting from an empty data structure, any sequence of M union-find ops on N objects makes <= c(N + M log * N) array accesses.
     *  > Analysis can be improved to N + M @(M, N).
     *  > Simple algorithm with fascinating mathematics.
     *                  N       |   log* N
     *                  1       |   0
     *                  2       |   1
     *                  4       |   2
     *                  16      |   3
     *                  65536   |   4
     *                  2^65536 |   5
     * Linear-time algorithm for M union-find operations on N objects?
     *  > Cost within constant factor of reading in the data.
     *  > In theory, WQUPC is not quite linear.
     *  > In practice, WQUPC is linear.
     */
    static class WeightedQuickUnionWithPathCompression {

    }

}
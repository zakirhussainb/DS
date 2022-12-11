package com.zakcorp.graphs.algorithms;

/**
 * Created by Zakir Hussain B on 24/08/20.
 *
 * @source:
 * Main Video:- https://youtu.be/j3FsS4cbJLg
 * https://youtu.be/BcRLmCS8pfw?list=PLRdD1c6QbAqJn0606RlOR6T3yUqFWKwmX -> Robert Sedgewick Youtube Channel
 * @topic: Graphs
 * @sub-topic: Disjoint-Set-Union (DSU)
 * @platform: General
 * @problem_link:
 * QF:- https://algs4.cs.princeton.edu/15uf/QuickFindUF.java.html
 * QU:- https://algs4.cs.princeton.edu/15uf/QuickUnionUF.java.html
 * WQU:- https://algs4.cs.princeton.edu/15uf/WeightedQuickUnionUF.java.html
 * WQUQPC:- https://algs4.cs.princeton.edu/15uf/WeightedQuickUnionPathCompressionUF.java.html
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
        private int[] parent; // parent[i] = component identifier of i
        private int count; // number of components
        // Set id of each object to itself (N array accesses)
        public QuickFind(int N) {
            count = N;
            parent = new int[N];
            for(int i = 0; i < N; i++) {
                parent[i] = i;
            }
        }
        // Returns the number of sets
        public int count() {
            return count;
        }
        /**
         * Returns the canonical element of the set containing element {a}.
         */
        public int find(int a) {
            validate(a);
            return parent[a];
        }
        // Validate that p is a valid index
        private void validate(int a) {
            int n = parent.length;
            if(a < 0 || a >= n)
                throw new IllegalArgumentException("index " + a + " is not between 0 and " + (n - 1));
        }
        /**
         * Merges the set containing element {a} with the
         * the set containing element {b}.
         */
        public void union(int a, int b) {
            validate(a);
            validate(b);
            int aId = parent[a];
            int bId = parent[b];
            // if a and b are already in the same component
            if(aId == bId)
                return;
            for(int i = 0; i < parent.length; i++) {
                if(parent[i] == aId) {
                    parent[i] = bId;
                }
            }
            count--;
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
        private int[] parent; // parent[i] = component identifier of i
        private int count; // number of components
        // Set id of each object to itself (N array accesses)
        public QuickUnion(int N) {
            count = N;
            parent = new int[N];
            for(int i = 0; i < N; i++) {
                parent[i] = i;
            }
        }
        // Returns the number of sets
        public int count() {
            return count;
        }
        /**
         * Returns the canonical element of the set containing element {a}.
         */
        public int find(int a) {
            validate(a);
            while(a != parent[a]) {
                a = parent[a];
            }
            return a;
        }
        // Validate that p is a valid index
        private void validate(int a) {
            int n = parent.length;
            if(a < 0 || a >= n)
                throw new IllegalArgumentException("index " + a + " is not between 0 and " + (n - 1));
        }
        /**
         * Merges the set containing element {a} with the
         * the set containing element {b}.
         */
        public void union(int a, int b) {
            int rootA = find(a);
            int rootB = find(b);
            if(rootA == rootB)
                return;
            parent[rootA] = rootB;
            count--;
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
        private int[] parent; // parent[i] = component identifier of i
        private int[] size; // size[i] = number of elements in subtree rooted at i
        private int count; // number of components
        // Set id of each object to itself (N array accesses)
        public WeightedQuickUnion(int N) {
            count = N;
            parent = new int[N];
            size = new int[N];
            for(int i = 0; i < N; i++) {
                parent[i] = i;
                size[i] = i;
            }
        }
        // Returns the number of sets
        public int count() {
            return count;
        }
        /**
         * Returns the canonical element of the set containing element {a}.
         */
        public int find(int a) {
            validate(a);
            while(a != parent[a]) {
                a = parent[a];
            }
            return a;
        }
        // Validate that p is a valid index
        private void validate(int a) {
            int n = parent.length;
            if(a < 0 || a >= n)
                throw new IllegalArgumentException("index " + a + " is not between 0 and " + (n - 1));
        }
        /**
         * Merges the set containing element {a} with the
         * the set containing element {b}.
         */
        public void union(int a, int b) {
            int rootA = find(a);
            int rootB = find(b);
            if(rootA == rootB)
                return;
            // make smaller root point to larger one
            if(size[rootA] < size[rootB]) {
                parent[rootA] = rootB;
                size[rootB] += size[rootA];
            } else {
                parent[rootB] = rootA;
                size[rootA] += size[rootB];
            }
            count--;
        }
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
     *
     *  Bottom Line:-
     *  WQUPC makes it possible to solve problems that could not otherwise be addressed.
     *
     *  Eg. [10^9 unions and find operations on 10^9 objects
     *  > WQUPC reduces time from 30 years to 6 seconds.
     *  > Supercomputers won't help much; good algorithm enables solution.
     *      -----------------------------------------------------
     *      Algorithm                       |   Worst-case time
     *      -----------------------------------------------------
     *      Quick-Find                      |   M N
     *      Quick-Union                     |   M N
     *      Weighted QU                     |   N + M log N
     *      QU + Path Compression           |   N + M log N
     *      Weighted QU + Path Compression  |   N + M log* N
     *      -----------------------------------------------------
     *      M union-find operations on a set of N objects
     */
    static class WeightedQuickUnionPathCompression {
        private int[] parent; // parent[i] = parent of i
        private int[] size; // size[i] = number of sites in tree rooted at i
                            // Note: not necessarily correct if i is not a root node
        private int count; // number of components
        public WeightedQuickUnionPathCompression(int N) {
            count = N;
            parent = new int[N];
            size = new int[N];
            for(int i = 0; i < N; i++) {
                parent[i] = i;
                size[i] = i;
            }
        }
        public int count() {
            return count;
        }
        /**
         * Returns the canonical element of the set containing element {a}.
         */
        public int find(int a) {
            validate(a);
            int root = a;
            while(root != parent[root]) {
                root = parent[root];
            }
            while(a != root) {
                int newA = parent[a];
                parent[a] = root;
                a = newA;
            }
            return root;
        }
        // Validate that p is a valid index
        private void validate(int a) {
            int n = parent.length;
            if(a < 0 || a >= n)
                throw new IllegalArgumentException("index " + a + " is not between 0 and " + (n - 1));
        }
        /**
         * Merges the set containing element {a} with the
         * the set containing element {b}.
         */
        public void union(int a, int b) {
            int rootA = find(a);
            int rootB = find(b);
            if(rootA == rootB)
                return;
            // make smaller root point to larger one
            if(size[rootA] < size[rootB]) {
                parent[rootA] = rootB;
                size[rootB] += size[rootA];
            } else {
                parent[rootB] = rootA;
                size[rootA] += size[rootB];
            }
            count--;
        }
    }

}

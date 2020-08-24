package com.zakcorp.graphs.algorithms;

/**
 * Created by Zakir Hussain B on 24/08/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
interface DisjointSetUnionI {
    void makeSet(int v);
    void union(int a, int b);
    void findSet(int v);
}
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
     */
    static class QuickFind {
        private int[] parent;
        // Set id of each object to itself {N array accesses}
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
     */
    static class QuickUnion {

    }

}
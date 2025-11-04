package com.zakcorp.striver_series.graphs.mst;

import com.zakcorp.striver_series.graphs.shortestpathalgos.CheapestFlightWithinKStops;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DisjointSet_Test {

    @Test
    public void test1() {
        DisjointSet ds = new DisjointSet(5); // Initialize a disjoint set with 5 elements

        ds.unionByRank(0, 1); // Merge sets containing 0 and 1 using rank

        ds.unionBySize(2, 3); // Merge sets containing 2 and 3 using size

        ds.find(0, 1); // Returns true as 0 and 1 are in the same set

        ds.find(0, 3); // Returns false as 0 and 3 are not in the same set
    }
}

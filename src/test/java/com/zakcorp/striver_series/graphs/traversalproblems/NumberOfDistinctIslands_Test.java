package com.zakcorp.striver_series.graphs.traversalproblems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfDistinctIslands_Test {
    NumberOfDistinctIslands.Solver s1 = new NumberOfDistinctIslands.Solver();
    @Test
    public void test1() {
        assertEquals(1, s1.countDistinctIslands(new int[][]{{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 1, 1}, {0, 0, 0, 1, 1}}));
    }
}

package com.zakcorp.striver_series.graphs.hard;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ShortestPathInDAG_Test {
    ShortestPathInDAG.Solver p1 = new ShortestPathInDAG.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 2, 1, -1}, p1.shortestPath(4, 2, new int[][]{{0, 1, 2}, {0, 2, 1}}));
    }
}

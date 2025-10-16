package com.zakcorp.striver_series.graphs.hard;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ShortestPathInUndirectedGraph_Test {
    ShortestPathInUndirectedGraph.Solver p1 = new ShortestPathInUndirectedGraph.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 1, 2, 1, 2, 3, 3, 4, 4},
                p1.shortestPath(new int[][]{{0, 1}, {0, 3}, {3, 4}, {4, 5}, {5, 6}, {1, 2}, {2, 6}, {6, 7}, {7, 8}, {6, 8}}, 9, 10));
    }
}

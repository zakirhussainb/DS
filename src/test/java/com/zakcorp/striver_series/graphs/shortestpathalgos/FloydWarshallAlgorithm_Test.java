package com.zakcorp.striver_series.graphs.shortestpathalgos;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FloydWarshallAlgorithm_Test {

    FloydWarshallAlgorithm.Solver s1 = new FloydWarshallAlgorithm.Solver();
    @Test
    public void test1() {
        int[][] input = new int[][]{{0, 2, -1, -1}, {1, 0, 3, -1}, {-1, -1, 0, 1}, {3, 5, 4, 0}};
        int[][] output = new int[][]{{0, 2, 5, 6}, {1, 0, 3, 4}, {4, 6, 0, 1}, {3, 5, 4, 0}};
        assertArrayEquals(output, s1.floydWarshall(input));
    }

}

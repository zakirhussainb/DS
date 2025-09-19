package com.zakcorp.striver_series.graphs.traversalproblems;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class NearestCellHavingOne_Test {
    NearestCellHavingOne.Solver s1 = new NearestCellHavingOne.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[][]{ {1, 0, 0, 1}, {0, 0, 1, 1}, {1, 1, 0, 0}}, s1.nearest(new int[][]{{0, 1, 1, 0}, {1, 1, 0, 0}, {0, 0, 1, 1}}));
    }
}

package com.zakcorp.striver_series.graphs.traversalproblems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RottenOranges_Test {
    RottenOranges.Solver s1 = new RottenOranges.Solver();
    @Test
    public void test1() {
        assertEquals(-1, s1.orangesRotting(new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}}));
    }

    @Test
    public void test2() {
        assertEquals(4, s1.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
    }

    @Test
    public void test3() {
        assertEquals(1, s1.orangesRotting(new int[][]{{0, 1, 2}, {0, 1, 2}, {2, 1, 1}}));
    }
}

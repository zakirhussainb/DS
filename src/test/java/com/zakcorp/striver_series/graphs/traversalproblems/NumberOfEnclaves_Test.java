package com.zakcorp.striver_series.graphs.traversalproblems;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberOfEnclaves_Test {
    NumberOfEnclaves.Solver s1 = new NumberOfEnclaves.Solver();
    @Test
    public void test1() {
        assertEquals(3, s1.numberOfEnclaves(new int[][]{{0, 0, 0, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}}));
    }
}

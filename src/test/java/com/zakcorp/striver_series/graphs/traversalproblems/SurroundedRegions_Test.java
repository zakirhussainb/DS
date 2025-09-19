package com.zakcorp.striver_series.graphs.traversalproblems;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SurroundedRegions_Test {
    SurroundedRegions.Solver s1 = new SurroundedRegions.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new char[][]{{'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'O', 'X', 'X'}},
                s1.fill(new char[][]{{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}}));

    }
}

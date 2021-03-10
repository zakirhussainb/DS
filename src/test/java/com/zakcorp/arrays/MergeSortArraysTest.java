package com.zakcorp.arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortArraysTest {
    MergeSortArrays.Solver p = new MergeSortArrays.Solver();
    @Test
    public void test1() {
        assertArrayEquals( new int[]{1, 2, 3, 4, 5, 6, 7, 8}, p.solve1(new int[]{7, 2, 1, 6, 8, 5, 3, 4}) );
    }
}

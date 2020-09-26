package com.zakcorp.grokking.coding.twopointers;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Chapter_4_Test {
    Chapter_4 p = new Chapter_4();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 1, 4, 4, 9}, p.makeSquares(new int[]{-2, -1, 0, 2, 3}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{0,1,1,4,9}, p.makeSquares(new int[]{-3, -1, 0, 1, 2}));
    }
}

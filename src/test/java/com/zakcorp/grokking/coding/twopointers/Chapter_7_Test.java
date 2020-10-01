package com.zakcorp.grokking.coding.twopointers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Chapter_7_Test {
    Chapter_7.Solver p = new Chapter_7.Solver();
    @Test
    public void test1() {
        assertEquals(4, p.solve1(new int[]{-1, 4, 2, 1, 3}, 5));
    }
    @Test
    public void test2() {
        assertEquals(2, p.solve1(new int[]{-1, 0, 2, 3}, 3));
    }
}

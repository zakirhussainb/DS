package com.zakcorp.final450.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class P_5_Test {
    P_5.Solver p = new P_5.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{-1, -2, 3, 4}, p.solve1(new int[]{-1, -2, 3, 4}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{-1, 3, 4, 2, 5, 6, 7}, p.solve1(new int[]{2, 3, 4, -1, 5, 6, 7}));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{-12,-13,-5,-7,-3,-6,11,6,5}, p.solve1(new int[]{-12, 11, -13, -5, 6, -7, 5, -3, -6}));
    }
}

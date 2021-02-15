package com.zakcorp.final450.searchingandsorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class P_90_Test {
    P_90.Solver p = new P_90.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 5}, p.solve1(new int[]{1,3,5,5,5,5,67,123,125}, 9, 5));
        assertArrayEquals(new int[]{2, 5}, p.solve2(new int[]{1,3,5,5,5,5,67,123,125}, 9, 5));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{6, 6}, p.solve1(new int[]{1,3,5,5,5,5,7,123,125}, 9, 7));
        assertArrayEquals(new int[]{6, 6}, p.solve2(new int[]{1,3,5,5,5,5,7,123,125}, 9, 7));
    }
}

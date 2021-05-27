package com.zakcorp.final450.searchingandsorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class P_105_Test {
    P_105.Solver p = new P_105.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new long[]{180,600,360,300,900}, p.solve1(new int[]{10, 3, 5, 6, 2}, 5));
        assertArrayEquals(new long[]{180,600,360,300,900}, p.solve2(new int[]{10, 3, 5, 6, 2}, 5));
        assertArrayEquals(new long[]{180,600,360,300,900}, p.solve3(new int[]{10, 3, 5, 6, 2}, 5));
    }
    @Test
    public void test2() {
        assertArrayEquals(new long[]{24,12,8,6}, p.solve1(new int[]{1,2,3,4}, 4));
        assertArrayEquals(new long[]{24,12,8,6}, p.solve2(new int[]{1,2,3,4}, 4));
        assertArrayEquals(new long[]{24,12,8,6}, p.solve3(new int[]{1,2,3,4}, 4));
    }
    @Test
    public void test3() {
        assertArrayEquals(new long[]{0,0,9,0,0}, p.solve1(new int[]{-1,1,0,-3,3}, 5));
        assertArrayEquals(new long[]{0,0,9,0,0}, p.solve2(new int[]{-1,1,0,-3,3}, 5));
        assertArrayEquals(new long[]{0,0,9,0,0}, p.solve3(new int[]{-1,1,0,-3,3}, 5));
    }
}

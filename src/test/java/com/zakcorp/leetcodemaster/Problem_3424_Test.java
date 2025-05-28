package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_3424_Test {
    Problem_3424.Solver p = new Problem_3424.Solver();
    @Test
    public void test1() {
        assertEquals(13, p.solve1(new int[]{-7,9,5}, new int[]{7,-2,-5}, 2));
    }
    @Test
    public void test2() {
        assertEquals(0, p.solve1(new int[]{2, 1}, new int[]{2, 1}, 0));
    }
    @Test
    public void test3() {
        assertEquals(9, p.solve1(new int[]{0, 1, 2}, new int[]{3, 4, 5}, 0));
    }

    @Test
    public void test4() {
        assertEquals(1, p.solve1(new int[]{0}, new int[]{-1}, 200000));
    }

    @Test
    public void test5() {
        assertEquals(0, p.solve1(new int[]{1}, new int[]{1}, 200000));
    }

    @Test
    public void test6() {
        assertEquals(2, p.solve1(new int[]{1, 1}, new int[]{1, -1}, 200000));
    }
}

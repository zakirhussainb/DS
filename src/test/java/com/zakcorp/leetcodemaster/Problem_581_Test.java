package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_581_Test {
    Problem_581.Solver p = new Problem_581.Solver();
    @Test
    public void test1() {
        assertEquals(5, p.solve1(new int[]{2, 6, 4, 8, 10, 9, 15}));
    }
    @Test
    public void test2() {
        assertEquals(5, p.solve1(new int[]{1, 2, 5, 3, 7, 10, 9, 12}));
    }
    @Test
    public void test3() {
        assertEquals(5, p.solve1(new int[]{1, 3, 2, 0, -1, 7, 10}));
    }
    @Test
    public void test4() {
        assertEquals(0, p.solve1(new int[]{1, 2, 3}));
    }
    @Test
    public void test5() {
        assertEquals(3, p.solve1(new int[]{3, 2, 1}));
    }
}

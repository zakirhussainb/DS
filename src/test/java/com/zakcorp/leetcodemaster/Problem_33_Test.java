package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_33_Test {
    Problem_33.Solver p = new Problem_33.Solver();
    @Test
    public void test1() {
        assertEquals(4, p.solve1(new int[]{4,5,6,7,0,1,2}, 0));
    }
    @Test
    public void test2() {
        assertEquals(-1, p.solve1(new int[]{4,5,6,7,0,1,2}, 3));
    }
    @Test
    public void test3() {
        assertEquals(-1, p.solve1(new int[]{1}, 0));
    }
    @Test
    public void test4() {
        assertEquals(0, p.solve1(new int[]{1}, 1));
    }
    @Test
    public void test5() {
        assertEquals(0, p.solve1(new int[]{1, 3}, 1));
    }
    @Test
    public void test6() {
        assertEquals(1, p.solve1(new int[]{1, 3}, 3));
    }
    @Test
    public void test7() {
        assertEquals(0, p.solve1(new int[]{3, 1}, 3));
    }
}

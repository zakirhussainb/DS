package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_3096_Test {
    Problem_3096.Solver p = new Problem_3096.Solver();
    @Test
    public void test1() {
        assertEquals(1, p.solve1(new int[]{1,0,1,0}));
    }
    @Test
    public void test2() {
        assertEquals(3, p.solve1(new int[]{1,1,1,1,1}));
    }

    @Test
    public void test3() {
        assertEquals(-1, p.solve1(new int[]{0,0}));
    }

    @Test
    public void test4() {
        assertEquals(3, p.solve1(new int[]{1,1,1,1}));
    }

    @Test
    public void test5() {
        assertEquals(1, p.solve1(new int[]{1,1,1,0,0,0}));
    }

    @Test
    public void test6() {
        assertEquals(1, p.solve1(new int[]{1,1,1,0,0,0,0}));
    }

    @Test
    public void test7() {
        assertEquals(1, p.solve1(new int[]{1,1,1,1,1,1,0,0,0,0,0}));
    }

    @Test
    public void test8() {
        assertEquals(1, p.solve1(new int[]{1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
    }

    @Test
    public void test9() {
        assertEquals(-1, p.solve1(new int[]{0,1}));
    }

    @Test
    public void test10() {
        assertEquals(1, p.solve1(new int[]{1,0}));
    }
    @Test
    public void test11() {
        assertEquals(-1, p.solve1(new int[]{1,1}));
    }
}

package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1151_Test {
    Problem_1151.Solver p = new Problem_1151.Solver();
    @Test
    public void test1() {
        assertEquals(1, p.solve1(new int[]{1,0,1,0,1}));
    }
    @Test
    public void test2() {
        assertEquals(0, p.solve1(new int[]{0,0,0,1,0}));
    }
    @Test
    public void test3() {
        assertEquals(3, p.solve1(new int[]{1,0,1,0,1,0,0,1,1,0,1}));
    }
    @Test
    public void test4() {
        assertEquals(8, p.solve1(new int[]{1,0,1,0,1,0,1,1,1,0,1,0,0,1,1,1,0,0,1,1,1,0,1,0,1,1,0,0,0,1,1,1,1,0,0,1}));
    }
    @Test
    public void test5() {
        assertEquals(0, p.solve1(new int[]{0,0,0,0,1,1,1,1,1,1,1,1}));
    }
}

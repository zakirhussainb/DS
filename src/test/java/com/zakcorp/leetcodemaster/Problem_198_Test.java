package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_198_Test {
    Problem_198.Solver p = new Problem_198.Solver();
    Problem_198.Solver1 p1 = new Problem_198.Solver1();
    Problem_198.Solver2 p2 = new Problem_198.Solver2();
    @Test
    public void test1() {
        assertEquals(4, p.solve1(new int[]{1,2,3,1}));
        assertEquals(4, p1.solve1(new int[]{1,2,3,1}));
        assertEquals(4, p2.solve1(new int[]{1,2,3,1}));
    }
    @Test
    public void test2() {
        assertEquals(12, p.solve1(new int[]{2,7,9,3,1}));
        assertEquals(12, p1.solve1(new int[]{2,7,9,3,1}));
        assertEquals(12, p2.solve1(new int[]{2,7,9,3,1}));
    }
    @Test
    public void test3() {
        assertEquals(120, p.solve1(new int[]{100,50,20}));
        assertEquals(120, p1.solve1(new int[]{100,50,20}));
        assertEquals(120, p2.solve1(new int[]{100,50,20}));
    }
    @Test
    public void test4() {
        assertEquals(4, p.solve1(new int[]{2,1,1,2}));
        assertEquals(4, p1.solve1(new int[]{2,1,1,2}));
        assertEquals(4, p2.solve1(new int[]{2,1,1,2}));
    }
}

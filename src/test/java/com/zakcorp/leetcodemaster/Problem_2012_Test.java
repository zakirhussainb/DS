package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_2012_Test
{
    Problem_2012.Solver p = new Problem_2012.Solver();
    Problem_2012.Solver1 p1 = new Problem_2012.Solver1();
    Problem_2012.Solver2 p2 = new Problem_2012.Solver2();
    @Test
    public void test1() {
        assertEquals(8, p.solve1(new int[]{1,2,3,4,5,6}));
        assertEquals(8, p1.solve1(new int[]{1,2,3,4,5,6}));
        assertEquals(8, p2.solve1(new int[]{1,2,3,4,5,6}));
    }
    @Test
    public void test2() {
        assertEquals(2, p.solve1(new int[]{1,2,3}));
        assertEquals(2, p1.solve1(new int[]{1,2,3}));
        assertEquals(2, p2.solve1(new int[]{1,2,3}));
    }
    @Test
    public void test3() {
        assertEquals(1, p.solve1(new int[]{2,4,6,4}));
        assertEquals(1, p1.solve1(new int[]{2,4,6,4}));
        assertEquals(1, p2.solve1(new int[]{2,4,6,4}));
    }
    @Test
    public void test4() {
        assertEquals(0, p.solve1(new int[]{3,2,1}));
        assertEquals(0, p1.solve1(new int[]{3,2,1}));
        assertEquals(0, p2.solve1(new int[]{3,2,1}));
    }
    @Test
    public void test5() {
        assertEquals(4, p.solve1(new int[]{2,4,6,3,5,7,8}));
        assertEquals(4, p1.solve1(new int[]{2,4,6,3,5,7,8}));
        assertEquals(4, p2.solve1(new int[]{2,4,6,3,5,7,8}));
    }
}

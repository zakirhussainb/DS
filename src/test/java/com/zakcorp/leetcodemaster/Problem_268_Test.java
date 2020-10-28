package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_268_Test {
    Problem_268.Solver p = new Problem_268.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(new int[]{3, 0, 1}));
        assertEquals(2, p.solve2(new int[]{3, 0, 1}));
    }
    @Test
    public void test2() {
        assertEquals(2, p.solve1(new int[]{0, 1}));
        assertEquals(2, p.solve2(new int[]{0, 1}));
    }
    @Test
    public void test3() {
        assertEquals(8, p.solve1(new int[]{9,6,4,2,3,5,7,0,1}));
        assertEquals(8, p.solve2(new int[]{9,6,4,2,3,5,7,0,1}));
    }
    @Test
    public void test4() {
        assertEquals(1, p.solve1(new int[]{0}));
        assertEquals(1, p.solve2(new int[]{0}));
    }
}

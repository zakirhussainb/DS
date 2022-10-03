package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1094_Test {
    Problem_1094.Solver p = new Problem_1094.Solver();
    @Test
    public void test1() {
        assertFalse(p.solve1(new int[][]{{3,3,7},{2,1,5}}, 4));
    }
    @Test
    public void test2() {
        assertTrue(p.solve1(new int[][]{{3,3,7},{2,1,5}}, 5));
    }
    @Test
    public void test3() {
        assertTrue(p.solve1(new int[][]{{2,3,5},{1,1,5},{1,6,9}}, 3));
    }
    @Test
    public void test4() {
        assertTrue(p.solve1(new int[][]{{3,2,7},{3,7,9},{8,3,9}}, 11));
    }
}

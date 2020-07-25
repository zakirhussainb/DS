package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1460_Test {
    Problem_1460.Solver p = new Problem_1460.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1(new int[]{1, 2, 3, 4}, new int[]{2, 4, 1, 3}));
        assertTrue(p.solve2(new int[]{1, 2, 3, 4}, new int[]{2, 4, 1, 3}));
        assertTrue(p.wrongSolution(new int[]{1, 2, 3, 4}, new int[]{2, 4, 1, 3}));
    }
    @Test
    public void test2() {
        assertTrue(p.solve1(new int[]{7}, new int[]{7}));
        assertTrue(p.solve2(new int[]{7}, new int[]{7}));
        assertTrue(p.wrongSolution(new int[]{7}, new int[]{7}));
    }
    @Test
    public void test3() {
        assertTrue(p.solve1(new int[]{1, 12}, new int[]{12, 1}));
        assertTrue(p.solve2(new int[]{1, 12}, new int[]{12, 1}));
        assertTrue(p.wrongSolution(new int[]{1, 12}, new int[]{12, 1}));
    }
    @Test
    public void test4() {
        assertFalse(p.solve1(new int[]{3,7,9}, new int[]{3,7,11}));
        assertFalse(p.solve2(new int[]{3,7,9}, new int[]{3,7,11}));
        assertFalse(p.wrongSolution(new int[]{3,7,9}, new int[]{3,7,11}));
    }
    @Test
    public void test5() {
        assertTrue(p.solve1(new int[]{1,1,1,1,1}, new int[]{1,1,1,1,1}));
        assertTrue(p.solve2(new int[]{1,1,1,1,1}, new int[]{1,1,1,1,1}));
        assertTrue(p.wrongSolution(new int[]{1,1,1,1,1}, new int[]{1,1,1,1,1}));
    }
    @Test
    public void test6() {
        assertFalse(p.solve1(new int[]{1,2,2,3}, new int[]{1,1,2,3}));
        assertFalse(p.solve2(new int[]{1,2,2,3}, new int[]{1,1,2,3}));
        assertFalse(p.wrongSolution(new int[]{1,2,2,3}, new int[]{1,1,2,3}));
    }
    @Test
    public void test7() {
        assertFalse(p.solve1(new int[]{1, 2, 3}, new int[]{2,2,2}));
        assertFalse(p.solve2(new int[]{1, 2, 3}, new int[]{2,2,2}));
        // Here it will fail.
        assertFalse(p.wrongSolution(new int[]{1, 2, 3}, new int[]{2,2,2}));
    }
}

package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Problem_53_Test {
    Problem_53.Solver p = new Problem_53.Solver();
    @Test
    public void test1() {
        assertEquals(6, p.findMaxSubArrayUsingKadane(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        assertEquals(6, p.solve1(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    @Test
    public void test2() {
        assertEquals(-1, p.findMaxSubArrayUsingKadane(new int[]{-2,-1,-3,-4,-5}));
        assertEquals(-1, p.solve1(new int[]{-2,-1,-3,-4,-5}));
    }
    @Test
    public void test3() {
        assertEquals(1, p.findMaxSubArrayUsingKadane(new int[]{1}));
        assertEquals(1, p.solve1(new int[]{1}));
    }
    @Test
    public void test4() {
        assertEquals(3, p.findMaxSubArrayUsingKadane(new int[]{1, 2}));
        assertEquals(3, p.solve1(new int[]{1, 2}));
    }
    @Test
    public void test5() {
        assertEquals(3, p.findMaxSubArrayUsingKadane(new int[]{-1,-2,3}));
        assertEquals(3, p.solve1(new int[]{-1,-2,3}));
    }
    @Test
    public void test6() {
        assertEquals(-2, p.findMaxSubArrayUsingKadane(new int[]{-2}));
        assertEquals(-2, p.solve1(new int[]{-2}));
    }
}

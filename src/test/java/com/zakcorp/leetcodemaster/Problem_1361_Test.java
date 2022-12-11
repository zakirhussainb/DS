package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1361_Test
{
    Problem_1361.Solver p = new Problem_1361.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1(4, new int[]{1,-1,3,-1}, new int[]{2,-1,-1,-1}));
    }
    @Test
    public void test2() {
        assertFalse(p.solve1(4, new int[]{1,-1,3,-1}, new int[]{2,3,-1,-1}));
    }
    @Test
    public void test3() {
        assertFalse(p.solve1(2, new int[]{1,0}, new int[]{-1,-1}));
    }
    @Test
    public void test4() {
        // This test case is to determine whether from traversing via the root, can we visit all the nodes.
        assertFalse(p.solve1(4, new int[]{1,0,3,-1}, new int[]{-1,-1,-1,-1}));
    }
}

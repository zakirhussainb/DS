package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_946_Test
{
    Problem_946.Solver1 p1 = new Problem_946.Solver1();
    @Test
    public void test1() {
        assertTrue(p1.solve1(new int[]{1,2,3,4,5}, new int[]{4,5,3,2,1}));
    }
    @Test
    public void test2() {
        assertFalse(p1.solve1(new int[]{1,2,3,4,5}, new int[]{4,3,5,1,2}));
    }
    @Test
    public void test3() {
        assertTrue(p1.solve1(new int[]{2,1,0}, new int[]{1,2,0}));
    }
    @Test
    public void test4() {
        assertTrue(p1.solve1(new int[]{2,3,0,1}, new int[]{0,3,2,1}));
    }
}

package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1296_Test
{
    Problem_1296.Solver1 p = new Problem_1296.Solver1();
    @Test
    public void test1() {
        assertTrue(p.solve1(new int[]{1,2,3,3,4,4,5,6}, 4));
    }
    @Test
    public void test2() {
        assertFalse(p.solve1(new int[]{1,2,3,4}, 3));
    }
}

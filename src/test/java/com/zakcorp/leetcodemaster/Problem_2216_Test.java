package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_2216_Test
{
    Problem_2216.Solver p = new Problem_2216.Solver();
    @Test
    public void test1() {
        assertEquals(1, p.solve1(new int[]{1,1,2,3,5}));
    }
    @Test
    public void test2() {
        assertEquals(2, p.solve1(new int[]{1,1,2,2,3,3}));
    }
}

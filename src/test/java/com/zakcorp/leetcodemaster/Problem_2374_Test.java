package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_2374_Test
{
    Problem_2374.Solver p = new Problem_2374.Solver();
    @Test
    public void test1() {
        assertEquals(7, p.solve1(new int[]{1,0,0,0,0,7,7,5}));
    }
    @Test
    public void test2() {
        assertEquals(0, p.solve1(new int[]{2,0,0,2}));
    }
}

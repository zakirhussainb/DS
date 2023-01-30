package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1442_Test
{
    Problem_1442.Solver p = new Problem_1442.Solver();
    @Test
    public void test1() {
        assertEquals(4, p.solve1(new int[]{2,3,1,6,7}));
    }
    @Test
    public void test2() {
        assertEquals(10, p.solve1(new int[]{1,1,1,1,1}));
    }
}

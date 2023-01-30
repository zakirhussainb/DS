package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1921_Test
{
    Problem_1921.Solver p = new Problem_1921.Solver();
    @Test
    public void test1() {
        assertEquals(1, p.solve1(new int[]{1,1,2,3}, new int[]{1,1,1,1}));
    }
    @Test
    public void test2() {
        assertEquals(1, p.solve1(new int[]{3,2,4}, new int[]{5,3,2}));
    }
}

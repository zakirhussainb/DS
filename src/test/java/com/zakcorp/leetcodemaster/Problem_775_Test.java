package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_775_Test
{
    Problem_775.Solver p = new Problem_775.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1(new int[]{1,2,0}));
    }
}

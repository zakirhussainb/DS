package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1387_Test
{
    Problem_1387.Solver p = new Problem_1387.Solver();
    @Test
    public void test1() {
        assertEquals(13, p.solve1(12, 15, 2));
    }
    @Test
    public void test2() {
        assertEquals(7, p.solve1(7, 11, 4));
    }
}

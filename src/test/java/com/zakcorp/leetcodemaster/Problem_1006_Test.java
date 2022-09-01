package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1006_Test
{
    Problem_1006.Solver p = new Problem_1006.Solver();
    @Test
    public void test1() {
        assertEquals(7, p.solve1(4));
    }

    @Test
    public void test2() {
        assertEquals(12, p.solve1(10));
    }
}

package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1663_Test
{
    Problem_1663.Solver p = new Problem_1663.Solver();
    @Test
    public void test1() {
        assertEquals("aay", p.solve1(3, 27));
    }
    @Test
    public void test2() {
        assertEquals("aaszz", p.solve1(5, 73));
    }
}

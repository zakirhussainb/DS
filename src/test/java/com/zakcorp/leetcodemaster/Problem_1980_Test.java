package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1980_Test
{
    Problem_1980.Solver p = new Problem_1980.Solver();
    @Test
    public void test1() {
        assertEquals("11", p.solve1(new String[]{"01","10"}));
    }
    @Test
    public void test2() {
        assertEquals("11", p.solve1(new String[]{"00","01"}));
    }
    @Test
    public void test3() {
        assertEquals("101", p.solve1(new String[]{"111","011","001"}));
    }
}

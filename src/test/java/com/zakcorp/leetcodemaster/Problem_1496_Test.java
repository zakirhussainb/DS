package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1496_Test
{
    Problem_1496.Solver p = new Problem_1496.Solver();
    @Test
    public void test1() {
        assertFalse(p.solve1("NES"));
    }
    @Test
    public void test2() {
        assertTrue(p.solve1("NESWW"));
    }
    @Test
    public void test3() {
        assertTrue(p.solve1("SN"));
    }
    @Test
    public void test4() {
        assertTrue(p.solve1("NESW"));
    }
    @Test
    public void test5() {
        assertTrue(p.solve1("NNSWWEWSSESSWENNW"));
    }
}

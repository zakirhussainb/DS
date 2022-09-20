package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1759_Test
{
    Problem_1759.Solver p = new Problem_1759.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1("bb"));
    }
    @Test
    public void test2() {
        assertEquals(13, p.solve1("abbcccaa"));
    }
}

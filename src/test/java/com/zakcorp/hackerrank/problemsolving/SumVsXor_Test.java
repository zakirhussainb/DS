package com.zakcorp.hackerrank.problemsolving;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumVsXor_Test {
    SumVsXor.Solver p = new SumVsXor.Solver();
    @Test
    public void test1() {
        assertEquals(7, p.solve1(5));
        assertEquals(7, p.solve2(2));
    }
    @Test
    public void test2() {
        assertEquals(4, p.solve1(10));
        assertEquals(4, p.solve2(10));
    }
}

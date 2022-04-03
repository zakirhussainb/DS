package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_13_Test {
    Problem_13.Solver p = new Problem_13.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1("III"));
    }
    @Test
    public void test2() {
        assertEquals(58, p.solve1("LVIII"));
    }
    @Test
    public void test3() {
        assertEquals(591, p.solve1("DXCI"));
    }
    @Test
    public void test4() {
        assertEquals(1994, p.solve1("MCMXCIV"));
    }
    @Test
    public void test5() {
        assertEquals(117, p.solve1("CXVII"));
    }
}

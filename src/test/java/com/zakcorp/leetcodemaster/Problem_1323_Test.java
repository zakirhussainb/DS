package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_1323_Test {
    Problem_1323.Solver p = new Problem_1323.Solver();
    @Test
    public void test1() {
        assertEquals(9999, p.maximum69Number(9996));
    }
    @Test
    public void test2() {
        assertEquals(9969, p.maximum69Number(9669));
    }
    @Test
    public void test3() {
        assertEquals(9999, p.maximum69Number(9999));
    }
}

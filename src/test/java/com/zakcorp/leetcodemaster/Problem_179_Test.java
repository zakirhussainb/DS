package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_179_Test {
    Problem_179.Solver p = new Problem_179.Solver();
    @Test
    public void test1() {
        assertEquals("210", p.solve1(new int[]{10, 2}));
    }
    @Test
    public void test2() {
        assertEquals("9534330", p.solve1(new int[]{3,30,34,5,9}));
    }
}

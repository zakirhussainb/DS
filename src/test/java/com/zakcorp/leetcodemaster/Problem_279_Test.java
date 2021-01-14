package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_279_Test {
    Problem_279.Solver p = new Problem_279.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(10));
    }
    @Test
    public void test2() {
        assertEquals(1, p.solve1(9));
    }
}

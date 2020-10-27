package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_476_Test {
    Problem_476.Solver p = new Problem_476.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(5));
        assertEquals(2, p.solve2(5));
    }
    @Test
    public void test2() {
        assertEquals(0, p.solve1(1));
        assertEquals(0, p.solve2(1));
    }
}

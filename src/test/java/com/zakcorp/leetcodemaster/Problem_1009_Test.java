package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1009_Test {
    Problem_1009.Solver p = new Problem_1009.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(5));
        assertEquals(2, p.solve2(5));
    }
    @Test
    public void test2() {
        assertEquals(0, p.solve1(7));
        assertEquals(0, p.solve2(7));
    }
    @Test
    public void test3() {
        assertEquals(5, p.solve1(10));
        assertEquals(5, p.solve2(10));
    }
    @Test
    public void test4() {
        assertEquals(1, p.solve1(0));
        assertEquals(1, p.solve2(0));
    }
    @Test
    public void test5() {
        assertEquals(34217728, p.solve1(99999999));
        assertEquals(34217728, p.solve2(99999999));
    }
}

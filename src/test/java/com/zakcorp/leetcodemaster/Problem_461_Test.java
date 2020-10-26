package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Problem_461_Test {
    Problem_461.Solver p = new Problem_461.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(1, 4));
        assertEquals(2, p.solve2(1, 4));
    }
    @Test
    public void test2() {
        assertEquals(2, p.solve1(3, 9));
        assertEquals(2, p.solve2(3, 9));
    }
    @Test
    public void test3() {
        assertEquals(1, p.solve1(16, 24));
        assertEquals(1, p.solve2(16, 24));
    }
    @Test
    public void test4() {
        assertEquals(3, p.solve1(35, 75));
        assertEquals(3, p.solve2(35, 75));
    }
    @Test
    public void test5() {
        assertEquals(0, p.solve1(0, 0));
        assertEquals(0, p.solve2(0, 0));
    }
    @Test
    public void test6() {
        assertEquals(0, p.solve1(2147483647, 2147483647));
        assertEquals(0, p.solve2(2147483647, 2147483647));
    }
    @Test
    public void test7() {
        assertEquals(29, p.solve1(10, 2147483647));
        assertEquals(29, p.solve2(10, 2147483647));
    }
}

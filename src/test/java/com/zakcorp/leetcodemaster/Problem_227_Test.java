package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_227_Test {
    Problem_227.Solver p = new Problem_227.Solver();
    @Test
    public void test1() {
        assertEquals(397, p.solve1("395+564/210"));
    }
    @Test
    public void test2() {
        assertEquals(7, p.solve1("3+2*2"));
    }
    @Test
    public void test3() {
        assertEquals(1, p.solve1(" 3/2 "));
    }
    @Test
    public void test4() {
        assertEquals(5, p.solve1(" 3+5 / 2 "));
    }
    @Test
    public void test5() {
        assertEquals(113434, p.solve1("113434"));
    }
    @Test
    public void test6() {
        assertEquals(0, p.solve1("1-1"));
    }
    @Test
    public void test7() {
        assertEquals(-2147483646, p.solve1("1-2147483647"));
    }
    @Test
    public void test8() {
        assertEquals(3, p.solve1("1+1+1"));
    }
}

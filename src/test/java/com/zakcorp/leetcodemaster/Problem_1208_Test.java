package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1208_Test
{
    Problem_1208.Solver p = new Problem_1208.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1("abcd", "bcdf", 3));
    }
    @Test
    public void test2() {
        assertEquals(1, p.solve1("abcd", "cdef", 3));
    }
    @Test
    public void test3() {
        assertEquals(1, p.solve1("abcd", "acde", 0));
    }
    @Test
    public void test4() {
        assertEquals(5, p.solve1("abcdefghij", "bcdeffgijk", 3));
    }
    @Test
    public void test6() {
        assertEquals(0, p.solve1("a", "z", 20));
    }
    @Test
    public void test7() {
        assertEquals(4 , p.solve1("krpgjbjjznpzdfy", "nxargkbydxmsgby", 14));
    }
    @Test
    public void test8() {
        assertEquals(1 , p.solve1("anryddgaqpjdw", "zjhotgdlmadcf", 5));
    }
}

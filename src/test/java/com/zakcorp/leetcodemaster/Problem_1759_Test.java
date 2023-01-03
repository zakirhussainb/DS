package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1759_Test
{
    Problem_1759.Solver p = new Problem_1759.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1("bb"));
        assertEquals(3, p.solve2("bb"));
    }
    @Test
    public void test2() {
        assertEquals(13, p.solve1("abbcccaa"));
        assertEquals(13, p.solve2("abbcccaa"));
    }
    @Test
    public void test3() {
        assertEquals(16, p.solve1("abbcccaabb"));
        assertEquals(16, p.solve2("abbcccaabb"));
    }
    @Test
    public void test4() {
        assertEquals(2, p.solve1("xy"));
        assertEquals(2, p.solve2("xy"));
    }
    @Test
    public void test5() {
        assertEquals(15, p.solve1("zzzzz"));
        assertEquals(15, p.solve2("zzzzz"));
    }
}

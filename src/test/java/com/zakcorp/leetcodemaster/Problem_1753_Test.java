package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1753_Test
{
    Problem_1753.Solver1 p = new Problem_1753.Solver1();
    @Test
    public void test1() {
        assertEquals(6, p.solve1(2, 4, 6));
    }
    @Test
    public void test2() {
        assertEquals(7, p.solve1(4, 4, 6));
    }
    @Test
    public void test3() {
        assertEquals(8, p.solve1(1, 8, 8));
    }
    @Test
    public void test4() {
        assertEquals(3, p.solve1(6, 2, 1));
    }
}

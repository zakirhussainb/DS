package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1414_Test
{
    Problem_1414.Solver p = new Problem_1414.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(7));
    }
    @Test
    public void test2() {
        assertEquals(2, p.solve1(10));
    }
    @Test
    public void test3() {
        assertEquals(3, p.solve1(19));
    }
    @Test
    public void test4() {
        assertEquals(3, p.solve1(100));
    }
    @Test
    public void test5() {
        assertEquals(1, p.solve1(5));
    }
}

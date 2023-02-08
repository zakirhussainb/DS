package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_2429_Test
{
    Problem_2429.Solver p = new Problem_2429.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1(3, 5));
    }
    @Test
    public void test2() {
        assertEquals(3, p.solve1(1, 12));
    }
    @Test
    public void test3() {
        assertEquals(31, p.solve1(31, 31));
    }
    @Test
    public void test4() {
        assertEquals(76, p.solve1(79, 74));
    }
    @Test
    public void test5() {
        assertEquals(65, p.solve1(64, 40));
    }
    @Test
    public void test6() {
        assertEquals(67451391, p.solve1(67450962, 88170227));
    }
}

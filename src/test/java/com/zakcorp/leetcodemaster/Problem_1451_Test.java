package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1451_Test {
    Problem_1451.Solver p = new Problem_1451.Solver();
    @Test
    public void test1() {
        assertEquals("Is cool leetcode", p.solve1("Leetcode is cool"));
    }
    @Test
    public void test2() {
        assertEquals("On and keep calm code", p.solve1("Keep calm and code on"));
    }
    @Test
    public void test3() {
        assertEquals("To be or to be not", p.solve1("To be or not to be"));
    }
}

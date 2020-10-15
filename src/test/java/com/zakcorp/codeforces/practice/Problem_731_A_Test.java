package com.zakcorp.codeforces.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_731_A_Test {
    Problem_731_A.Solver p = new Problem_731_A.Solver();
    @Test
    public void test1() {
        assertEquals(18, p.solve1("zeus"));
    }
    @Test
    public void test2() {
        assertEquals(35, p.solve1("map"));
    }
    @Test
    public void test3() {
        assertEquals(34, p.solve1("ares"));
    }
}

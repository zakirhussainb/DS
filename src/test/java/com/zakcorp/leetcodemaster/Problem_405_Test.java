package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_405_Test {
    Problem_405.Solver p = new Problem_405.Solver();
    @Test
    public void test1() {
        assertEquals("1a", p.solve1(26));
    }
    @Test
    public void test2() {
        assertEquals("21c", p.solve1(540));
    }
    @Test
    public void test3() {
        assertEquals("ffffffff", p.solve1(-1));
    }
}

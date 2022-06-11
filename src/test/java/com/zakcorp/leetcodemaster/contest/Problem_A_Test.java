package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1("IloveLe3tcode!"));
    }
    @Test
    public void test2() {
        assertFalse(p.solve1("Me+You--IsMyDream"));
    }
    @Test
    public void test3() {
        assertFalse(p.solve1("1aB!"));
    }
    @Test
    public void test4() {
        assertTrue(p.solve1("(Aa1a1a1"));
    }
    @Test
    public void test5() {
        assertTrue(p.solve1("-Aa1a1a1"));
    }
}

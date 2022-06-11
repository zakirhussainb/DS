package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class Problem_2299_Test {
    Problem_2299.Solver p = new Problem_2299.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1("IloveLe3tcode!"));
        assertTrue(p.solve2("IloveLe3tcode!"));
    }
    @Test
    public void test2() {
        assertFalse(p.solve1("Me+You--IsMyDream"));
        assertFalse(p.solve2("Me+You--IsMyDream"));
    }
    @Test
    public void test3() {
        assertFalse(p.solve1("1aB!"));
        assertFalse(p.solve2("1aB!"));
    }
    @Test
    public void test4() {
        assertTrue(p.solve1("(Aa1a1a1"));
        assertTrue(p.solve2("(Aa1a1a1"));
    }
    @Test
    public void test5() {
        assertTrue(p.solve1("-Aa1a1a1"));
        assertTrue(p.solve2("-Aa1a1a1"));
    }
}

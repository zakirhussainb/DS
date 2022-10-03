package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertTrue( p.solve1("abcc"));
    }
    @Test
    public void test2() {
        assertFalse( p.solve1("aazz"));
    }
    @Test
    public void test3() {
        assertTrue( p.solve1("abcdefghijklmnopqrstuvwxyz"));
    }
    @Test
    public void test4() {
        assertTrue( p.solve1("bac"));
    }
    @Test
    public void test5() {
        assertTrue( p.solve1("cccaa"));
    }
}

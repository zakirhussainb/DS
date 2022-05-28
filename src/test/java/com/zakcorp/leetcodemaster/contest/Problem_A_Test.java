package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1("1210"));
    }
    @Test
    public void test2() {
        assertFalse(p.solve1("030"));
    }
    @Test
    public void test3() {
        assertFalse(p.solve1("1"));
        // [1]
        // 0 must occur 1 time
    }
    @Test
    public void test4() {
        assertFalse(p.solve1("89"));
        // 0 is occuring 8 times
        // 1 is occuring 9 times
    }
    @Test
    public void test5() {
        assertFalse(p.solve1("8"));
        // 0 is occuring 8 times
        // 1 is occuring 9 times
    }
}

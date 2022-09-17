package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1("08-15", "08-18", "08-16", "08-19"));
    }
    @Test
    public void test2() {
        assertEquals(0, p.solve1("10-01", "10-31", "11-01", "12-31"));
    }
}

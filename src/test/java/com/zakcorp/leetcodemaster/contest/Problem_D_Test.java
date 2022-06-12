package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_D_Test {
    Problem_D.Solver p = new Problem_D.Solver();
    @Test
    public void test1() {
        assertEquals(6, p.solve1(new String[]{"coffee","donuts","time","toffee"}));
    }
    @Test
    public void test2() {
        assertEquals(0, p.solve1(new String[]{"lack","back"}));
    }
}

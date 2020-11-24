package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_159_Test {
    Problem_159.Solver p = new Problem_159.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1("eceba"));
    }
    @Test
    public void test2() {
        assertEquals(5, p.solve1("ccaabbb"));
    }

}

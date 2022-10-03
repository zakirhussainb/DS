package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1545_Test {
    Problem_1545.Solver p = new Problem_1545.Solver();
    @Test
    public void test1() {
        assertEquals('0', p.solve1(3, 1));
    }
    @Test
    public void test2() {
        assertEquals('1', p.solve1(4, 11));
    }
}

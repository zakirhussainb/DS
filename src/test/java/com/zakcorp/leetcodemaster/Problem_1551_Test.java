package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1551_Test {
    Problem_1551.Solver p = new Problem_1551.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(3));
        assertEquals(2, p.solve2(3));
    }
}

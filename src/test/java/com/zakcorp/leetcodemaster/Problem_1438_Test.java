package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1438_Test {
    Problem_1438.Solver p = new Problem_1438.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(new int[]{8, 2 ,4, 7}, 4));
        assertEquals(2, p.solve2(new int[]{8, 2 ,4, 7}, 4));
        assertEquals(2, p.solve3(new int[]{8, 2 ,4, 7}, 4));
    }
}

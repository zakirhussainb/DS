package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_190_Test {
    Problem_190.Solver p = new Problem_190.Solver();
    @Test
    public void test1() {
        assertEquals(964176192, p.solve1(43261596));
        assertEquals(964176192, p.solve2(43261596));
        assertEquals(964176192, p.solve3(43261596));
    }
}

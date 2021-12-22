package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_213_Test {
    Problem_213.Solver p = new Problem_213.Solver();
    Problem_213.Solver1 p1 = new Problem_213.Solver1();
    @Test
    public void test1() {
        assertEquals(4, p.solve1(new int[]{1, 2, 3, 1}));
        assertEquals(4, p1.solve1(new int[]{1, 2, 3, 1}));
    }
}

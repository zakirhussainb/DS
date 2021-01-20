package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_322_Test {
    Problem_322.Solver p = new Problem_322.Solver();
    @Test
    public void test1() {
        assertEquals(1, p.solve1(new int[]{8, 3, 1, 2}, 3));
    }
}

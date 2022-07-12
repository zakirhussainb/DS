package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_322_Test {
    Problem_322.Solver1 p1 = new Problem_322.Solver1();

    @Test
    public void test1() {
        assertEquals(1, p1.coinChange(new int[]{8, 3, 1, 2}, 3));

    }
}

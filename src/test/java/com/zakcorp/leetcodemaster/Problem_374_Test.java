package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_374_Test {
    Problem_374.Solver p = new Problem_374.Solver();

    @Test
    public void test1() {
        assertEquals(6, p.guessNumber(10));
    }
}

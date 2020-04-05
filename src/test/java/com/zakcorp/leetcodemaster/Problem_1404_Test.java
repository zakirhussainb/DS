package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_1404_Test {
    @Test
    public void test1() {
        Problem_1404.Solver p = new Problem_1404.Solver();
        assertEquals(6, p.numSteps("1101"));
        assertEquals(1, p.numSteps("10"));
        assertEquals(0, p.numSteps("1"));
        assertEquals(85, p.numSteps("1111011110000011100000110001011011110010111001010111110001"));
    }
}

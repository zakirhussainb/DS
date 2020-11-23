package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1100_Test {
    Problem_1100.Solver p = new Problem_1100.Solver();
    @Test
    public void test1() {
        assertEquals(6, p.solve1("havefunonleetcode", 5));
    }
}

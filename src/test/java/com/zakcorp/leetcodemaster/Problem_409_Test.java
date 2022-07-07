package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_409_Test {
    Problem_409.Solver p = new Problem_409.Solver();
    @Test
    public void test1() {
        assertEquals(7, p.solve1("abccccdd"));
    }
}

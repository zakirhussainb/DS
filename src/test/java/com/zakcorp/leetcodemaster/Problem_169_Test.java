package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_169_Test {
    Problem_169.Solver p = new Problem_169.Solver();
    @Test
    public void test1() {
//        assertEquals(3, p.solve1(new int[]{3, 2, 3}));
        assertEquals(3, p.solve2(new int[]{3, 2, 3}));
    }
}

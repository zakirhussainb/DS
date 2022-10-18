package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1338_Test {
    Problem_1338.Solver p = new Problem_1338.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(new int[]{3,3,3,3,5,5,5,2,2,7}));
    }
}

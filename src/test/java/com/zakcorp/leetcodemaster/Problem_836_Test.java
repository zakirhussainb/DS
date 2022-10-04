package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_836_Test {
    Problem_836.Solver p = new Problem_836.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1(new int[]{0,0,2,2}, new int[]{1,1,3,3}));
    }
}

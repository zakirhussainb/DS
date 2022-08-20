package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1561_Test {
    Problem_1561.Solver p = new Problem_1561.Solver();
    @Test
    public void test1() {
        assertEquals(18, p.solve1(new int[]{9,8,7,6,5,1,2,3,4}));
    }
}

package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1052_Test {
    Problem_1052.Solver p = new Problem_1052.Solver();
    @Test
    public void test1() {
        assertEquals(16, p.solve1(new int[]{1,0,1,2,1,1,7,5}, new int[]{0,1,0,1,0,1,0,1}, 3));
    }
}

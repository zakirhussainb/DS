package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_C_Test {
    Problem_C.Solver p = new Problem_C.Solver();
    @Test
    public void test1() {
        assertArrayEquals( new int[]{3,3,2,2,1}, p.solve1(new int[]{1,0,2,1,3}));
    }
}

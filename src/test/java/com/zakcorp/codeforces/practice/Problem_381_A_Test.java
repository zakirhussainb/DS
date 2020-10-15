package com.zakcorp.codeforces.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_381_A_Test {
    Problem_381_A.Solver p = new Problem_381_A.Solver();
    @Test
    public void test1() {
        assertEquals("12 5", p.solve1(new int[]{4,2,1,10}, 4));
    }
}

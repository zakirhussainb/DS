package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_C_Test {
    Problem_C.Solver p = new Problem_C.Solver();
    @Test
    public void test1() {
        assertEquals( 34, p.solve1(new int[]{15,45,20,2,34,35,5,44,32,30}));
    }
    @Test
    public void test2() {
        assertEquals( 5, p.solve1(new int[]{1,4}));
    }
}

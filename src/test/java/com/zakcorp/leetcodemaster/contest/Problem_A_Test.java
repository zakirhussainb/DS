package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals( 3, p.solve1(new int[] {-2,-1,-1,1,2,3}));
        assertEquals( 3, p.solve1(new int[] {-3,-2,-1,0,0,1,2}));
        assertEquals( 4, p.solve1(new int[] {5,20,66,1314}));
    }
}

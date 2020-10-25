package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_74_Test {
    Problem_74.Solver p = new Problem_74.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve2(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,50}}, 3));
    }
}

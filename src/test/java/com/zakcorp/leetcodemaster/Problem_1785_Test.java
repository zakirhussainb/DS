package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1785_Test {
    Problem_1785.Solver p = new Problem_1785.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(new int[]{1,-1,1}, 3, -4));
    }
}

package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_547_Test {
    Problem_547.Solver p = new Problem_547.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(new int[][]{
                {1,1,0},
                {1,1,0},
                {0,0,1} }));
    }
}

package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals(11, p.solve1( new int[][] { {1,2,3},{5,6,7},{9,10,11} }));
    }
    @Test
    public void test2() {
        assertEquals(17, p.solve1( new int[][] { {1,2,3},{5,17,7},{9,11,10} }));
    }
}

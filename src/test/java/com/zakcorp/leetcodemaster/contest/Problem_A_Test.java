package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{3, 1},
                p.solve1(new int[]{1,3,2,1,3,2,2}) );
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 0},
                p.solve1(new int[]{1,1}) );
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{0, 1},
                p.solve1(new int[]{0}) );
    }
}

package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_B_Test {
    Problem_B.Solver1 p = new Problem_B.Solver1();
    Problem_B.Solver2 p1 = new Problem_B.Solver2();
    @Test
    public void test1() {
        assertArrayEquals( new long[]{5,0,3,4,0}, p.solve1( new int[]{1,3,1,1,2} ) );
        assertArrayEquals( new long[]{5,0,3,4,0}, p1.solve1( new int[]{1,3,1,1,2} ) );
    }
    @Test
    public void test2() {
        assertArrayEquals( new long[]{0,0,0}, p.solve1( new int[]{0,5,3} ) );
        assertArrayEquals( new long[]{0,0,0}, p1.solve1( new int[]{0,5,3} ) );
    }
}

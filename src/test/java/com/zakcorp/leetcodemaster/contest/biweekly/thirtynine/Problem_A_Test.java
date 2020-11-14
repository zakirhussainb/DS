package com.zakcorp.leetcodemaster.contest.biweekly.thirtynine;

import com.zakcorp.leetcodemaster.Problem_1;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{12,10,16,13}, p.solve1(new int[]{5,7,1,4}, 3) );
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{0,0,0,0}, p.solve1(new int[]{1,2,3,4}, 0) );
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{12,5,6,13}, p.solve1(new int[]{2,4,9,3}, -2) );
    }
}

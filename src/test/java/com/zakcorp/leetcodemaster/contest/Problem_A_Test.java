package com.zakcorp.leetcodemaster.contest;

import com.zakcorp.leetcodemaster.Problem_1;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals(1, p.solve1(new int[]{-5,1,5,0,-7}));
    }
    @Test
    public void test2() {
        assertEquals(0, p.solve1(new int[]{-4,-3,-2,-1,4,3,2}));
    }
}

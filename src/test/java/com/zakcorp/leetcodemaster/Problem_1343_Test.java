package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1343_Test {
    Problem_1343.Solver p = new Problem_1343.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1(new int[]{2,2,2,2,5,5,5,8}, 3, 4));
    }
}

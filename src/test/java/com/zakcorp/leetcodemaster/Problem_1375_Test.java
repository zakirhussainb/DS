package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1375_Test {
    Problem_1375.Solver p = new Problem_1375.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(new int[]{3,2,4,1,5}));
    }
}

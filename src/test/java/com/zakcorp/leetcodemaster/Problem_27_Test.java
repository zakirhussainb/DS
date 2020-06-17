package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_27_Test {
    Problem_27.Solver p = new Problem_27.Solver();

    @Test
    public void test1() {
        assertEquals(2, p.removeElement(new int[]{3,2,2,3}, 3));
    }
}

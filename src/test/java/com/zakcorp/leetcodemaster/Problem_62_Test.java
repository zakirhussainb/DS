package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_62_Test {
    Problem_62.Solver p = new Problem_62.Solver();
    @Test
    public void test1() {
        assertEquals(20, p.gridRecursive(4, 4));
    }
}

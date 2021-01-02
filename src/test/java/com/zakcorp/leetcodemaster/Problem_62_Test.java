package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_62_Test {
    Problem_62.Solver p = new Problem_62.Solver();
    Problem_62.Solver1 p1 = new Problem_62.Solver1();
    Problem_62.Solver2 p2 = new Problem_62.Solver2();
    @Test
    public void test1() {
        assertEquals(20, p.gridRecursive(4, 4));
        assertEquals(20, p1.gridMemoized(4, 4));
        assertEquals(20, p2.gridTabulation(4, 4));
    }
    @Test
    public void test2() {
        assertEquals(1287, p.gridRecursive(6, 9));
        assertEquals(1287, p1.gridMemoized(6, 9));
    }@Test
    public void test3() {
//        assertEquals(1916797311, p.gridRecursive(51, 9));
        assertEquals(1916797311, p1.gridMemoized(51, 9));
    }
}

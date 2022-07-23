package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals("Flush",
                p.solve1(new int[]{13,2,3,1,9}, new char[]{'a','a','a','a','a'}) );
    }
    @Test
    public void test2() {
        assertEquals("Three of a Kind",
                p.solve1(new int[]{4,4,2,4,4}, new char[]{'d','a','a','b','c'}) );
    }
    @Test
    public void test3() {
        assertEquals("Pair",
                p.solve1(new int[]{10,10,2,12,9}, new char[]{'a','b','c','a','d'}) );
    }
    @Test
    public void test4() {
        assertEquals("High Card",
                p.solve1(new int[]{13,2,3,1,9}, new char[]{'a','b','c','d','e'}) );
    }
}

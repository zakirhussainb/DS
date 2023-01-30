package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1695_Test
{
    Problem_1695.Solver p = new Problem_1695.Solver();
    @Test
    public void test1() {
        assertEquals(8, p.solve1(new int[]{5,2,1,2,5,2,1,2,5}));
    }
    @Test
    public void test2() {
        assertEquals(17, p.solve1(new int[]{4,2,4,5,6}));
    }
    @Test
    public void test3() {
        assertEquals(16911, p.solve1(new int[]{187,470,25,436,538,809,441,167,477,110,275,133,666,345,411,459,490,
                                            266,987,965,429,166,809,340,467,318,125,165,809,610,31,585,970,306,42,189,169,
                                            743,78,810,70,382,367,490,787,670,476,278,775,673,299,19,893,817,971,458,409,886,434}));
    }
}

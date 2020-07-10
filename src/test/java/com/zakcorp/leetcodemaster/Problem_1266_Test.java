package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1266_Test {
    Problem_1266 p = new Problem_1266();
    @Test
    public void test1() {
        assertEquals(5, p.minTimeToVisitAllPoints(new int[][]{{3,2},{-2,2}}));
    }
    @Test
    public void test2() {
        assertEquals(7, p.minTimeToVisitAllPoints(new int[][]{{1,1},{3,4},{-1,0}}));
    }
}

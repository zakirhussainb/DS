package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_997_Test {
    Problem_997 p = new Problem_997();
    @Test
    public void test1() {
        assertEquals(2, p.findJudge(2, new int[][]{ {1, 2} }));
    }
    @Test
    public void test2() {
        assertEquals(3, p.findJudge(3, new int[][]{ {1, 3}, {2, 3} }));
    }
    @Test
    public void test3() {
        assertEquals(-1, p.findJudge(3, new int[][]{ {1, 3}, {2, 3}, {3, 1} }));
    }
    @Test
    public void test4() {
        assertEquals(-1, p.findJudge(3, new int[][]{ {1, 2}, {2, 3} }));
    }
    @Test
    public void test5() {
        assertEquals(3, p.findJudge(4, new int[][]{ {1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3} }));
    }
}

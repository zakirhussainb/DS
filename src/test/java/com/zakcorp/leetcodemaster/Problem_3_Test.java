package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_3_Test {
    /**
     * "abcabcbb"
     * "bbbbb"
     * "pwwkew"
     * ""
     * "aabccbb"
     * "abbbb"
     * "abccde"
     * "b"
     * "dvdf"
     */
    Problem_3.Solver p = new Problem_3.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1("abcabcbb"));
        assertEquals(3, p.solve2("abcabcbb"));
        assertEquals(3, p.solve3("abcabcbb"));
    }
    @Test
    public void test2() {
        assertEquals(2, p.solve1("abbbb"));
        assertEquals(2, p.solve2("abbbb"));
        assertEquals(2, p.solve3("abbbb"));
    }
    @Test
    public void test3() {
        assertEquals(1, p.solve1("b"));
        assertEquals(1, p.solve2("b"));
        assertEquals(1, p.solve3("b"));
    }

}

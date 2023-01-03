package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1750_Test {
    Problem_1750.Solver p = new Problem_1750.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1("ca"));
    }
    @Test
    public void test2() {
        assertEquals(0, p.solve1("cabaabac"));
    }
    @Test
    public void test3() {
        assertEquals(3, p.solve1("aabccabba"));
    }
    @Test
    public void test4() {
        assertEquals(109, p.solve1("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbacccabbabccaccbacaaccacacccaccbbbacaabb" +
                                   "ccbbcbcbcacacccccccbcbbabccaacaabacbbaccccbabbcbccccaccacaccbcbbcbcccabaaaabbbbbbbbbbbbbbb"));
    }
    @Test
    public void test5() {
        assertEquals(0, p.solve1("abbbbbbbbbbbbbbbbbbba"));
    }

    @Test
    public void test6() {
        assertEquals(0, p.solve1("bbbbbbbbbbbbbbbbbbb"));
    }
}

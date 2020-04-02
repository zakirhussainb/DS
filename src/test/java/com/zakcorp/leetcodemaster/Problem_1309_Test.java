package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_1309_Test {
    Problem_1309.Solver p = new Problem_1309.Solver();
    @Test
    public void test1() {
        assertEquals("jkab", p.freqAlphabets("10#11#12"));
    }
    @Test
    public void test2() {
        assertEquals("acz", p.freqAlphabets("1326#"));
    }
    @Test
    public void test3() {
        assertEquals("y", p.freqAlphabets("25#"));
    }
    @Test
    public void test4() {
        assertEquals("abcdefghijklmnopqrstuvwxyz", p.freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
    }
}

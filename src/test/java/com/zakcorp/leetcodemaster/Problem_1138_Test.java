package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1138_Test
{
    Problem_1138.Solver p = new Problem_1138.Solver();
    @Test
    public void test1() {
        assertEquals("DDR!UURRR!!DDD!", p.solve1("leet"));
    }
    @Test
    public void test2() {
        assertEquals("RR!DDRR!UUL!R!", p.solve1("code"));
    }
    @Test
    public void test3() {
        assertEquals("DDDDD!UUUUURRR!DDDDLLLD!", p.solve1("zdz"));
    }
    @Test
    public void test4() {
        assertEquals("DDDRRRR!DLLLLD!UURRRR!", p.solve1("tzt"));
    }
}

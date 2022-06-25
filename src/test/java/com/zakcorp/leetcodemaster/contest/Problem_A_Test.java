package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals(5, p.solve1("yo|uar|e**|b|e***au|tifu|l"));
    }
    @Test
    public void test2() {
        assertEquals(7, p.solve1("yo|uar|e**|b|e***au|tifu|l**m|op|etht"));
    }
    @Test
    public void test3() {
        assertEquals(0, p.solve1("iamprogrammer"));
    }
    @Test
    public void test4() {
        assertEquals(2, p.solve1("l|*e*et|c**o|*de|"));
    }
    @Test
    public void test5() {
        assertEquals(6, p.solve1("|**|*|*|**||***||"));
    }
    @Test
    public void test6() {
        assertEquals(3, p.solve1("*||*|||||*|*|***||*||***|"));
    }
}

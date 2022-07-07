package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_150_Test {
    Problem_150.Solver p = new Problem_150.Solver();
    @Test
    public void test1() {
        assertEquals(9, p.solve2(new String[]{"2","1","+","3","*"}));
    }
    @Test
    public void test2() {
        assertEquals(6, p.solve2(new String[]{"4","13","5","/","+"}));
    }
    @Test
    public void test3() {
        assertEquals(22, p.solve2(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
    @Test
    public void test4() {
        assertEquals(18, p.solve2(new String[]{"18"}));
    }
}

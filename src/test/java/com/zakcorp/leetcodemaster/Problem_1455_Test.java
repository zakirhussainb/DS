package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_1455_Test {
    Problem_1455.Solver p = new Problem_1455.Solver();

    @Test
    public void test1() {
        assertEquals(4, p.isPrefixOfWord("i love eating burger", "burg"));
    }
    @Test
    public void test2() {
        assertEquals(2, p.isPrefixOfWord("this problem is an easy problem", "pro"));
    }
    @Test
    public void test3() {
        assertEquals(-1, p.isPrefixOfWord("i am tired", "you"));
    }
    @Test
    public void test4() {
        assertEquals(4, p.isPrefixOfWord("i use triple pillow", "pill"));
    }
    @Test
    public void test5() {
        assertEquals(-1, p.isPrefixOfWord("hello from the other side", "they"));
    }
    @Test
    public void test6() {
        assertEquals(-1, p.isPrefixOfWord("hellohello hellohellohello", "ell"));
    }

}

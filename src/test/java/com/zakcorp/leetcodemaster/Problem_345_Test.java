package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_345_Test {
    Problem_345.Solver p = new Problem_345.Solver();

    @Test
    public void test1() {
        assertEquals("hollem", p.reverseVowels("hellom"));
    }
    @Test
    public void test2() {
        assertEquals("holle", p.reverseVowels("hello"));
    }
    @Test
    public void test3() {
        assertEquals("leotcede", p.reverseVowels("leetcode"));
    }
    @Test
    public void test4() {
        assertEquals("", p.reverseVowels(""));
    }
    @Test
    public void test5() {
        assertEquals("uoiea", p.reverseVowels("aeiou"));
    }
    @Test
    public void test6() {
        assertEquals("aaaaa", p.reverseVowels("aaaaa"));
    }
    @Test
    public void test7() {
        assertEquals("Aa", p.reverseVowels("aA"));
    }
//    @Test
//    public void test2() {
//        assertEquals(-1, p.strStr("aaaaa", "bba"));
//    }
//    @Test
//    public void test3() {
//        assertEquals(0, p.strStr("aaaaa", ""));
//    }
}

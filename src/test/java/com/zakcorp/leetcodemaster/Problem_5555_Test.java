package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_5555_Test {
    Problem_5555 p = new Problem_5555();
    @Test
    public void test1() {
        assertEquals(5, p.countVowelStrings(1));
    }
    @Test
    public void test2() {
        assertEquals(15, p.countVowelStrings(2));
    }
    @Test
    public void test3() {
        assertEquals(66045, p.countVowelStrings(33));
    }
}

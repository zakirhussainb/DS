package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Problem_242_Test {
    Problem_242 p = new Problem_242();
    @Test
    public void test1() {
        assertTrue(p.isAnagram("anagram", "nagaram"));
    }
    @Test
    public void test2() {
        assertFalse(p.isAnagram("rat", "car"));
    }
}

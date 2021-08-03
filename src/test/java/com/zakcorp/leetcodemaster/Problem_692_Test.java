package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Problem_692_Test {
    Problem_692.Solver p = new Problem_692.Solver();
    @Test
    public void test1() {
        assertEquals( Arrays.asList("i", "love"),
                p.solve1( new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2) );
    }
    @Test
    public void test2() {
        assertEquals( Arrays.asList("the", "is", "sunny", "day"),
                p.solve1( new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4) );
    }
    @Test
    public void test3() {
        assertEquals( Arrays.asList("i","love","coding"),
                p.solve1( new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 3) );
    }
}
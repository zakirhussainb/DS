package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Problem_890_Test {
    Problem_890.Solver p = new Problem_890.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList("mee", "aqq"), p.solve1(new String[]{"abc","deq","mee","aqq","dkd","ccc"}, "abb"));
    }
    @Test
    public void test2() {
        assertEquals(Arrays.asList("abc", "deq"), p.solve1(new String[]{"abc","deq","mee","aqq","dkd","ccc"}, "abc"));
    }
}

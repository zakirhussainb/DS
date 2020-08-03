package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_953_Test {
    Problem_953.Solver p = new Problem_953.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
        assertTrue(p.solve2(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
    }
    @Test
    public void test2() {
        assertFalse(p.solve1(new String[]{"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz"));
        assertFalse(p.solve2(new String[]{"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz"));
    }
    @Test
    public void test3() {
        assertFalse(p.solve1(new String[]{"apple", "app"}, "abcdefghijklmnopqrstuvwxyz"));
        assertFalse(p.solve2(new String[]{"apple", "app"}, "abcdefghijklmnopqrstuvwxyz"));
    }
    @Test
    public void test4() {
        assertFalse(p.solve1(new String[]{"fxasxpc","dfbdrifhp","nwzgs","cmwqriv","ebulyfyve","miracx","sxckdwzv",
                        "dtijzluhts","wwbmnge","qmjwymmyox"},
                "zkgwaverfimqxbnctdplsjyohu"));
        assertFalse(p.solve2(new String[]{"fxasxpc","dfbdrifhp","nwzgs","cmwqriv","ebulyfyve","miracx","sxckdwzv",
                        "dtijzluhts","wwbmnge","qmjwymmyox"},
                "zkgwaverfimqxbnctdplsjyohu"));
    }
    @Test
    public void test5() {
        assertTrue(p.solve1(new String[]{"word", "worda", "row"}, "worldabcefghijkmnpqstuvxyz"));
        assertTrue(p.solve2(new String[]{"word", "worda", "row"}, "worldabcefghijkmnpqstuvxyz"));
    }
}

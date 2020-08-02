package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1528_Test {
    Problem_1528 p = new Problem_1528();
    @Test
    public void test1() {
        assertEquals("arigatou", p.restoreString("aaiougrt", new int[]{4,0,2,6,7,3,1,5}));
    }
    @Test
    public void test2() {
        assertEquals("rat", p.restoreString("art", new int[]{1,0,2}));
    }
    @Test
    public void test3() {
        assertEquals("nihao", p.restoreString("aiohn", new int[]{3,1,4,2,0}));
    }
    @Test
    public void test4() {
        assertEquals("abc", p.restoreString("abc", new int[]{0,1,2}));
    }
    @Test
    public void test5() {
        assertEquals("leetcode", p.restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3}));
    }

}

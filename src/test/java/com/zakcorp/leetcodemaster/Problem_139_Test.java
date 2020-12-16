package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Problem_139_Test {
    Problem_139.Solver p = new Problem_139.Solver();
    Problem_139.Solver1 p1 = new Problem_139.Solver1();
    @Test
    public void test1() {
        assertTrue( p.solve1("leetcode", Arrays.asList("code", "leet") ));
        assertTrue( p1.solve1("leetcode", Arrays.asList("code", "leet") ));
    }
    @Test
    public void test2() {
        assertTrue( p.solve1("applepenapple", Arrays.asList("apple", "pen") ));
        assertTrue( p1.solve1("applepenapple", Arrays.asList("apple", "pen") ));
    }
    @Test
    public void test3() {
        assertFalse( p.solve1("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat") ));
        assertFalse( p1.solve1("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat") ));
    }
    @Test
    public void test4() {
        assertTrue( p.solve1("bb", Arrays.asList("a","b","bbb","bbbb") ));
        assertTrue( p1.solve1("bb", Arrays.asList("a","b","bbb","bbbb") ));
    }
    @Test
    public void test5() {
        assertTrue( p.solve1("cars", Arrays.asList("car","ca","rs") ));
        assertTrue( p1.solve1("cars", Arrays.asList("car","ca","rs") ));
    }
}

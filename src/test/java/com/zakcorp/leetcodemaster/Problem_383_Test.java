package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_383_Test {
    Problem_383.Solver p = new Problem_383.Solver();
    @Test
    public void test1() {
        assertTrue( p.solve1("aab", "baa") );
    }
    @Test
    public void test2() {
        assertTrue( p.solve1("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj") );
    }
    @Test
    public void test3() {
        assertFalse( p.solve1("aa", "ab") );
    }
}

package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_744_Test {
    Problem_744.Solver p = new Problem_744.Solver();
    @Test
    public void test1() {
        assertEquals('c', p.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a'));
    }
    @Test
    public void test2() {
        assertEquals('f', p.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c'));
    }
    @Test
    public void test3() {
        assertEquals('f', p.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'd'));
    }
    @Test
    public void test4() {
        assertEquals('j', p.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'g'));
    }
    @Test
    public void test5() {
        assertEquals('c', p.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'j'));
    }
    @Test
    public void test6() {
        assertEquals('c', p.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'k'));
    }

}

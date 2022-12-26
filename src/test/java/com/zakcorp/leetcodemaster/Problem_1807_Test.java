package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class Problem_1807_Test
{
    Problem_1807.Solver p = new Problem_1807.Solver();
    @Test
    public void test1() {
        List<List<String>> list = new ArrayList<>();
        list.add( Arrays.asList( "name", "bob" ) );
        list.add( Arrays.asList( "age", "two" ) );
        assertEquals("bobistwoyearsold", p.solve1("(name)is(age)yearsold", list));
    }
    @Test
    public void test2() {
        List<List<String>> list = new ArrayList<>();
        list.add( Arrays.asList( "a", "b" ) );
        assertEquals("hi?", p.solve1("hi(name)", list));
    }
    @Test
    public void test3() {
        List<List<String>> list = new ArrayList<>();
        list.add( Arrays.asList( "a", "yes" ) );
        assertEquals("yesyesyesaaa", p.solve1("(a)(a)(a)aaa", list));
    }
}

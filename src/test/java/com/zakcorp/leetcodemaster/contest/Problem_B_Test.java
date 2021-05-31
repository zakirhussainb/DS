package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_B_Test {
    Problem_B.Solver p = new Problem_B.Solver();
//    @Test
//    public void test1() {
//        assertEquals( "999", p.solve1("999", 9));
//    }
//    @Test
//    public void test2() {
//        assertEquals( "8756", p.solve1("756", 8)); // 'x' >= every element in 'n'
//    }
//    @Test
//    public void test3() {
//        assertEquals( "763", p.solve1("73", 6)); // 'x' <= left element but >= right element in 'n'
//    }
//    @Test
//    public void test4() {
//        assertEquals( "84567", p.solve1("4765", 4)); //
//    }
    @Test
    public void test5() {
//        assertEquals( "6638", p.solve1("638", 6));
//        assertEquals( "6638", p.solve1("1234", 5));
//        assertEquals( "6638", p.solve1("8765", 9));
//        assertEquals( "87652", p.solve1("8765", 2)); // passed
//        assertEquals( "87655", p.solve1("8765", 5)); // passed
        assertEquals( "87665", p.solve1("8765", 6));
    }
//    @Test
//    public void test6() {
//        assertEquals( "6638", p.solve1("678", 6)); //
//    }
}

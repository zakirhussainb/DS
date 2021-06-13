package com.zakcorp.final450.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P_382_Test {
    P_382.Solver p = new P_382.Solver();
    @Test
    public void test1() {
        assertEquals(6, p.solve1(3, 2) );
        assertEquals(6, p.solve2(3, 2) );
        assertEquals(6, p.solve3(3, 2) );
        assertEquals(6, p.solve4(3, 2) );
    }
//    @Test
//    public void test2() {
////        assertEquals(444567808, p.solve1(100, 5) );
//        assertEquals(444567808, p.solve3(100, 5) );
//    }
    @Test
    public void test3() {
//        assertEquals(90, p.solve1(10, 2) ); // recursive
        assertEquals(90, p.solve2(10, 2) ); // memoized
//        assertEquals(90, p.solve3(10, 2) ); // tabulation - 1
//        assertEquals(90, p.solve4(10, 2) ); // tabulation - 2
    }
}

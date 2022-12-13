package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1352_Test
{
    Problem_1352.Solver p = new Problem_1352.Solver();
    Problem_1352.Solver1 p1 = new Problem_1352.Solver1();
    @Test
    public void test1() {
        p.add( 3 );
        p.add( 0 );
        p.add( 2 );
        p.add( 5 );
        p.add( 4 );
        assertEquals(20, p.getProduct(2));
        assertEquals(40, p.getProduct(3));
        assertEquals(0, p.getProduct(4));
        p.add( 8 );
        assertEquals(32, p.getProduct(2));

        p1.add( 3 );
        p1.add( 0 );
        p1.add( 2 );
        p1.add( 5 );
        p1.add( 4 );
        assertEquals(20, p1.getProduct(2));
        assertEquals(40, p1.getProduct(3));
        assertEquals(0, p1.getProduct(4));
        p1.add( 8 );
        assertEquals(32, p1.getProduct(2));
    }
}

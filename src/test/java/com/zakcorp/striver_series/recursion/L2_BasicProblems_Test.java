package com.zakcorp.striver_series.recursion;

import org.junit.Before;
import org.junit.Test;

public class L2_BasicProblems_Test
{
    private L2_BasicProblems l2;
    @Before
    public void setup() {
        l2 = new L2_BasicProblems();
    }
    @Test
    public void test_printName() {
        l2.printName( 5 );
    }

    @Test
    public void test_printLinearlyFromOneToN() {
        l2.printLinearlyFromOneToN(1, 5 );
    }

    @Test
    public void test_printLinearlyFromNToOne() {
        l2.printLinearlyFromNToOne(5 );
    }

    @Test
    public void test_printLinearlyFromOneToN_backtracking() {
        l2.printLinearlyFromOneToN_Backtracking( 5, 5 );
    }

    @Test
    public void test_printLinearlyFromNToOne_backtracking() {
        l2.printLinearlyFromNToOne_Backtracking(1, 5);
    }
}

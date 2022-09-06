package com.zakcorp.striver_series.recursion;

import static org.junit.Assert.*;

import com.zakcorp.striver_series.recursion.L4_ProblemsOnFunctionalRecursion.P2_Palindrome;

import org.junit.Before;
import org.junit.Test;

public class L4_ProblemsOnFunctionalRecursion_Test
{
    private L4_ProblemsOnFunctionalRecursion.P1_ReverseArray l4;
    private L4_ProblemsOnFunctionalRecursion.P2_Palindrome l4p2;
    @Before
    public void setup() {
        l4 = new L4_ProblemsOnFunctionalRecursion.P1_ReverseArray();
        l4p2 = new P2_Palindrome();
    }
    @Test
    public void test_reverseArrayIterative() {
        assertArrayEquals( new int[]{5, 4, 3, 2 ,1},
                      l4.reverseArrayIterative( new int[]{ 1, 2, 3, 4, 5} ) );
    }

    @Test
    public void test_reverseArrayRecursive() {
        assertArrayEquals( new int[]{5, 4, 3, 2 ,1},
                           l4.reverseArrayRecursive( new int[]{ 1, 2, 3, 4, 5} ) );
    }

    @Test
    public void test_checkIfPalindromeRecursive() {
        assertTrue( l4p2.checkIfPalindromeRecursive( new int[]{ 1, 2, 3, 2, 1} ) );
    }

}

package com.zakcorp.striver_series.recursion;

import com.zakcorp.striver_series.recursion.L4_ProblemsOnFunctionalRecursion.P2_Palindrome;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class L6_RecursionOnSubsequences_Test
{
    private L6_RecursionOnSubsequences l6;
    @Before
    public void setup() {
        l6 = new L6_RecursionOnSubsequences();
    }
    @Test
    public void test_printAllSubsequences() {
        l6.printAllSubsequences(new int[]{3, 1, 2});
    }

}

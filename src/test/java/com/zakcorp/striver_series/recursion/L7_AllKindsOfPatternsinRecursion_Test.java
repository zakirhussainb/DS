package com.zakcorp.striver_series.recursion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L7_AllKindsOfPatternsinRecursion_Test
{
    private L7_AllKindsOfPatternsInRecursion.PrintAllSubsequencesWhoseSumIsK l7_1;
    private L7_AllKindsOfPatternsInRecursion.PrintAnyOneSubsequencesWhoseSumIsK l7_2;
    private L7_AllKindsOfPatternsInRecursion.CountAllTheSubsequencesWhoseSumIsK l7_3;
    @Before
    public void setup() {
        l7_1 = new L7_AllKindsOfPatternsInRecursion.PrintAllSubsequencesWhoseSumIsK();
        l7_2 = new L7_AllKindsOfPatternsInRecursion.PrintAnyOneSubsequencesWhoseSumIsK();
        l7_3 = new L7_AllKindsOfPatternsInRecursion.CountAllTheSubsequencesWhoseSumIsK();
    }
    @Test
    public void test_printAllSubsequencesWhoseSumIsK() {
        l7_1.printAllSubsequencesWhoseSumIsK(new int[]{1,1,2}, 2);
    }

    @Test
    public void test_printAnyOneSubsequencesWhoseSumIsK() {
        l7_2.printAnyOneSubsequenceWhoseSumIsK(new int[]{1,1,2}, 2);
    }

    @Test
    public void test_countAllSubsequencesWhoseSumIsK() {
        assertEquals(2, l7_3.countAllSubsequenceWhoseSumIsK(new int[]{1,1,2}, 2));
    }
}

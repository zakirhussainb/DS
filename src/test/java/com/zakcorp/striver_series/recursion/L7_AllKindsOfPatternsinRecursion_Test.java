package com.zakcorp.striver_series.recursion;

import org.junit.Before;
import org.junit.Test;

public class L7_AllKindsOfPatternsinRecursion_Test
{
    private L7_AllKindsOfPatternsInRecursion l7;
    @Before
    public void setup() {
        l7 = new L7_AllKindsOfPatternsInRecursion();
    }
    @Test
    public void test_printAllSubsequencesWhoseSumIsK() {
        l7.printAllSubsequencesWhoseSumIsK(new int[]{1,1,2}, 2);
    }

}

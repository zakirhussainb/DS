package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import java.util.*;

public class Problem_811_Test {
    Problem_811.Solver p = new Problem_811.Solver();
    Problem_811.Solver1 p1 = new Problem_811.Solver1();
    @Test
    public void test1() {
        String[] domainArr_Actual = new String[]{"9001 discuss.leetcode.com"};
        String[] domainArr_Expected = new String[]{"9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"};
        List<String> expectedList = Arrays.asList(domainArr_Expected);
        Collections.sort(expectedList);

//        List<String> outputList = p.subdomainVisits(domainArr_Actual);
//        Collections.sort(outputList);
//        assertEquals(expectedList, outputList);

        List<String> outputList1 = p1.subdomainVisits(domainArr_Actual);
        Collections.sort(outputList1);
        assertEquals(expectedList, outputList1);
    }

    @Test
    public void test2() {
        String[] domainArr_Actual = new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        String[] domainArr_Expected = new String[]{"901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"};
        List<String> expectedList = Arrays.asList(domainArr_Expected);
        Collections.sort(expectedList);

//        List<String> outputList = p.subdomainVisits(domainArr_Actual);
//        Collections.sort(outputList);
//        assertEquals(expectedList, outputList);

        List<String> outputList1 = p1.subdomainVisits(domainArr_Actual);
        Collections.sort(outputList1);
        assertEquals(expectedList, outputList1);
    }
}

package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Problem_415_Test {
    Problem_415.Solver p = new Problem_415.Solver();
    Problem_415.Solver1 p1 = new Problem_415.Solver1();

    @Test
    public void test1() {
        assertEquals("1000", p1.addStrings("540", "460"));
        assertEquals("1998", p1.addStrings("999", "999"));
    }
    @Test
    public void test2() {
        assertEquals("0", p.addStrings("0", "0"));
        assertEquals("0", p1.addStrings("0", "0"));
    }
    @Test
    public void test3() {
        assertEquals("12325896929913", p.addStrings("12323543464567", "2353465346"));
        assertEquals("12325896929913", p1.addStrings("12323543464567", "2353465346"));
    }
    @Test
    public void test4() {
        assertEquals("", p.addStrings("", ""));
        assertEquals("", p1.addStrings("", ""));
    }
    @Test
    public void test5() {
        assertEquals("10405985147604178950", p.addStrings("3876620623801494171", "6529364523802684779"));
        assertEquals("10405985147604178950", p1.addStrings("3876620623801494171", "6529364523802684779"));
    }
    @Test
    public void test6() {
        assertEquals("167141802233061013023557799168121920809282032", p.addStrings("401716832807512840963", "167141802233061013023557397451289113296441069"));
        assertEquals("167141802233061013023557799168121920809282032", p1.addStrings("401716832807512840963", "167141802233061013023557397451289113296441069"));
    }
    @Test
    public void test7() {
//        assertEquals("", p.addStrings("401716832807512840963", "167141802233061013023557397451289113296441069"));
        assertEquals("108", p1.addStrings("9", "99"));
    }

}
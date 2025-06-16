package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_3484_Test {

    @Test
    public void test1() {
        Problem_3484.Spreadsheet p = new Problem_3484.Spreadsheet(3);
        p.getValue("=5+7"); // returns 12 (5+7)
        p.setCell("A1", 10); // sets A1 to 10
        p.getValue("=A1+6"); // returns 16 (10+6)
        p.setCell("B2", 15); // sets B2 to 15
        p.getValue("=A1+B2"); // returns 25 (10+15)
        p.resetCell("A1"); // resets A1 to 0
        p.getValue("=A1+B2"); // returns 15 (0+15)
    }
}

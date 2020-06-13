package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1470_Test {
    Problem_1470.Solver p = new Problem_1470.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{2,3,5,4,1,7}, p.shuffle(new int[]{2,5,1,3,4,7}, 3));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{1,4,2,3,3,2,4,1}, p.shuffle(new int[]{1,2,3,4,4,3,2,1}, 4));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{1,2,1,2}, p.shuffle(new int[]{1,1,2,2}, 2));
    }
    @Test
    public void test4() {
        assertArrayEquals(new int[]{660, 911, 650, 938, 453, 530, 568, 193, 202, 810, 429, 318, 255, 535, 351, 847, 429, 405, 632,
         25, 902, 549, 41, 806, 711, 434, 100, 435, 61, 243, 822, 161, 356, 823, 479, 561, 870, 637, 755, 219, 415, 661, 919, 35, 475,
         467, 884, 138, 504, 822, 212, 54, 941, 689, 848, 833, 232, 427, 807, 518, 340, 60, 354, 585, 72, 844, 542, 241, 805, 330, 989,
         294, 678, 234, 266, 758, 658, 719, 289, 422, 100, 130, 116, 595, 29, 435, 573, 179, 459, 868, 648, 400, 606, 964, 729, 816, 697,
         670, 257, 12}, p.shuffle(new int[]{660,650,453,568,202,429,255,351,429,632,902,41,711,100,61,822,356,
                479,870,755,415,919,475,884,504,212,941,848,232,807,340,354,72,542,805,989,678,266,658,289,100,116,29,573,459,648,
                606,729,697,257,911,938,530,193,810,318,535,847,405,25,549,806,434,435,243,161,823,561,637,219,661,35,467,138,822,
                54,689,833,427,518,60,585,844,241,330,294,234,758,719,422,130,595,435,179,868,400,964,816,670,12}, 50));
    }
    @Test
    public void test5() {
        assertArrayEquals(new int[]{1000, 999}, p.shuffle(new int[]{1000, 999}, 1));
    }

}

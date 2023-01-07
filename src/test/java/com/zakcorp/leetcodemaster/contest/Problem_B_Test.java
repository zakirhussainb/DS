package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_B_Test {
    @Test
    public void test1() {
        Problem_B.DataStream p = new Problem_B.DataStream(4, 3);
        System.out.println("..." + p.consec( 4 ));
        System.out.println("..." + p.consec( 4 ));
        System.out.println("..." + p.consec( 4 ));
        System.out.println("..." + p.consec( 3 ));
        System.out.println("..." + p.consec( 4 ));
        System.out.println("..." + p.consec( 4 ));
        System.out.println("..." + p.consec( 4 ));
    }
}

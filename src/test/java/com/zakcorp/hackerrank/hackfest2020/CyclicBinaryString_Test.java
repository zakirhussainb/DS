package com.zakcorp.hackerrank.hackfest2020;

import com.zakcorp.hackerrank.contest.hackfest2020.CyclicBinaryString;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

/**
 * Created by Zakir Hussain B on 09/10/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class CyclicBinaryString_Test {
    CyclicBinaryString.Solver p = new CyclicBinaryString.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1("0011"));
    }
    @Test
    public void test2() {
        assertEquals(0, p.solve1("111"));
    }
    @Test
    public void test3() {
        assertEquals(1, p.solve1("110"));
    }
}
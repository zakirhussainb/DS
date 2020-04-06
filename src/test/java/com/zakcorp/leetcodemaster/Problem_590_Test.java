package com.zakcorp.leetcodemaster;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Problem_590_Test {
    Problem_590.Solver p = new Problem_590.Solver();
    Problem_590.Node one;
    @Before
    public void setup() {
        one = new Problem_590.Node(1);
        Problem_590.Node three = new Problem_590.Node(3);
        List<Problem_590.Node> threeChildren = new ArrayList<>();
        threeChildren.add(new Problem_590.Node(5));
        threeChildren.add(new Problem_590.Node(6));
        three.children = threeChildren;
        List<Problem_590.Node> oneChildren = new ArrayList<>();
        oneChildren.add(three);
        oneChildren.add(new Problem_590.Node(2));
        oneChildren.add(new Problem_590.Node(4));
        one.children = oneChildren;
    }
    @Test
    public void test1_recursive() {
        List<Integer> list = new ArrayList<>();
        assertEquals(Arrays.asList(5,6,3,2,4,1), p.postOrderRecursive(one, list));
    }
    @Test
    public void test1_iterative() {
        LinkedList<Integer> list = new LinkedList<>();
        assertEquals(Arrays.asList(5,6,3,2,4,1), p.postOrderIterative(one, list));
    }
}

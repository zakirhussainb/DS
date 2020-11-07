package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_148_Test {
    Problem_148.Solver p = new Problem_148.Solver();
    @Test
    public void test1() {
        Problem_148.Node head = new Problem_148.Node(4);
        head.next = new Problem_148.Node(1);
        head.next.next = new Problem_148.Node(3);
        head.next.next.next = new Problem_148.Node(2);
        head.next.next.next.next = new Problem_148.Node(5);

        Problem_148.Node result = new Problem_148.Node(1);
        result.next = new Problem_148.Node(2);
        result.next.next = new Problem_148.Node(3);
        result.next.next.next = new Problem_148.Node(4);
        result.next.next.next.next = new Problem_148.Node(5);
        assertEquals(result, p.mergeSort(head));
    }
}

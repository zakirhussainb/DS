package com.zakcorp.leetcodemaster;

import com.zakcorp.linkedlists.singly.SinglyLLIntImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Problem_141_Test {
    Problem_141.Solver p = new Problem_141.Solver();
    @Test
    public void test1() {
        SinglyLLIntImpl.Node head = new SinglyLLIntImpl.Node(1);
        head.next = new SinglyLLIntImpl.Node(2);
        head.next.next = new SinglyLLIntImpl.Node(3);
        head.next.next.next = new SinglyLLIntImpl.Node(4);
        head.next.next.next.next = new SinglyLLIntImpl.Node(5);
        head.next.next.next.next.next = head.next.next;
        assertTrue(p.solve1(head));
        assertTrue(p.solve2(head));
    }


}

package com.zakcorp.leetcodemaster;

import com.zakcorp.linkedlists.singly.SinglyLLIntImpl;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_876_Test {
    Problem_876 p = new Problem_876();
    @Test
    public void test1() {
        SinglyLLIntImpl ll = new SinglyLLIntImpl();
        ll.add(1);ll.add(2);ll.add(3);ll.add(4);ll.add(5);
        assertEquals(ll.head.next.next, p.middleNode(ll.head));
    }
    @Test
    public void test2() {
        SinglyLLIntImpl ll = new SinglyLLIntImpl();
        ll.add(1);ll.add(2);ll.add(3);ll.add(4);ll.add(5);ll.add(6);
        assertEquals(ll.head.next.next.next, p.middleNode(ll.head));
    }
}

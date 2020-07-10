package com.zakcorp.books.karumachi.chapter_3;

import com.zakcorp.linkedlists.singly.SinglyLLIntImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_15_Test {
    Problem_15.Solver p = new Problem_15.Solver();
    @Test
    public void test1() {
        SinglyLLIntImpl sll = new SinglyLLIntImpl();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);
        sll.add(6);
        sll.add(7);
        sll.add(8);
        sll.add(9);
        sll.head.next.next.next.next.next.next.next.next.next = sll.head.next.next.next;
        assertEquals(6, p.solve(sll.head));
    }
}

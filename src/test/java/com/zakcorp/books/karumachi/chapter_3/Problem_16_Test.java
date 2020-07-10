package com.zakcorp.books.karumachi.chapter_3;

import com.zakcorp.linkedlists.singly.SinglyLLIntImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_16_Test {
    Problem_16.Solver p = new Problem_16.Solver();
    @Test
    public void test1() {
        SinglyLLIntImpl sll = new SinglyLLIntImpl();
        sll.add(10);
        sll.add(20);
        sll.add(30);
        sll.add(40);
        sll.add(50);
        SinglyLLIntImpl sll1 = new SinglyLLIntImpl();
        sll1.add(25);
//        assertEquals(sll.head, p.solve(sll.head, sll1.head));
        assertEquals(sll.head, p.solve1(sll.head, sll1.head));
    }
    @Test
    public void test2() {
        SinglyLLIntImpl sll = new SinglyLLIntImpl();
        sll.add(10);
        sll.add(20);
        sll.add(30);
        sll.add(40);
        sll.add(50);
        SinglyLLIntImpl sll1 = new SinglyLLIntImpl();
        sll1.add(5);
//        assertEquals(sll.head, p.solve(sll.head, sll1.head));
        assertEquals(sll.head, p.solve1(sll.head, sll1.head));
    }
}

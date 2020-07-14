package com.zakcorp.leetcodemaster;

import com.zakcorp.linkedlists.singly.SinglyLLIntImpl;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_160_Test {
    Problem_160.Solver p = new Problem_160.Solver();
    @Test
    public void test1() {
        SinglyLLIntImpl ll1 = new SinglyLLIntImpl();
        ll1.add(4);ll1.add(1);ll1.add(8);ll1.add(4);ll1.add(5);
        SinglyLLIntImpl ll2 = new SinglyLLIntImpl();
        ll2.add(5);ll2.add(6);ll2.add(1);ll2.add(8);ll2.add(4);ll2.add(5);
        ll2.head.next.next.next = ll1.head.next.next;
//        assertEquals(ll1.head.next.next, p.solve1(ll1.head, ll2.head));
        assertEquals(ll1.head.next.next, p.solve2(ll1.head, ll2.head));
    }

}

package com.zakcorp.final450.linkedlist;

import com.zakcorp.linkedlists.doubly.DoublyLLIntImpl_V2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P_147_Test {
    P_147.Solver p = new P_147.Solver();
    @Test
    public void test1() {
        DoublyLLIntImpl_V2 dll = new DoublyLLIntImpl_V2();
        dll.addLast(1);dll.addLast(2);dll.addLast(4);dll.addLast(5);dll.addLast(6);
        dll.addLast(8);dll.addLast(9);
        assertEquals(2, p.solve1(dll.head, 17) );
    }

    @Test
    public void test2() {
        DoublyLLIntImpl_V2 dll = new DoublyLLIntImpl_V2();
        dll.addLast(1);dll.addLast(2);dll.addLast(4);dll.addLast(5);dll.addLast(6);
        dll.addLast(8);dll.addLast(9);
        assertEquals(5, p.solve1(dll.head, 15) );
    }
}

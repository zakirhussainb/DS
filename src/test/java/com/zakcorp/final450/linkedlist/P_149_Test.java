package com.zakcorp.final450.linkedlist;

import com.zakcorp.linkedlists.doubly.DoublyLLIntImpl_V2;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_149_Test {
    P_149.Solver p = new P_149.Solver();
    @Test
    public void test1() {
        DoublyLLIntImpl_V2 dll = new DoublyLLIntImpl_V2();
        int N = 2;
        dll.addLast(10);dll.addLast(20);dll.addLast(30);dll.addLast(40);dll.addLast(50);
        System.out.println("Before Rotating....");
        dll.printList();
        System.out.println("After Rotating....by N == " + N);
        dll.printListCustom( p.solve1(dll.head, N) );
    }

    @Test
    public void test2() {
        DoublyLLIntImpl_V2 dll = new DoublyLLIntImpl_V2();
        int N = 3;
        dll.addLast(10);dll.addLast(20);dll.addLast(30);dll.addLast(40);dll.addLast(50);
        System.out.println("Before Rotating....");
        dll.printList();
        System.out.println("After Rotating....by N == " + N);
        dll.printListCustom( p.solve1(dll.head, N) );
    }
}

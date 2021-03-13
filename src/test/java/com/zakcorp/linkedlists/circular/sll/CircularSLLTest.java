package com.zakcorp.linkedlists.circular.sll;

import com.zakcorp.linkedlists.circular.CircularSLLImpl;
import com.zakcorp.linkedlists.singly.SLinkedList;
import org.junit.Test;

public class CircularSLLTest {
    @Test
    public void testInsertionInCSLL() {
        CircularSLLImpl csll = new CircularSLLImpl();
        csll.add(10);csll.add(20);csll.add(30);csll.add(40);
        csll.printList();
        csll.add(4, 50);
        csll.printList();
        csll.add(0, 5);
        csll.printList();
    }

    @Test
    public void testDeletionByPositionInCSLL() {
        CircularSLLImpl csll = new CircularSLLImpl();
        csll.add(10);csll.add(20);csll.add(30);
        csll.printList();
        csll.deleteByPos(1);
        csll.printList();
        csll.deleteByPos(3);
        csll.printList();
    }
}

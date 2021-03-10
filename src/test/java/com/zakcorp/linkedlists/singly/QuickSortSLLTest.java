package com.zakcorp.linkedlists.singly;

import org.junit.Test;

public class QuickSortSLLTest {
    QuickSortSLL.Solver p = new QuickSortSLL.Solver();
    @Test
    public void test1() {
        SLinkedList<Integer> sll = new SLinkedList<>();
        sll.add(40);sll.add(20);sll.add(60);sll.add(10);sll.add(50);sll.add(30);
        System.out.println("Before Sorting....");
        sll.printCustom(sll.head);
        System.out.println("\nAfter Sorting....");
        sll.printCustom( p.solve1(sll.head) );
    }

    @Test
    public void test2() {
        SLinkedList<Integer> sll = new SLinkedList<>();
        sll.add(10);sll.add(20);sll.add(30);sll.add(40);sll.add(50);sll.add(60);
        System.out.println("Before Sorting....");
        sll.printCustom(sll.head);
        System.out.println("\nAfter Sorting....");
        sll.printCustom( p.solve1(sll.head) );
    }

}

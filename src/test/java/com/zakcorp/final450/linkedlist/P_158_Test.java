package com.zakcorp.final450.linkedlist;

import com.zakcorp.linkedlists.singly.SLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_158_Test {
    P_158.Solver p = new P_158.Solver();
    @Test
    public void test1() {
        SLinkedList<Integer> sll = new SLinkedList<>();
        sll.add(10);sll.add(20);sll.add(30);sll.add(40);sll.add(50);sll.add(60);
        sll.printCustom(sll.head);
        System.out.println();
        sll.printCustom(p.solve1(sll.head));
    }
}

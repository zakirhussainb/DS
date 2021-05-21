package com.zakcorp.final450.linkedlist;

import org.junit.Test;
import static org.junit.Assert.*;

public class P_127_Test {
    P_127.Solver p = new P_127.Solver();
    @Test
    public void test1() {
        P_127.Node head = new P_127.Node(10);
        head.next = new P_127.Node(20);
        head.next.next = new P_127.Node(30);
        head.next.next.next = new P_127.Node(40);
        head.next.next.next.next = new P_127.Node(50);
        head.next.next.next.next.next = new P_127.Node(60);
        p.printList( head, "Input is" );
        p.printList( p.solve1(head, 2), "Output is" );
    }
}

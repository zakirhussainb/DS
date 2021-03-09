package com.zakcorp.final450.linkedlist;

import com.zakcorp.final450.array.P_1;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class P_126_Test {
    P_126.Solver p = new P_126.Solver();
    P_126.SinglyLinkedList sll = new P_126.SinglyLinkedList();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{15, 11, 7, 2}, p.solve1(new int[]{2, 7, 11, 15}));
    }
}

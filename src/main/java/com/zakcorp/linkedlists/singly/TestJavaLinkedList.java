package com.zakcorp.linkedlists.singly;

import java.util.LinkedList;

public class TestJavaLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(4, 35);
//        linkedList.clear();
        System.out.println(linkedList.toString());
        System.out.println(linkedList.get(5));
        System.out.println(linkedList.toString());
    }
}

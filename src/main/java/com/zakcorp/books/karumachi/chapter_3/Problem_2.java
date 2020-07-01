package com.zakcorp.books.karumachi.chapter_3;

import com.zakcorp.linkedlists.singly.SLinkedList;

public class Problem_2 {
    static int counter = 0;
    public static void main(String[] args) {
        Problem_2 p = new Problem_2();
        SLinkedList<Integer> sLinkedList = new SLinkedList<>();
        sLinkedList.addLast(10);
        sLinkedList.addLast(20);
        sLinkedList.addLast(30);
        sLinkedList.addLast(40);
        sLinkedList.addLast(50);
        sLinkedList.addLast(60);
        sLinkedList.addLast(70);
        int n = 3;
        System.out.println(p.findNthNodeFromLast(sLinkedList.head, n));
    }
    private int findNthNodeFromLast(SLinkedList.Node<Integer> head, int n) {
//        int[] counter = {0};
        Solver p = new Solver();
//        return p.solve1(head, n);
//        return p.solve2(head, n);
        p.solve3(head, n);
        return 0;
    }
    static class Solver {
        public int solve1(SLinkedList.Node<Integer> head, int n) {
            if(head == null) {
                return -1;
            }
            int size = 0;
            SLinkedList.Node<Integer> p = head;
            while(p != null) {
                size++;
                p = p.next;
            }
            p = head;
            int pos = size - n;
            for(int i = 0; i < pos; i++) {
                p = p.next;
            }
            return p.element;
        }
        public int solve2(SLinkedList.Node<Integer> head, int n) {
            if(head == null) {
                return -1;
            }
            SLinkedList.Node<Integer> pNthStart = head;
            SLinkedList.Node<Integer> pNthLast = null;
            for(int i = 1; i < n; i++) {
                if(pNthStart != null)
                    pNthStart = pNthStart.next;
            }
            while(pNthStart != null) {
                if(pNthLast == null) {
                    pNthLast = head;
                } else {
                    pNthLast = pNthLast.next;
                }
                pNthStart = pNthStart.next;
            }
            return pNthLast != null ? pNthLast.element : -1;
        }
        public void solve3(SLinkedList.Node<Integer> head, int n) {
            if(head == null) {
                return;
            }
            solve3(head.next,n);
            if(n == ++counter) {
                System.out.println(head.element);
            }
        }
    }
}

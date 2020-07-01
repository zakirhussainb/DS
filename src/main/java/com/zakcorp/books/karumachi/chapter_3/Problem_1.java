package com.zakcorp.books.karumachi.chapter_3;

public class Problem_1 {
    static class Stack_LL {
        private Node top;
        private int size = 0;
        public Stack_LL() {

        }
        private static class Node {
            int data;
            Node next;
            public Node(int data) {
                this.data = data;
                next = null;
            }
        }
        public void push(int data) {
            Node t = new Node(data);
            t.next = top;
            top = t;
            size++;
        }
        public int pop() {
            if(isEmpty()) {
                return -1;
            }
            int data = top.data;
            top = top.next;
            size--;
            return data;
        }
        public int peek() {
            if(isEmpty()) {
                return -1;
            }
            return top.data;
        }
        public boolean isEmpty() {
            return top == null;
        }
        public int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        Problem_1.Stack_LL ps = new Problem_1.Stack_LL();
        for(int i = 0; i < Integer.MAX_VALUE; i++){
            ps.push(i);
        }
//        ps.push(10);
//        ps.push(20);
//        ps.push(30);
//        System.out.println(ps.size());
//        ps.pop();
//        System.out.println(ps.size());
//        System.out.println(ps.peek());
//        ps.pop();
//        ps.pop();
//        System.out.println(ps.isEmpty());

    }
}

package com.zakcorp.linkedlists.doubly;

import java.util.NoSuchElementException;

public class DoublyLLIntImpl {
    Node head;
    Node tail;
    static class Node{
        Node prev;
        int data;
        Node next;
        Node(int data){
            this.data = data;
            prev = null;
            next = null;
        }
    }

    public void add(int data){
        addLast(data);
    }

    public void addFirst(int data){
        if(head == null){
            head = new Node(data);
            tail = head;
            return;
        }
        Node t = new Node(data);
        t.next = head;
        head = t;
    }

    private void addLast(int data){
        if(head == null){
            head = new Node(data);
            tail = head;
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        Node t = new Node(data);
        last.next = t;
        t.prev = last;
        tail = t;
    }

    public int removeFirst(){
        if(head == null)
            throw new NoSuchElementException();
        Node first = head;
        head = head.next;
        return first.data;
    }

    public int removeLast(){
        int result;
        if(head == null)
            throw new NoSuchElementException();
        Node curr = head;
        Node prev = null;
        while(curr.next != null){
            prev = curr;
            curr = curr.next;
        }
        result = curr.data;
        if(prev != null){
            prev.next = null;
            curr.prev = null;
            tail = prev;
        } else {
            head = head.next;
            tail = head;
        }
        return result;
    }

    public int removeByPos(int pos){
        if(head == null)
            throw new NoSuchElementException();
        // 0-based indexing
        int result;
        Node curr = head;
        Node prev = null;
        for(int i = 0; i < pos; i++){
            prev = curr;
            curr = curr.next;
        }
        result = curr.data;
        if(prev == null){
            result = removeFirst();
            return result;
        }
        prev.next = curr.next;
        curr.next.prev = curr.prev;
        return result;
    }

    public void removeByElement(int x){
        if(head == null)
            throw new NoSuchElementException();
        Node curr = head;
        Node prev = null;
        while(curr != null){
            if(curr.data == x){
                if(prev == null){
                    removeFirst();
                    break;
                }
                if(curr.next == null){
                    prev.next = null;
                    tail = prev;
                } else {
                    prev.next = curr.next;
                    curr.next.prev = curr.prev;
                }
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
    }

    public void printListCustom(Node head){
        if(head == null){
            System.out.println("Doubly Linked List is empty....");
            return;
        }
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + "<-->");
            curr = curr.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

}

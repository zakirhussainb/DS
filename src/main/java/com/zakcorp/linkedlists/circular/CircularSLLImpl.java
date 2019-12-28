package com.zakcorp.linkedlists.circular;

public class CircularSLLImpl {
    Node head;
    Node tail;
    class Node{
        Node next = null;
        int data;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void add(int data){
        addLast(data);
    }

    public void add(int index, int data){
        addAtIndex(index, data);
    }

    private void addAtIndex(int index, int data){
        if(index == 0){
            addLast(data);
        } else {
            Node t = new Node(data);
            Node curr = head;
            for(int i = 0; i < index - 1; i++){
                curr = curr.next;
            }
            t.next = curr.next;
            curr.next = t;
        }
    }

    private void addLast(int data){
        Node t = new Node(data);
        if(head == null){
            head = t;
        } else {
            tail.next = t;
        }
        tail = t;
        t.next = head;
    }

    public void removeByElement(int x){
        if(head == null)
            return;
        Node curr = this.head;
        Node prev = null;
        do{
            if(curr.data == x){
                if(prev == null){
                    Node last = tail;
                    head = curr.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
            }
            prev = curr;
            curr = curr.next;
        }while(curr != this.head);
    }

    public void printListCustom(Node p){
        if(p == null){
            System.out.println("Circular Singly LinkedList is Empty!!!!!!");
        } else {
            do{
                System.out.print(p.data + "->");
                p = p.next;
            }while (this.head != p);
        }
        System.out.print("head");
        System.out.println();
    }
}

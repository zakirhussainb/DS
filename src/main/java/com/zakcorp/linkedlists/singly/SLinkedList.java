package com.zakcorp.linkedlists.singly;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class SLinkedList<E> {
	private static int size = 0;
	Node<E> head;
	public SLinkedList(){}
	public SLinkedList(Node<E> head){
		this.head = head;
	}
    static class Node<E> {
        E element;
        Node<E> next;
        public Node(E element) {
            this.element = element;
            next = null;
        }
    }

    void add(E element){
    	addLast(element);
    	size++;
    }
    public void addLast(E element){
		if(head == null){
    		head = new Node<>(element);
    		return;
    	}
    	Node<E> p = head;
    	while(p.next != null){
    		p = p.next;
    	}
    	Node<E> t = new Node<>(element);
    	t.next = null;
    	p.next = t;
    }

    public void add(int index, E element) {
    	checkPositionIndex(index);
		if (head == null) {
			head = new Node<>(element);
			return;
		}
		Node<E> t = new Node<>(element);
		if(index == 0){
			t.next = head;
			head = t;
			return;
		}
		Node<E> p = head;
		for(int i = 0; i < index - 1; i++){
			p = p.next;
		}
		t.next = p.next;
		p.next = t;
		size++;
	}

	public void addFirst(E element){
    	size++;
    	if(head == null){
    		head = new Node<>(element);
    		return;
		}
    	Node<E> t = new Node<>(element);
    	t.next = head;
    	head = t;
	}

	public void clear(){
    	head = null;
    	size = 0;
	}

	public SLinkedList<E> cloneLL(){
		Node<E> p = head;
		Node<E> q = null;
		Map<Node<E>, Node<E>> hashMap = new HashMap<>();
		while(p != null){
			q = new Node<>(p.element);
			hashMap.put(p, q);
			p = p.next;
		}
		p = head;
		while(p != null){
			q = hashMap.get(p);
			q.next = hashMap.get(p.next);
			p = p.next;
		}
    	return new SLinkedList<>(hashMap.get(head));
	}

	public boolean contains(Object o) {
		Node p = head;
		while(p != null){
			if(p.element == o){
				return true;
			}
			p = p.next;
		}
		return false;
	}
	public E element() {
		return getFirst();
	}
	public E getFirst() {
		final Node<E> p = head;
		if(p == null)
			throw new NoSuchElementException();
		return p.element;
	}
	public E get(int index) {
		checkElementIndex(index);
		Node<E> p = head;
		for(int i = 0; i < index; i++) {
			p = p.next;
		}
		return p.element;
	}
	public E getLast() {
		Node<E> p = head;
		while(p.next != null) {
			p = p.next;
		}
		return p.element;
	}
    public void print(){
    	if(head == null){
    		System.out.println("List is empty...Size: " + size);
    		return;
    	}
    	Node<E> p = head;
    	while(p != null){
    		System.out.print(p.element + "->");
    		p = p.next;
    	}
    	System.out.print("NULL");
    	System.out.println("\tSize of SLL: " + size);
    }
	public int indexOf(Object o){
		Node<E> p = head;
		int index = 0;
		while(p != null) {
			if(p.element == o){
				return index;
			}
			p = p.next;
			index++;
		}
		return -1;
	}

	/*public int lastIndexOf(Object o) {
		int index = 0;
		Node<E> p = head;
		while(p.next != null) {
			p = p.next;
		}
		System.out.println("last element..." + p.element);
		Node<E> last = p;
		for(Node<E> x = last; x != null; x = x.next){
			if(x.element == o){
				return index;
			}
			index++;
		}
		return -1;
	}*/

	public void offer(E element) {
		add(element);
	}

	public void offerFirst(E element) {
		addFirst(element);
	}

	public void offerLast(E element) {
		addLast(element);
	}

	public E peek() {
		return getFirst();
	}

	public E peekFirst() {
		return getFirst();
	}

	public E peekLast() {
		return getLast();
	}

	/* All deletion/remove logic in the linkedList */

	public E remove(int index){
		Node<E> p = head;
		for(int i = 0; i < index - 1; i++){
			p = p.next;
		}
		E data = p.next.element;
		p.next = p.next.next;
		size--;
		return data;
	}

	public boolean removeByElement(Object o) {
		Node<E> p = head;
		Node<E> prev = null;
		if(p != null && p.element == o){
			head = p.next;
			return true;
		}
		while(p != null && p.element != o){
			prev = p;
			p = p.next;
		}
		if(p == null)
			return false;
		prev.next = p.next;
		size--;
		return true;
	}
	public E remove() {
		return removeFirst();
	}
	public E removeFirst() {
		Node<E> p = head;
		head = head.next;
		size--;
		return p.element;
	}

	public boolean removeFirstOccurrence(Object o) {
		return removeByElement(o);
	}

	public E removeLast() {
		if(head == null){
			return null;
		}
		if(head.next == null){
			return null;
		}
		Node<E> p = head;
		while(p.next.next != null){
			p = p.next;
		}
		E data = p.next.element;
		p.next = null;
		size--;
		return data;
	}
	public E poll() {
		return remove();
	}

	public E pollFirst() {
		return removeFirst();
	}

	public E pop(){
		return removeFirst();
	}

    public void printCustom(Node p){
    	if(p == null){
			System.out.println("List is empty...Size: " + size);
			return;
		}
    	while(p != null){
			System.out.print(p.element + "->");
			p = p.next;
		}
    	System.out.print("NULL");
	}

    public void checkPositionIndex(int index) {
    	if(!isPositionIndex(index)){
    		throw new IndexOutOfBoundsException("Index: " + index + ", Size: " +size);
		}
	}

	public void checkElementIndex(int index) {
		if(!isElementIndex(index)) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
	}

	public boolean isElementIndex(int index){
		return index >= 0 && index < size;
	}

	public boolean isPositionIndex(int index){
    	return index >=0 && index <= size;
	}

	/*Other utility Functions*/

}

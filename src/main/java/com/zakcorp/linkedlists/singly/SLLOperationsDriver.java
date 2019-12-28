package com.zakcorp.linkedlists.singly;


public class SLLOperationsDriver {
	public static void main(String[] args) {
		SLLOperationsDriver p = new SLLOperationsDriver();
		SLinkedList<Integer> linkedList = new SLinkedList<>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
//		linkedList.add(55);
//		linkedList.add(3, 35);
//		linkedList.addFirst(55);
//		linkedList.print();
//		linkedList.clear();
//		linkedList.print();
		System.out.println(linkedList.contains(35));
		linkedList.print();
		System.out.println("First element is: " + linkedList.element());
		linkedList.print();
		System.out.println("First element is: " + linkedList.getFirst());
		linkedList.print();
		System.out.println("Element is: " + linkedList.get(4));
		linkedList.print();
		System.out.println("Last element is: " + linkedList.getLast());
		linkedList.print();
		System.out.println("Element is found at index: " + linkedList.indexOf(55));
//		linkedList.print();

		/* All deletion/remove logic - implementation in the linkedList */
		/*System.out.println("Removed element at Index: " + linkedList.remove());
		System.out.println("Removed element at Index: " + linkedList.remove(4));
		linkedList.print();
		System.out.println("Removed first Node: " + linkedList.removeFirst());
		linkedList.print();
		System.out.println("Remove element: " + linkedList.removeByElement(30));
		linkedList.print();
		System.out.println("Remove first occurence: " + linkedList.removeFirstOccurrence(20));
		linkedList.print();
		System.out.println("Remove Last: " + linkedList.removeLast());
		linkedList.print();
		System.out.println("Remove Last: " + linkedList.removeLast());
		linkedList.print();
		System.out.println("Remove Last: " + linkedList.removeLast());
		linkedList.print();*/
		/*SLinkedList ll = linkedList.cloneLL();
		System.out.println("cloned...");
		ll.print();*/
		SLinkedList<Integer> ll2 = p.insertInSorted(linkedList, 5);
		ll2.print();





	}




	/* Utility methods */
	public SLinkedList<Integer> insertInSorted(SLinkedList<Integer> linkedList, int data){
		SLinkedList.Node<Integer> t = new SLinkedList.Node<>(data);
		SLinkedList.Node<Integer> p = linkedList.head;
		if(p == null || p.element >= data){
			t.next = p;
			p = t;
		}
		while(p.next != null && p.next.element < data) {
			p = p.next;
		}
		t.next = p.next;
		p.next = t;
		return linkedList;
	}

}
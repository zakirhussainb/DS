package com.zakcorp.linkedlists.singly;

public class SLLOperationsDriver {
	public static void main(String[] args) {
		SLinkedList<Integer> linkedList = new SLinkedList<>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(20);
		linkedList.add(55);
		linkedList.add(3, 35);
		linkedList.addFirst(55);
		linkedList.print();
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
		linkedList.print();

		/* All deletion/remove logic - implementation in the linkedList */
		/*System.out.println("Removed element at Index: " + linkedList.remove());
		System.out.println("Removed element at Index: " + linkedList.remove(4));
		linkedList.print();
		System.out.println("Removed first Node: " + linkedList.removeFirst());
		linkedList.print();
		System.out.println("Remove element: " + linkedList.removeByElement(30));
		linkedList.print();
		System.out.println("Remove first occurence: " + linkedList.removeFirstOccurrence(20));
		linkedList.print();*/
		System.out.println("Remove Last: " + linkedList.removeLast());
		linkedList.print();
		System.out.println("Remove Last: " + linkedList.removeLast());
		linkedList.print();
		System.out.println("Remove Last: " + linkedList.removeLast());
		linkedList.print();


	}

}
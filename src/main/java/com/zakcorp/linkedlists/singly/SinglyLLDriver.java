package com.zakcorp.linkedlists.singly;


import java.util.HashSet;

public class SinglyLLDriver {
	public static void main(String[] args) {
		SinglyLLProblemsGFG gfg = new SinglyLLProblemsGFG();
		SinglyLLProblemsLC lc = new SinglyLLProblemsLC();
		SinglyLLIntImpl sll = new SinglyLLIntImpl();

		/* GFG Problems */
		/*
		sll.add(5);
		sll.add(20);
		sll.add(4);
		sll.add(3);
		sll.add(30);
        sll.add(49);
        sll.add(53);
        sll.add(53);
        sll.printListCustom(sll.head);

        SinglyLLIntImpl.Node head = gfg.makeMiddlePointToHead(sll.head);
		sll.printListCustom(head);

        SinglyLLIntImpl.Node head1 = gfg.rotateLLBlockWise(sll.head, 3, 1);
        sll.printListCustom(head1);

		SinglyLLIntImpl.Node head = gfg.rotateLinkedList(sll.head, 3);
        sll.printListCustom(head);

		SinglyLLIntImpl.Node head = sortZeroOneTwo(sll.head);
        sll.printListCustom(head);
		SinglyLLIntImpl sllCp1 = new SinglyLLIntImpl();
        sllCp1.add(4);
        sllCp1.add(3);
        sllCp1.add(5);
        sllCp1.add(7);
        sllCp1.add(11);
        sllCp1.add(2);
        sllCp1.add(1);
		SinglyLLIntImpl sllCp2 = new SinglyLLIntImpl();
        sllCp2.add(2);
        sllCp2.add(3);
        sllCp2.add(4);
        sllCp2.add(5);
        sllCp2.add(6);
        sllCp2.add(8);
        sllCp2.add(12);
        int x = 9;
        int pairCount = gfg.countPairsSumEqual(sllCp1.head, sllCp2.head, x);
        System.out.println("Number of Pairs from two linked lists whose sum is equal to...." + pairCount);

		SinglyLLIntImpl.Node head = gfg.removeEveryKthNode(sll.head, 4);
        sll.printListCustom(head);

		SinglyLLIntImpl.Node head = gfg.removeAllDuplicatesFromSortedList(sll.head);
        sll.printListCustom(head);

		SinglyLLIntImpl.Node head = gfg.moveAllOccurrencesToEnd(sll.head, 2);
        sll.printListCustom(head);

		System.out.println(gfg.findPairForGivenSum_70(sll.head, 17).toString());

        SinglyLLIntImpl.Node head = gfg.partitionLL_71(sll.head, 3);
        sll.printListCustom(head);

		*//* Check linked list with a loop is palindrome or not *//*
        SinglyLLIntImpl.Node head = new SinglyLLIntImpl.Node(1);
        head.next = new SinglyLLIntImpl.Node(2);
        head.next.next = new SinglyLLIntImpl.Node(3);
        head.next.next.next = new SinglyLLIntImpl.Node(2);
        head.next.next.next.next = new SinglyLLIntImpl.Node(1);

//        Creating a loop for testing purpose
        head.next.next.next.next = head.next;

        if(gfg.isPalindrome_72(head)){
            System.out.println("Paindrome");
        } else {
            System.out.println("Not a palindrome");
        }

		SinglyLLIntImpl.Node head = gfg.problem_59_1(sll.head);
        sll.printNextArbitPointers(head);

		SinglyLLIntImpl.Node head = gfg.problem_59_2(sll.head);
        sll.printNextArbitPointers(head);


		SinglyLLIntImpl.Node head = gfg.problem_58(sll.head);
        sll.printListCustom(head);

		int result = gfg.problem_54(sll.head);
		System.out.println("Randomly selected Key is..." + result);

		int k = 3;
		SinglyLLIntImpl.Node head = gfg.rotateLinkedList(sll.head, k);
        sll.printListCustom(head);

		SinglyLLIntImpl.Node head = gfg.segregateZeroOneTwo(sll.head);
        sll.printListCustom(head);

        int[] arr = {1,2,2,1,2,0,2,2};
        int[] result = gfg.segregateZeroOneTwo(arr);
        System.out.println(Arrays.toString(result));

		SinglyLLIntImpl.Node head = gfg.swapKthNodeFromBothEnds(sll.head, 3);
		sll.printListCustom(head);*/

		/* LeetCode Problems*/
		SinglyLLIntImpl.Node head = lc.problem_92(sll.head, 2, 4);
		sll.printListCustom(head);

	}


}
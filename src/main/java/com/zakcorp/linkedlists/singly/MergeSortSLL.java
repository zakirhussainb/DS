package com.zakcorp.linkedlists.singly;

public class MergeSortSLL {
    static class Solver {
        public SLinkedList.Node<Integer> solve1(SLinkedList.Node<Integer> head) {
            return mergeSortSLLRec(head);
        }
        private SLinkedList.Node<Integer> mergeSortSLLRec(SLinkedList.Node<Integer> head) {
            if(head == null || head.next == null) {
                return head;
            }
            // Get the middle of the list
            SLinkedList.Node<Integer> mid = getMiddle(head);
            SLinkedList.Node<Integer> nextOfMiddle = mid.next;
            // set the next of the middle node to null;
            mid.next = null;

            SLinkedList.Node<Integer> left = mergeSortSLLRec(head);
            SLinkedList.Node<Integer> right = mergeSortSLLRec(nextOfMiddle);
            return merge(left, right);
        }
        private SLinkedList.Node<Integer> merge(SLinkedList.Node<Integer> left, SLinkedList.Node<Integer> right) {
            if(left == null)
                return right;
            if(right == null)
                return left;

            SLinkedList.Node<Integer> result;
            if(left.element <= right.element) {
                result = left;
                result.next = merge(left.next, right);
            } else {
                result = right;
                result.next = merge(left, right.next);
            }
            return result;
        }
        private SLinkedList.Node<Integer> getMiddle(SLinkedList.Node<Integer> head) {
            SLinkedList.Node<Integer> slow = head;
            SLinkedList.Node<Integer> fast = head.next;
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }
}

package com.zakcorp.linkedlists.singly;

public class QuickSortSLL {
    static class Solver {
        public SLinkedList.Node<Integer> solve1(SLinkedList.Node<Integer> head) {
            SLinkedList.Node<Integer> end = head;
            while(end.next != null) {
                end = end.next;
            }
            quickSortSLLRec(head, end);
            return head;
        }
        private void quickSortSLLRec(SLinkedList.Node<Integer> start, SLinkedList.Node<Integer> end) {
            if(start == null || start == end || start == end.next) {
                return;
            }
            SLinkedList.Node<Integer> pIndex = partition(start, end);
            quickSortSLLRec(start, pIndex);

            if(pIndex != null && pIndex == start)
                quickSortSLLRec(pIndex.next, end);
            else if(pIndex != null && pIndex.next != null)
                quickSortSLLRec(pIndex.next.next, end);
        }
        private SLinkedList.Node<Integer> partition(SLinkedList.Node<Integer> start, SLinkedList.Node<Integer> end) {
            if(start == end || start == null || end == null) {
                return start;
            }
            int pivot = end.element;
            SLinkedList.Node<Integer> pIndex = start;
            SLinkedList.Node<Integer> curr = start;
            while(start != end) {
                if(start.element < pivot) {
                    // swapping the curr node's data with the start node's data.
                    swap(curr, start);

                    pIndex = curr;
                    curr = curr.next;
                }
                start = start.next;
            }

            // swapping the curr node's data with the end node's data.
            swap(curr, end);

            return pIndex;
        }

        private void swap(SLinkedList.Node<Integer> x, SLinkedList.Node<Integer> y) {
           int temp = x.element;
           x.element = y.element;
           y.element = temp;
        }
    }
}

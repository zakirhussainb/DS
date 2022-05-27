package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_138 {
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    static class Solver {
        private Map<Node, Node> visitedMap = new HashMap<>();
        public Node getVisitedInfo(Node node) {
            if(node != null) {
                if(!visitedMap.containsKey(node)) {
                    visitedMap.put(node, new Node(node.val));
                }
                return visitedMap.get(node);
            }
            return null;
        }
        public Node solve1(Node head) {
            if(head == null)
                return null;

            Node oldNode = head;
            Node newNode = new Node(oldNode.val);
            visitedMap.put(oldNode, newNode);

            while(oldNode != null) {
                newNode.random = getVisitedInfo(oldNode.random);
                newNode.next = getVisitedInfo(oldNode.next);

                oldNode = oldNode.next;
                newNode = newNode.next;
            }
            return visitedMap.get(head);
        }
        public void printList(Node head) {
            Node curr = head;
            while(curr != null) {
                System.out.print(curr.val + "->");
                if(curr.random != null)
                    System.out.print(curr.random.val + "->");
                curr = curr.next;
            }
        }
    }
}

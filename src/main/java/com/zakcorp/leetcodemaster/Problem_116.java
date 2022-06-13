package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.Node;

import java.util.*;

public class Problem_116 {
    static class Solver {
        /*
        The idea is similar to the level order traversal of a Binary Tree.
        The only diff is that,
            1. when you poll a node -> you need to make its next point to queue's top element;
            2. But till when -> till i < size - 1
            3. Otherwise, the next pointer will point to other elements in the queue, which doesn't
            belong to the same level.
         */
        public Node solve1(Node root) {
            if(root == null)
                return null;
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()) {
                int size = queue.size();
                for(int i = 0; i < size; i++) {
                    Node curr = queue.poll();
                    if(i < size - 1) {
                        curr.next = queue.peek();
                    }
                    if(curr.left != null)
                        queue.add(curr.left);
                    if(curr.right != null)
                        queue.add(curr.right);
                }
            }
            return root;
        }
        /*
        BFS without Queue
            1. Take leftmost pointer as the head for every level
            2. Then traverse the entire level with a head/curr pointer
            3. Make necessary changes while traversing
         */
        public Node solve2(Node root) {
            if(root == null)
                return null;
            Node leftmost = root;
            while(leftmost.left != null) {
                Node head = leftmost;
                while(head != null) {
                    head.left.next = head.right;
                    if(head.next != null)
                        head.right.next = head.next.left;
                    head = head.next;
                }
                leftmost = leftmost.left;
            }
            return root;
        }
    }
}

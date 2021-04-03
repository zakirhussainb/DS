package com.zakcorp.final450.binarytree;


import com.zakcorp.trees.binarytree.BinaryTree;

public class P_179 {
    static class Solver {
        public BinaryTree.Node solve1(BinaryTree.Node root) {
            BinaryTree.Node head = null;
            // Convert the above BT into DLL
            head = convert(root, head);
            // Reverse the DLL
            head = reverse(head);

            return head;
        }

        private BinaryTree.Node convert(BinaryTree.Node root, BinaryTree.Node head) {
            // base case: tree is empty
            if(root == null)
                return head;

            // recursively convert the left subtree first
            head = convert(root.left, head);

            // store right child
            BinaryTree.Node right = root.right;

            // insert the current node at the beginning of a DLL
            root.right = head;
            if(head != null) {
                head.left = root;
            }
            head = root;
            return convert(right, head);
        }

        private BinaryTree.Node reverse(BinaryTree.Node head) {
            if(head == null)
                return null;
            BinaryTree.Node prev = null;
            BinaryTree.Node curr = head;
            while(curr != null) {
                BinaryTree.Node temp = curr.left;
                curr.left = curr.right;
                curr.right = temp;

                prev = curr;
                curr = curr.left;
            }
            return prev;
        }

        public void printDLL(BinaryTree.Node root) {
            BinaryTree.Node curr = root;
            while(curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.right;
            }
        }
    }
}

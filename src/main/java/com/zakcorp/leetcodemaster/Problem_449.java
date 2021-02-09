package com.zakcorp.leetcodemaster;

import java.io.*;
import java.util.*;

public class Problem_449 implements Serializable {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /* This Solver provides solution for serialization and deserialization of a BST by using pre-order and
    by using a Queue with a linkedList impl where you can access the "FIRST" element from the queue/linkedList */
    static class Solver {
        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null)
                return "";
            StringBuilder sb = new StringBuilder();
            preorder(root, sb);
            return sb.toString();
        }

        private void preorder(TreeNode root, StringBuilder sb) {
            if (root == null)
                return;
            sb.append(root.val);
            sb.append(",");
            preorder(root.left, sb);
            preorder(root.right, sb);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data.isEmpty())
                return null;
            Queue<Integer> queue = new LinkedList<>();
            for (String s : data.split(",")) {
                queue.add(Integer.parseInt(s));
            }
            return preorder(Integer.MIN_VALUE, Integer.MAX_VALUE, queue);
        }

        private TreeNode preorder(int lowerLimit, int upperLimit, Queue<Integer> queue) {
            if (queue.isEmpty())
                return null;

            int val = queue.peek(); // gets the first element from the queue/linkedList
            if (val < lowerLimit || val > upperLimit)
                return null;

            queue.poll(); // removes the first element from the queue/linkedList

            TreeNode root = new TreeNode(val);
            root.left = preorder(lowerLimit, val, queue);
            root.right = preorder(val, upperLimit, queue);
            return root;
        }
    }

    /* This Solver provides solution for serialization(using post-order) and deserialization(using pre-order) of a BST
    by using a ArrayDequeue with a linkedList impl where you can access the "LAST" element from the arraydeque/linkedList */
    static class Solver1 {
        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null)
                return "";
            StringBuilder sb = new StringBuilder();
            postorder(root, sb);
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }

        private void postorder(TreeNode root, StringBuilder sb) {
            if (root == null)
                return;
            postorder(root.left, sb);
            postorder(root.right, sb);
            sb.append(root.val);
            sb.append(",");
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data.isEmpty())
                return null;
            Deque<Integer> deque = new ArrayDeque<>();
            for (String s : data.split(",")) {
                deque.add(Integer.parseInt(s));
            }
            return preorder(Integer.MIN_VALUE, Integer.MAX_VALUE, deque);
        }

        private TreeNode preorder(int lowerLimit, int upperLimit, Deque<Integer> deque) {
            if (deque.isEmpty())
                return null;

            int val = deque.getLast(); // gets the first element from the queue/linkedList
            if (val < lowerLimit || val > upperLimit)
                return null;

            deque.removeLast(); // removes the first element from the queue/linkedList

            TreeNode root = new TreeNode(val);
            root.right = preorder(val, upperLimit, deque);
            root.left = preorder(lowerLimit, val, deque);
            return root;
        }
    }
}

package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;

import java.util.*;

public class P_190 {
    /* Lowest Common Ancestor in a Binary Tree - Naive Solution */
    static class Solver {
        public BinaryTree.Node solve1(BinaryTree.Node root, int n1, int n2) {
            Map<BinaryTree.Node, BinaryTree.Node> parentMap = new HashMap<>();
            BinaryTree.Node[] nodes = constructMap(root, parentMap, n1, n2);
            BinaryTree.Node p = nodes[0]; BinaryTree.Node q = nodes[1];
            /* Build an ancestor-set, where we store all the ancestors of p
               and if any of the ancestor of p is present in q, then the resulting q
               is the lca */
            Set<BinaryTree.Node> ancestorSet = new HashSet<>();
            while(p != null) {
                ancestorSet.add(p);
                p = parentMap.get(p);
            }
            while( !ancestorSet.contains(q) ) {
                q = parentMap.get(q);
            }
            return q;
        }
        private BinaryTree.Node[] constructMap(BinaryTree.Node root, Map<BinaryTree.Node, BinaryTree.Node> parentMap, int n1, int n2) {
            BinaryTree.Node[] nodes = new BinaryTree.Node[2];
            Queue<BinaryTree.Node> queue = new LinkedList<>();
            queue.add(root);
            parentMap.put(root, null);
            while( !queue.isEmpty() ) {
                BinaryTree.Node curr = queue.poll();
                if(curr.data == n1)
                    nodes[0] = curr;
                else if(curr.data == n2)
                    nodes[1] = curr;
                if(curr.left != null) {
                    parentMap.put(curr.left, curr);
                    queue.add(curr.left);
                }
                if(curr.right != null) {
                    parentMap.put(curr.right, curr);
                    queue.add(curr.right);
                }
            }
            return nodes;
        }
    }
}

package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;

public class P_193 {
    /* Find distance between 2 nodes in a Binary tree
    Step 1: Find the Lowest Common Ancestor of this 2 nodes.
    Step 2: Find the distance d1, of the node n1, from the LCA obtained above.
    Step 3: Find the distance d2, of the node n2, from the LCA obtained above.
    Step 4: return the sum of these two distances.
       */
    static class Solver {
        public int solve1(BinaryTree.Node root, int n1, int n2) {
            BinaryTree.Node lca = lca(root, n1, n2);
            int d1 = findLevel(lca, n1, 0);
            int d2 = findLevel(lca, n2, 0);
            return d1 + d2;
        }
        private int findLevel(BinaryTree.Node root, int node, int level) {
            if(root == null)
                return -1;
            if(root.data == node)
                return level;
            int left = findLevel(root.left, node, level + 1);
            if(left == -1)
                return findLevel(root.right, node, level + 1);
            return left;
        }
        private BinaryTree.Node lca(BinaryTree.Node root, int n1, int n2) {
            if(root == null || root.data == n1 || root.data == n2)
                return root;
            BinaryTree.Node left = lca(root.left, n1, n2);
            BinaryTree.Node right = lca(root.right, n1, n2);
            if(left != null && right != null)
                return root;
            return left == null ? right : left;
        }
    }
}

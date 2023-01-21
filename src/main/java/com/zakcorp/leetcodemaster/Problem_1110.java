package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import java.util.*;

public class Problem_1110
{
    static class Solver {
        Set<Integer> toDeleteSet;
        List<TreeNode> res;
        public List<TreeNode> delNodes( TreeNode root, int[] to_delete) {
            toDeleteSet = new HashSet<>();
            res = new ArrayList<>();
            for(int d : to_delete)
                toDeleteSet.add( d );
            helper(root, true);
            return res;
        }
        private TreeNode helper(TreeNode currNode, boolean isRoot) {
            if(currNode == null)
                return null;
            boolean toDelete = toDeleteSet.contains( currNode.val );
            if(isRoot && !toDelete)
                res.add( currNode );
            currNode.left = helper( currNode.left, toDelete );
            currNode.right = helper( currNode.right, toDelete );
            return toDelete ? null : currNode;
        }
    }

    /**
     * Solving thr problem using Breadth First Search
     */
    static class Solver1 {
        public List<TreeNode> delNodes( TreeNode root, int[] to_delete) {
            if(root == null)
                return new ArrayList<>();
            Set<Integer> toDeleteSet = new HashSet<>();
            for(int d : to_delete)
                toDeleteSet.add( d );
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add( root );
            List<TreeNode> res = new ArrayList<>();
            res.add( root );
            while ( !queue.isEmpty() ) {
                TreeNode node = queue.poll();
                if(toDeleteSet.contains( node.val )) {
                    res.remove( node );
                    if(node.left != null)
                        res.add( node.left );
                    if(node.right != null)
                        res.add( node.right );
                }
                if(node.left != null) {
                    queue.add( node.left );
                    if(toDeleteSet.contains( node.left.val ))
                        node.left = null;
                }
                if(node.right != null) {
                    queue.add( node.right );
                    if(toDeleteSet.contains( node.right.val ))
                        node.right = null;
                }
            }
            return res;
        }
    }
}

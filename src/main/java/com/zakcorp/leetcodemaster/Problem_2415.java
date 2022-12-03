package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import java.util.*;

public class Problem_2415
{
    static class Solver {
        public TreeNode solve1(TreeNode root) {
            LinkedList<TreeNode> ll = new LinkedList<>();
            ll.add( root );
            int level = 0;
            while ( !ll.isEmpty() ) {
                int size = ll.size();
                if(level % 2 != 0) {
                    int low = 0, high = size - 1;
                    while(low < high) {
                        TreeNode lowN = ll.get( low );
                        TreeNode highN = ll.get( high );
                        int temp = lowN.val;
                        lowN.val = highN.val;
                        highN.val = temp;
                        low++;
                        high--;
                    }
                }
                for(int i = 1; i <= size; i++) {
                    TreeNode curr = ll.pollFirst();
                    if(curr.left != null) {
                        ll.addLast( curr.left );
                    }
                    if(curr.right != null) {
                        ll.addLast( curr.right );
                    }
                }
                level++;
            }
            return root;
        }
    }
    static class Solver1 {
        public TreeNode solve1(TreeNode root) {
            postorder(root, 0);
            return root;
        }
        public TreeNode postorder(TreeNode root, int level) {
            if(root == null)
                return null;
            TreeNode left = postorder( root.left, level++ );
            TreeNode right = postorder( root.right, level++ );
            if(level % 2 != 0) {
                if(left != null && right != null) {
                    int temp = root.left.val;
                    root.left.val = root.right.val;
                    root.right.val = temp;
                }
            }
            return root;
        }
    }
}

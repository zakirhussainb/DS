package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Problem_951
{
    static class Solver {
        public boolean solve1(TreeNode root1, TreeNode root2) {
            if(root1 == null && root2 == null)
                return true;
            Map<Integer, Set<Integer>> map = new HashMap<>();
            constructMap(map, root1);
            final AtomicBoolean f = new AtomicBoolean(true);
            traverse( map, root2, f );
            if(f.get() && (root2 == null || root1 == null))
                return false;
            return f.get();
        }

        private TreeNode traverse(Map<Integer, Set<Integer>> map, TreeNode root, AtomicBoolean f) {
            if(root == null)
                return null;
            if(root.left == null && root.right == null) {
                if(map.containsKey( root.val )) {
                    if(!map.get( root.val ).isEmpty()) {
                        f.set( false );
                    }
                } else {
                    f.set( false );
                }
                return root;
            }
            TreeNode left = traverse( map, root.left, f );
            TreeNode right = traverse( map, root.right, f );
            if(left != null) {
                if(map.containsKey( root.val )) {
                    if(!map.get( root.val ).contains( left.val )) {
                        f.set( false );
                    }
                } else {
                    f.set( false );
                }
            }

            if(right != null) {
                if(map.containsKey( root.val )) {
                    if(!map.get( root.val ).contains( right.val )) {
                        f.set( false );
                    }
                } else {
                    f.set( false );
                }
            }
            if(f.get()) {
                int size = map.get(root.val).size();
                if(size == 2 && (left == null || right == null)) {
                    f.set( false );
                }
            }
            return root;
        }
        private TreeNode constructMap( Map<Integer, Set<Integer>> map, TreeNode root ) {
            if(root == null)
                return null;
            if(root.left == null && root.right == null) {
                map.put(root.val, new HashSet<>());
                return root;
            }
            TreeNode left = constructMap( map, root.left );
            TreeNode right = constructMap( map, root.right );
            if(!map.containsKey( root.val )) {
                map.put(root.val, new HashSet<>());
            }
            if(left != null) {
                map.get( root.val ).add( left.val );
            }
            if(right != null) {
                map.get( root.val ).add( right.val );
            }
            return root;
        }
    }

    /*
    Simple and Elegant Approach:
    1. If either of the root is null, then check whether they are equal.
        -> Since if both the roots are null, then we need to return true.
        -> If either of them are true, then we need to return false.
    2. Check whether root1.val is equal to root2.val and then solve for two major cases:
        -> When root1.left and root2.left are equal AND root1.right and root2.right are equal.
                OR
        -> When root1.left and root2.right are equal AND root1.right and root2.left are equal.
     */
    static class Solver1 {
        public boolean solve1(TreeNode root1, TreeNode root2) {
            if(root1 == null || root2 == null)
                return root1 == root2;
            return root1.val == root2.val && ( solve1( root1.left, root2.left ) && solve1( root1.right, root2.right )
                || solve1( root1.left, root2.right ) && solve1( root1.right, root2.left ) );
        }
    }
}

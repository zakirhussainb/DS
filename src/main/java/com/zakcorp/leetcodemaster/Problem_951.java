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
}

package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import java.util.*;

public class Problem_1609
{
    static class Solver {
        public boolean solve1( TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add( root );
            int level = 0;
            while ( !queue.isEmpty() ) {
                int size = queue.size();
                LinkedList<Integer> ll = new LinkedList<>();
                for(int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();
                    if(level % 2 == 0) {
                        if(curr.val % 2 == 0) {
                            return false;
                        }
                        if(!ll.isEmpty() && curr.val <= ll.getLast()) {
                            return false;
                        }
                    } else {
                        if(curr.val % 2 != 0) {
                            return false;
                        }
                        if(!ll.isEmpty() && curr.val >= ll.getLast()) {
                            return false;
                        }
                    }
                    if(curr.left != null)
                        queue.add( curr.left );
                    if(curr.right != null)
                        queue.add( curr.right );
                    ll.addLast( curr.val );
                }
                level++;
            }
            return true;
        }
        public boolean solve2( TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add( root );
            int level = 0;
            while ( !queue.isEmpty() ) {
                int size = queue.size();
                int prevVal = queue.peek().val;
                for(int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();
                    if(level % 2 == 0) {
                        // This will fail for first value in the queue, so checking i >= 1
                        if( curr.val % 2 == 0 || (i >= 1 && curr.val <= prevVal) ) {
                            return false;
                        }
                    } else {
                        if(curr.val % 2 != 0 || (i >= 1 && curr.val >= prevVal)) {
                            return false;
                        }
                    }
                    if(curr.left != null)
                        queue.add( curr.left );
                    if(curr.right != null)
                        queue.add( curr.right );
                    prevVal = curr.val;
                }
                level++;
            }
            return true;
        }
    }
}

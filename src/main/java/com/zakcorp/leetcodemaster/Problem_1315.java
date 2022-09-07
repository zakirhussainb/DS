package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Problem_1315
{
    static class Solver {
        static class Ancestor {
            TreeNode parent;
            TreeNode grandParent;
            public Ancestor( TreeNode parent, TreeNode grandParent )
            {
                this.parent = parent;
                this.grandParent = grandParent;
            }
        }
        public int solve1( TreeNode root) {
            if(root == null)
                return 0;
            Map<TreeNode, Ancestor> map = new HashMap<>();
            map.put( root, new Ancestor( null, null ) );
            preorder(root, map, root);
            int sum = 0;
            for(Map.Entry<TreeNode, Ancestor> entry : map.entrySet()) {
                if(entry.getValue().grandParent != null && entry.getValue().grandParent.val % 2 == 0) {
                    sum += entry.getKey().val;
                }
            }
            return sum;
        }
        private void preorder(TreeNode root, Map<TreeNode, Ancestor> map, TreeNode parent) {
            if(root == null)
                return;
            if(!map.containsKey( root )) {
                map.put( root, new Ancestor( parent, map.get( parent ).parent ) );
            }
            preorder( root.left, map, root );
            preorder( root.right, map, root );
        }
    }
}

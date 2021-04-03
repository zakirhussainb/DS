package com.zakcorp.final450.binarytree;


import com.zakcorp.trees.binarytree.BinaryTree;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class P_185 {
    /* Check if a Binary Tree contains duplicate subtrees of size 2 or more [ IMP ]
       This is a O(N^2) solution */
    static class Solver {
        public boolean solve1(BinaryTree.Node root) {
            AtomicBoolean atomicBoolean = new AtomicBoolean( false );
            process(root, new HashMap<>(), atomicBoolean);
            return atomicBoolean.get();
        }
        private String process(BinaryTree.Node root, Map<String, Integer> map, AtomicBoolean atomicBoolean) {
            if(root == null)
                return "#";
            String left = process(root.left, map, atomicBoolean);
            String right = process(root.right, map, atomicBoolean);
            String serialKey = root.data + "," + left + "," + right;
            map.put( serialKey, map.getOrDefault(serialKey, 0) + 1 );
            if(map.get( serialKey ) == 2)
                atomicBoolean.set( true );
            return serialKey;
        }
    }
}

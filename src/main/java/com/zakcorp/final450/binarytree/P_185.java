package com.zakcorp.final450.binarytree;


import com.zakcorp.trees.binarytree.BinaryTree;

import java.util.*;
import java.util.concurrent.atomic.*;

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

    /* Check if a Binary Tree contains duplicate subtrees of size 2 or more [ IMP ]
       This is a O(N) solution */
    static class Solver1 {
        public boolean solve1(BinaryTree.Node root) {
            Map<String, Integer> serialToId = new HashMap<>();
            Map<Integer, Integer> idToCount = new HashMap<>();
            AtomicBoolean result = new AtomicBoolean();
            AtomicInteger currId  = new AtomicInteger( 1 );
            process(root, serialToId, idToCount, currId, result);
            return result.get();
        }
        private int process(BinaryTree.Node root, Map<String, Integer> serialToId, Map<Integer, Integer> idToCount,
                            AtomicInteger currId, AtomicBoolean result) {
            if(root == null)
                return 0;
            int leftId = process(root.left, serialToId, idToCount, currId, result);
            int rightId = process(root.right, serialToId, idToCount, currId, result);
            String currSerialKey = leftId + "," + root.data + "," + rightId;
            int serialId = serialToId.getOrDefault( currSerialKey,  currId.get() );
            if(serialId == currId.get())
                currId.getAndIncrement();
            serialToId.put(currSerialKey, serialId);
            idToCount.put(serialId, idToCount.getOrDefault(serialId, 0) + 1);
            if(idToCount.get(serialId) == 2)
                result.set( true );
            return serialId;
        }
    }
}

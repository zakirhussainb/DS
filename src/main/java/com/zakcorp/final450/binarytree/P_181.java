package com.zakcorp.final450.binarytree;


import com.zakcorp.trees.binarytree.BinaryTree;

import java.util.*;
import java.util.concurrent.atomic.*;

public class P_181 {
    static class Solver {
        public BinaryTree.Node solve1(int[] inorder, int[] preOrder) {
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < inorder.length; i++) {
                map.put(inorder[i], i);
            }
            AtomicInteger pIndex = new AtomicInteger(0);
            return construct(0, inorder.length - 1, preOrder, pIndex, map);
        }
        private BinaryTree.Node construct(int start, int end, int[] preOrder, AtomicInteger pIndex,
                                          Map<Integer, Integer> map) {
            if(start > end)
                return null;
            BinaryTree.Node root = new BinaryTree.Node( preOrder[ pIndex.getAndIncrement() ] );
            int index = map.get( root.data );
            root.left = construct(start, index - 1, preOrder, pIndex, map);
            root.right = construct(index + 1, end, preOrder, pIndex, map);
            return root;
        }
    }
}

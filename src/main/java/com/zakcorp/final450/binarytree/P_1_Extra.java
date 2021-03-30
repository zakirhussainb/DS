package com.zakcorp.final450.binarytree;


import com.zakcorp.trees.binarytree.BinaryTree;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class P_1_Extra {
    static class Solver {
        public BinaryTree.Node solve1(int[] inorder, int[] postOrder) {
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < inorder.length; i++) {
                map.put(inorder[i], i);
            }
            AtomicInteger pIndex = new AtomicInteger(inorder.length - 1);
            return construct(0, inorder.length - 1, postOrder, pIndex, map);
        }
        private BinaryTree.Node construct(int start, int end, int[] postOrder, AtomicInteger pIndex,
                                          Map<Integer, Integer> map) {
            if(start > end)
                return null;
            BinaryTree.Node root = new BinaryTree.Node( postOrder[ pIndex.getAndDecrement() ] );
            int index = map.get( root.data );
            root.right = construct(index + 1, end, postOrder, pIndex, map);
            root.left = construct(start, index - 1, postOrder, pIndex, map);
            return root;
        }
    }
}

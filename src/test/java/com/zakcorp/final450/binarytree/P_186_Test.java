package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;
import com.zakcorp.trees.narytree.N_AryTree;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertTrue;

public class P_186_Test {
    P_186.Solver p = new P_186.Solver();
    @Test
    public void test1() {
        N_AryTree nt = new N_AryTree();
        Map<Integer, List<Integer>> inputMap = new LinkedHashMap<>();
        inputMap.put(10, Arrays.asList(2, 34, 56, 100));
        inputMap.put(34, Collections.singletonList(1));
        inputMap.put(100, Arrays.asList(7, 8, 9));
        N_AryTree.Node root = nt.buildNAryTree(inputMap);
        nt.levelOrderTraversal( root );
    }
}

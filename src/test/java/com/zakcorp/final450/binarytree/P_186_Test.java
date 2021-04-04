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
        N_AryTree.Node t1 = new N_AryTree.Node(1, new ArrayList<>());
        t1.children.add(new N_AryTree.Node(2, new ArrayList<>()));
        t1.children.add(new N_AryTree.Node(3, new ArrayList<>()));
        t1.children.add(new N_AryTree.Node(4, new ArrayList<>()));
//        nt.levelOrderTraversal(t1);


        N_AryTree.Node t2 = new N_AryTree.Node(1, new ArrayList<>());
        t2.children.add(new N_AryTree.Node(4, new ArrayList<>()));
        t2.children.add(new N_AryTree.Node(3, new ArrayList<>()));
        t2.children.add(new N_AryTree.Node(2, new ArrayList<>()));
//        nt.levelOrderTraversal(t2);
        assertTrue( p.solve1( t1, t2 ) );
    }

    /*@Test
    public void test2() {
        N_AryTree nt = new N_AryTree();
        N_AryTree.Node root = new N_AryTree.Node(1, new ArrayList<>());
        root.children.add(new N_AryTree.Node(2, new ArrayList<>()));
        root.children.add(new N_AryTree.Node(3, new ArrayList<>()));
        root.children.add(new N_AryTree.Node(4, new ArrayList<>()));
        root.children.get(0).children.add(new N_AryTree.Node(5));
        root.children.get(0).children.add(new N_AryTree.Node(6));
        root.children.get(0).children.add(new N_AryTree.Node(7));
        root.children.get(1).children.add(new N_AryTree.Node(8));
        root.children.get(2).children.add(new N_AryTree.Node(9));
        root.children.get(2).children.add(new N_AryTree.Node(10));
        root.children.get(2).children.add(new N_AryTree.Node(11));
        nt.levelOrderTraversal(root);
        assertTrue( p.solve1( root ) );
    }*/
}

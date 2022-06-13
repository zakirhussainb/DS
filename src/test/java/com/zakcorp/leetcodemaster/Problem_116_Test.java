package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.Node;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_116_Test {
    Problem_116.Solver pro = new Problem_116.Solver();
    @Test
    public void test1() {
        Node p = new Node(1);
        p.left =  new Node(2);
        p.right =  new Node(3);
        p.left.left = new Node(4);
        p.left.right = new Node(5);
        p.right.left =  new Node(6);
        p.right.right =  new Node(7);
        pro.solve1(p);
    }
}

package com.zakcorp.techiedelight.binarytree;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem_1 {
    /*
    Problem:- Check if two binary trees are identical or not
    Description:- They must identical structure and their contents are also same.
    Procedure:-
        1. The idea is to traverse both trees and compare value at their root node.
        2. If the value matches, we recursively check if left subtree of first tree is identical to left subtree of second tree and right subtree of first tree is identical to right subtree of second tree.
        3. If the value at their root node differs, the trees violates data property.
        4. If at any point in the recursion, the first tree is empty & second tree is non-empty or second tree is empty
        & first tree is non-empty, the trees violates structural property and they cannot be identical.
     */
    public static void main(String[] args) {
        Problem_1 p = new Problem_1();
        Solver.Recursive recursive = new Solver.Recursive();
        Solver.Iterative iterative = new Solver.Iterative();
        Solver.Node x = p.dataGeneration();
        Solver.Node y = p.dataGeneration();
        if (recursive.isIdentical(x, y)) {
            System.out.println("Given binary Trees are identical....");
        } else {
            System.out.println("Given binary Trees are not identical....");
        }
        if(iterative.isIdentical(x, y)) {
            System.out.println("Given binary Trees are identical....");
        } else {
            System.out.println("Given binary Trees are not identical....");
        }
    }

    public Solver.Node dataGeneration() {
        Solver.Node root = new Solver.Node(15);
        root.left = new Solver.Node(10);
        root.right = new Solver.Node(20);
        root.left.left = new Solver.Node(8);
        root.left.right = new Solver.Node(12);
        root.right.left = new Solver.Node(16);
        root.right.right = new Solver.Node(25);
        return root;
    }

    static class Solver {
        static class Node {
            Node left;
            int data;
            Node right;

            public Node(int data) {
                this.data = data;
            }
        }
        static class Recursive {
            public boolean isIdentical(Node x, Node y) {
                // Both the trees are empty
                if(x == null && y == null){
                    return true;
                }
                return (x != null && y != null) && (x.data == y.data)
                        && isIdentical(x.left, y.left)
                        && isIdentical(x.right, y.right);
            }
        }
        static class Iterative {
            static class Pair<U, V>{
                public final U first;
                public final V second;
                private Pair(U first, V second){
                    this.first = first;
                    this.second = second;
                }
                public static <U, V> Pair <U, V> of(U a, V b){
                    return new Pair<>(a, b);
                }
            }
            public boolean isIdentical(Node x, Node y){
                if(x == null && y == null){
                    return true;
                }
                if(x == null){
                    return false;
                }
                if(y == null){
                    return false;
                }
                Deque<Pair<Node, Node>> deque = new ArrayDeque<>();
                deque.add(Pair.of(x, y));
                while(!deque.isEmpty()){
                    x = deque.peek().first;
                    y = deque.peek().second;
                    deque.poll();
                    if(x.data != y.data){
                        return false;
                    }
                    if(x.left != null && y.left != null){
                        deque.add(Pair.of(x.left, y.left));
                    } else if(x.left != null || y.left != null){
                        return false;
                    }
                    if(x.right != null && y.right != null){
                        deque.add(Pair.of(x.right, y.right));
                    } else if(x.right != null || y.right != null){
                        return false;
                    }
                }
                return true;
            }
        }
    }
}



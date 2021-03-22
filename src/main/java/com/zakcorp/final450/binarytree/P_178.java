package com.zakcorp.final450.binarytree;


import com.zakcorp.trees.binarytree.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P_178 {
    static class Solver {
        /* Construct Binary Tree from String with Bracket Representation

         */
        public BinaryTree.Node solve1(String str) {
            if(str.length() == 0)
                return null;
            int firstParen = str.indexOf("(");
            int val = firstParen == -1 ? Integer.parseInt(str) : Integer.parseInt( str.substring( 0, firstParen ) );
            BinaryTree.Node curr = new BinaryTree.Node( val );
            if(firstParen == -1)
                return curr;
            int start = firstParen, leftParenCount = 0;
            for(int i = start; i < str.length(); i++) {
                if(str.charAt(i) == '(')
                    leftParenCount++;
                else if(str.charAt(i) == ')')
                    leftParenCount--;
                if(leftParenCount == 0 && start == firstParen) {
                    curr.left = solve1( str.substring(start + 1, i) );
                    start = i + 1;
                } else if(leftParenCount == 0) {
                    curr.right = solve1( str.substring(start + 1, i) );
                }
            }
            return curr;
        }

        public BinaryTree.Node solve2(String str) {
            Stack<BinaryTree.Node> stack = new Stack<>();
            for(int i = 0, j = i; i < str.length(); i++, j = i) {
                char ch = str.charAt(i);
                if(ch == ')') {
                    stack.pop();
                } else if(Character.isDigit(ch) || ch == '-') {
                    while( i + 1 < str.length() && Character.isDigit( str.charAt( i + 1 ) ) )
                        i++;
                    BinaryTree.Node curr = new BinaryTree.Node( Integer.parseInt( str.substring( j, i + 1 ) ) );
                    if( !stack.isEmpty() ) {
                        BinaryTree.Node parent = stack.peek();
                        if(parent.left != null)
                            parent.right = curr;
                        else
                            parent.left = curr;
                    }
                    stack.push(curr);
                }
            }
            return stack.isEmpty() ? null : stack.peek();
        }
    }
}

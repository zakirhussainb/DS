package com.zakcorp.techiedelight.binarytree;

public class Problem_16 {
    /*
    Problem:- Determine if given two nodes are cousins of each other.
    Description:- Two nodes are cousins in a BT, only if they are at same level but different parents.
    TODO:- Procedure:-
        1. Create a structure to maintain the current Node's information.
        2. Perform Inorder traversal of the BT.
        3. While traversing update the level and parent information if the current node matches with the given cousins.
        4. Finally, check for the condition that [ Levels must be same && Belong to different parents ]
     */
    public static void main(String[] args) {
        BinaryTreeImpl btImpl = new BinaryTreeImpl();
        BinaryTreeImpl.Node root = btImpl.dataGeneration();
        Problem_16.Solver solver = new Problem_16.Solver();
        int cousin_1 = 3;
        int cousin_2 = 6;
        if (solver.isCousin(root, cousin_1, cousin_2)) {
            System.out.println("They are cousins....");
        } else {
            System.out.println("They are not cousins....");
        }
    }

    static class Solver {
        static class NodeInfo {
            BinaryTreeImpl.Node parent;
            int child;
            int level;

            public NodeInfo(BinaryTreeImpl.Node parent, int child, int level) {
                this.parent = parent;
                this.child = child;
                this.level = level;
            }
        }

        public boolean isCousin(BinaryTreeImpl.Node root, int cousin_1, int cousin_2) {
            if (root == null) {
                return false;
            }
            int level = 1;
            BinaryTreeImpl.Node parent = null;
            NodeInfo x = new NodeInfo(parent, cousin_1, level);
            NodeInfo y = new NodeInfo(parent, cousin_2, level);
            inorder(root, parent, level, x, y);
            return x.level == y.level && x.parent != y.parent;
        }

        public void inorder(BinaryTreeImpl.Node root, BinaryTreeImpl.Node parent, int level, NodeInfo x, NodeInfo y) {
            if (root == null) return;
            inorder(root.left, root, level + 1, x, y);
            if (root.data == x.child) {
                x.level = level;
                x.parent = parent;
            }
            if (root.data == y.child) {
                y.level = level;
                y.parent = parent;
            }
            inorder(root.right, root, level + 1, x, y);
        }
    }
}

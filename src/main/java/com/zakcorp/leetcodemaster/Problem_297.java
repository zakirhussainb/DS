package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

public class Problem_297 {
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helperToSerialize(root, sb);
        return sb.toString().trim();
    }

    private void helperToSerialize(TreeNode root, StringBuilder sb) {
        if(root == null) {
            sb.append("# ");
        } else {
            sb.append(root.val).append(" ");
            helperToSerialize(root.left, sb);
            helperToSerialize(root.right, sb);
        }
    }

    public TreeNode deserialize(String data) {
        String[] splitArr = data.split("\\s+");
        return helperToDeserialize(splitArr, new int[]{0});
    }

    private TreeNode helperToDeserialize(String[] splitArr, int[] index) {
        if(splitArr[index[0]].equals("#")) {
            index[0]++;
            return null;
        } else {
            TreeNode root = new TreeNode( Integer.parseInt(splitArr[index[0]]) );
            index[0]++;
            root.left = helperToDeserialize(splitArr, index);
            root.right = helperToDeserialize(splitArr, index);
            return root;
        }
    }

}

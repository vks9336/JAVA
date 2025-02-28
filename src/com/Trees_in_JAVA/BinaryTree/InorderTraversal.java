package com.Trees_in_JAVA.BinaryTree;

import java.util.List;

public class InorderTraversal {
    public static List<Integer> inorder(TreeNode treeNode, List<Integer> list){
        if(treeNode == null) return list;
        inorder(treeNode.left, list);
        list.add(treeNode.data);
        inorder(treeNode.right, list);
        return list;
    }
}

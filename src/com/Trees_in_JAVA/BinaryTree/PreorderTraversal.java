package com.Trees_in_JAVA.BinaryTree;

import java.util.List;

public class PreorderTraversal {
    public static List<Integer> preorder(TreeNode treeNode, List<Integer> list){
        if(treeNode == null) return list;
        list.add(treeNode.data);
        preorder(treeNode.left, list);
        preorder(treeNode.right, list);
        return list;
    }
}

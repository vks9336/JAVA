package com.Trees_in_JAVA.BinaryTree;

import java.util.List;

public class PostorderTraversal {
    public static List<Integer> postorder(TreeNode treeNode, List<Integer> list){
        if(treeNode == null) return list;
        postorder(treeNode.left, list);
        postorder(treeNode.right, list);
        list.add(treeNode.data);
        return list;
    }
}

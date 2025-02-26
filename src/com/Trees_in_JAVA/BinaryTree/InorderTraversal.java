package com.Trees_in_JAVA.BinaryTree;

import java.util.List;

public class InorderTraversal {
    public static List<Integer> inorder(Node node, List<Integer> list){
        if(node == null) return list;
        inorder(node.left, list);
        list.add(node.data);
        inorder(node.right, list);
        return list;
    }
}

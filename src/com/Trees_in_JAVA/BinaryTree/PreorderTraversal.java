package com.Trees_in_JAVA.BinaryTree;

import java.util.List;

public class PreorderTraversal {
    public static List<Integer> preorder(Node node, List<Integer> list){
        if(node == null) return list;
        list.add(node.data);
        preorder(node.left, list);
        preorder(node.right, list);
        return list;
    }
}

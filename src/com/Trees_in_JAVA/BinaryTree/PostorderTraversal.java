package com.Trees_in_JAVA.BinaryTree;

import java.util.List;

public class PostorderTraversal {
    public static List<Integer> postorder(Node node, List<Integer> list){
        if(node == null) return list;
        postorder(node.left, list);
        postorder(node.right, list);
        list.add(node.data);
        return list;
    }
}

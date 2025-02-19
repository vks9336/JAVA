package com.Trees_in_JAVA.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    public static void main(String[] args) {
        Node root = new Node(12);
        root.left = new Node(23);
        root.right = new Node(6);
        root.left.left = new Node(4);
        root.left.right = new Node(8);
        root.right.left = new Node(67);
        root.right.right = new Node(56);


        //Inorder Traversal of the Tree
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = InorderTraversal.inorder(root, list);
        System.out.println("Inorder Traversal of the Tree : ");
        System.out.println(list2);
        System.out.println();


        list.clear();
        list2.clear();


        // Postorder Traversal of the Tree
        list2 = PostorderTraversal.postorder(root, list);
        System.out.println("Postorder Traversal of the Tree : ");
        System.out.println(list2);
        System.out.println();

        list.clear();
        list2.clear();


        // Preorder Traversal the Tree
        list2 = PreorderTraversal.preorder(root, list);
        System.out.println("Preorder Traversal of the Tree : ");
        System.out.println(list2);
        System.out.println();

    }
}

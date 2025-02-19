package com.Trees_in_JAVA.BinaryTree.BinarySearchTree.RedBlackTree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RedBlackTree t = new RedBlackTree();
        int[] arr = {1, 4, 6, 3, 5, 7, 8, 2, 9};
        for(int i = 0; i < 9; i++)
        {
            t.insert(arr[i]);
            System.out.println();
            t.inorderTraversal();
        }
        t.printTree();
    }
}

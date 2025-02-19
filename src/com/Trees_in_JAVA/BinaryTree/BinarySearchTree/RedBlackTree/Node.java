package com.Trees_in_JAVA.BinaryTree.BinarySearchTree.RedBlackTree;

public class Node {
    int data;
    Node left;
    Node right;
    char colour;
    Node parent;

    Node(int data){
        this.data = data;
        this.colour = 'R';
        this.left = null;
        this.right = null;
        this.parent = null;
    }
}

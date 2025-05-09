package com.Trees_in_JAVA.BinaryTree;
// creation of a tree
public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;
    public int hd = Integer.MAX_VALUE;

    public TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public TreeNode(int data, TreeNode right, TreeNode left){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

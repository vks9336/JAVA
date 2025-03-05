package com.Trees_in_JAVA.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public TreeNode root;

    public void insert(int data){
        TreeNode node = new TreeNode(data);
        if(root == null){
            root = node;
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if (temp.left == null) {
                temp.left = new TreeNode(data);
                return;
            } else {
                queue.add(temp.left);
            }
            if(temp.right == null){
                temp.right = new TreeNode(data);
                return;
            }
            else queue.add(temp.right);
        }
    }

    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        System.out.printf("%d ", root.data);
        inorder(root.right);
    }

    public void preorder(TreeNode root){
        if(root == null) return;
        System.out.printf("%d ", root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(TreeNode root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.printf("%d ", root.data);
    }

    public void levelOrder(TreeNode root){
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode temp = queue.poll();
                System.out.printf("%d ", temp.data);

                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }
        }
    }
}

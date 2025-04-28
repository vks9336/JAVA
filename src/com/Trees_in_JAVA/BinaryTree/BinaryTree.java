package com.Trees_in_JAVA.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    public TreeNode root;

    public void randomInsert(int[] arr) {
        if (arr.length == 0) return;

        root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < arr.length) {
            TreeNode parent = queue.poll();

            if (arr[i] != 0) {
                assert parent != null;
                parent.left = new TreeNode(arr[i]);
                queue.offer(parent.left);
            }
            i++;

            if (i < arr.length && arr[i] != 0) {
                assert parent != null;
                parent.right = new TreeNode(arr[i]);
                queue.offer(parent.right);
            }
            i++;
        }
    }

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
                assert temp != null;
                System.out.printf("%d ", temp.data);

                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }
        }
    }

    private void preorder(TreeNode root, List<Integer> list){
        if(root == null) return;

        list.add(root.data);
        preorder(root.left, list);
        preorder(root.right, list);

    }

    public void flatten(TreeNode root){
        if(root == null) return;

        List<Integer> list = new ArrayList<>();
        preorder(root, list);

        TreeNode dummyNode = new TreeNode(-1);
        TreeNode temp = dummyNode;

        for(int num : list){
            temp.right = new TreeNode(num);
            temp = temp.right;
        }

        root = dummyNode.right;
    }

    //lowest common ancestor method to find the lca of given nodes
    public TreeNode lca(TreeNode root, TreeNode p, TreeNode q){
        if(root == null || root == p || root == q) return root;

        TreeNode left = lca(root.left, p, q);
        TreeNode right = lca(root.right, p, q);

        if(left == null) return right;
        else if(right == null) return left;
        else return root;
    }

    //find method to find the nodes of a binary tree
    public TreeNode find(TreeNode root, int val) {
        if (root == null) return null;
        if (root.data == val) return root;

        TreeNode left = find(root.left, val);
        if (left != null) return left;
        return find(root.right, val);
    }

}

package com.Trees_in_JAVA.BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BurningTree {


    //find method to find the nodes of a binary tree
    public static TreeNode find(TreeNode root, int val) {
        if (root == null) return null;
        if (root.data == val) return root;

        TreeNode left = find(root.left, val);
        if (left != null) return left;
        return find(root.right, val);
    }


    //mapping of parent method
    private static void makeParent(TreeNode root, Map<TreeNode, TreeNode> parent) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current.left != null) {
                queue.offer(current.left);
                parent.put(current.left, current);
            }
            if (current.right != null) {
                queue.offer(current.right);
                parent.put(current.right, current);
            }
        }
    }


    //time calculation method
    private static int minTime(TreeNode root, int target) {
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        makeParent(root, parent);
        Map<TreeNode, Boolean> visited = new HashMap<>();
        TreeNode targetValue = find(root, target);
        visited.put(targetValue, true);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(targetValue);
        int time = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean flag = false;
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                assert current != null;
                if (current.left != null && visited.get(current.left) == null) {
                    queue.offer(current.left);
                    visited.put(current.left, true);
                    flag = true;
                }
                if (current.right != null && visited.get(current.right) == null) {
                    queue.offer(current.right);
                    visited.put(current.right, true);
                    flag = true;
                }
                if (parent.get(current) != null && visited.get(parent.get(current)) == null) {
                    queue.offer(parent.get(current));
                    visited.put(parent.get(current), true);
                    flag = true;
                }
            }
            if (flag) time++;
        }
        return time;
    }


    //main method
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] arr = new int[]{1, 2, 3, 4, 5, 0, 6, 0, 0, 7, 8, 0, 9, 0, 0, 0, 0, 0, 10};
        tree.randomInsert(arr);
        int minTime = minTime(tree.root, 8);
        System.out.printf("Minimum time to burn the tree is %d.", minTime);
    }
}

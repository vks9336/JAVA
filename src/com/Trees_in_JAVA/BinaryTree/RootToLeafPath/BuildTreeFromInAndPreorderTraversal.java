package com.Trees_in_JAVA.BinaryTree.RootToLeafPath;

import com.Trees_in_JAVA.BinaryTree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class BuildTreeFromInAndPreorderTraversal {
    public static TreeNode buildTree(int[] preorder, int preStart, int preEnd,
    int[] inorder, int inStart, int inEnd, Map<Integer, Integer> map){
        if(preStart > preEnd || inStart > inEnd) return  null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int inRoot = map.get(root.data);
        int numLeft = inRoot - inStart;
        root.left = buildTree(preorder, preStart + 1, preStart + numLeft, inorder, inStart, inRoot - 1, map);
        root.right = buildTree(preorder, preStart + numLeft + 1, preEnd, inorder, inRoot + 1, inEnd, map);
        return root;
    }

    public static TreeNode buildTree(int[] inorder, int[] preorder){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};
        TreeNode root = buildTree(inorder, preorder);
        System.out.printf("%d %d %d", root.data, root.left.data, root.right.data);
    }
}

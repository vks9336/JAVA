package com.Trees_in_JAVA.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoundaryTraversal {
    //check for leaf node method
    private static boolean isLeaf(TreeNode root){

        return (root.left == null && root.right == null);

    }

    //Add left boundary
    private static void addLeft(TreeNode root, List<Integer> list){

        TreeNode curr = root.left;

        while(curr != null){
            if(!isLeaf(curr)) list.add(curr.data);
            curr = (curr.left != null) ? curr.left : curr.right;
        }

    }

    private static void addLeaf(TreeNode root, List<Integer> list){

        if(isLeaf(root)){
            list.add(root.data);
            return;
        }

        if(root.left != null) addLeaf(root.left, list);
        if(root.right != null) addLeaf(root.right, list);
    }

    //Add right boundary
    private static void addRight(TreeNode root, List<Integer> list){

        TreeNode curr = root.right;

        List<Integer> temp = new ArrayList<>();

        while(curr != null){
            if(!isLeaf(curr)) temp.add(curr.data);
            curr = (curr.right != null) ? curr.right : curr.left;
        }

        for(int  i = temp.size() - 1; i >= 0; i--){
            list.add(temp.get(i));
        }
    }

    //boundary traversal method
    public static List<Integer> boundaryTraversal(TreeNode root){

        List<Integer> list = new ArrayList<>();

        if(root == null) return list;

        if(isLeaf(root)){
            list.add(root.data);
            return list;
        }

        list.add(root.data);

        addLeft(root, list);
        addLeaf(root, list);
        addRight(root, list);

        return list;
    }


    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        for(int i = 0; i < 10; i++){
            tree.insert(sc.nextInt());
        }

        List<Integer> boundary = boundaryTraversal(tree.root);

        for (Integer integer : boundary) {
            System.out.printf("%d ", integer);
        }
    }
}

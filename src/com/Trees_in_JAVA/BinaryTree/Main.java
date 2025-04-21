package com.Trees_in_JAVA.BinaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of nodes in the binary tree : ");
        int n = sc.nextInt();
        while(n > 0){
            System.out.print("Enter the data that you want to insert : ");
            int data = sc.nextInt();
            tree.insert(data);
            n--;
        }
        System.out.println("Inorder Traversal : ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.println("Preorder Traversal : ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.println("Postorder Traversal : ");
        tree.postorder(tree.root);
        System.out.println();

        System.out.println("Level Order Traversal : ");
        tree.levelOrder(tree.root);

        System.out.println("Tree before flatten : ");
        tree.preorder(tree.root);
        System.out.println();
        tree.flatten(tree.root);
        System.out.println("Tree after flatten : ");
        tree.preorder(tree.root);
        System.out.println();

        TreeNode p = tree.find(tree.root, 7);
        TreeNode q = tree.find(tree.root, 6);

        TreeNode lca = tree.lca(tree.root, p, q);
        System.out.printf("Lowest Common Ancestor : %d", lca.data);
        System.out.println();
    }
}

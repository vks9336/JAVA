package com.Trees_in_JAVA.BinaryTree.RootToLeafPath;

import com.Trees_in_JAVA.BinaryTree.BinaryTree;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] arr = new int[]{1,2,3,4,5};
        tree.randomInsert(arr);
        RootToLeafPath rootToLeafPath = new RootToLeafPath();
        List<List<Integer>> list = rootToLeafPath.rootToLeafPath(tree.root);
        System.out.print("[");
        for (List<Integer> integers : list) {
            System.out.print("[");
            for (Integer integer : integers) {
                System.out.printf("%d -> ", integer);
            }
            System.out.print("null ]");
        }
        System.out.println("]");
    }
}

package com.Trees_in_JAVA.BinaryTree;

import java.util.*;

public class TopView {

    //top view method
    public static List<Integer> topView(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<AbstractMap.SimpleEntry<TreeNode, Integer>> q = new LinkedList<>();
        q.add(new AbstractMap.SimpleEntry<>(root, 0));

        while (!q.isEmpty()) {
            AbstractMap.SimpleEntry<TreeNode, Integer> it = q.remove();
            int hd = it.getValue();
            TreeNode temp = it.getKey();

            if (!map.containsKey(hd)) {
                map.put(hd, temp.data);
            }

            if (temp.left != null) {
                q.add(new AbstractMap.SimpleEntry<>(temp.left, hd - 1));
            }
            if (temp.right != null) {
                q.add(new AbstractMap.SimpleEntry<>(temp.right, hd + 1));
            }
        }

        for(int key : map.keySet()){
            list.add(map.get(key));
        }

        return list;
    }


    //main method
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] arr = new int[]{7,4,8,9,3,2,6,1};
        tree.randomInsert(arr);
        List<Integer> list = topView(tree.root);
        for(int num : list){
            System.out.printf("%d ", num);
        }
    }

}

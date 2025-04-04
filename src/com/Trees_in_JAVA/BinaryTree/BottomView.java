package com.Trees_in_JAVA.BinaryTree;

import java.util.*;

public class BottomView {

    //Bottom view method
    public static List<Integer> bottomView(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        root.hd = 0;
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            int hd = temp.hd;
            map.put(hd, temp.data);

            if(temp.left != null){
                temp.left.hd = hd - 1;
                queue.add(temp.left);
            }

            if(temp.right != null){
                temp.right.hd = hd + 1;
                queue.add(temp.right);
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
        int[] arr = new int[]{1,2};
        tree.randomInsert(arr);
        List<Integer> list = bottomView(tree.root);
        for(int num : list){
            System.out.printf("%d ",num);
        }
    }

}

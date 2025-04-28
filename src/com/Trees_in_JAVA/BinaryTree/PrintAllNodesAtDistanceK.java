package com.Trees_in_JAVA.BinaryTree;
import java.util.*;

public class PrintAllNodesAtDistanceK {
    private static void makeParent(TreeNode root, Map<TreeNode, TreeNode> parent){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            if(current.left != null){
                parent.put(current.left, current);
                queue.offer(current.left);
            }
            if(current.right != null){
                parent.put(current.right, current);
                queue.offer(current.right);
            }
        }
    }

    private static List<Integer> distanceK(TreeNode root, TreeNode target, int k){
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        makeParent(root, parent);
        Map<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(target);
        visited.put(target, true);
        int currDistance = 0;

        while(!queue.isEmpty()){
            int size = queue.size();
            if(currDistance == k) break;
            currDistance++;
            for(int i = 0; i < size; i++){
                TreeNode current = queue.poll();
                if(current.left != null && visited.get(current.left) == null){
                    queue.offer(current.left);
                    visited.put(current.left, true);

                }
                if(current.right != null && visited.get(current.right) == null){
                    queue.offer(current.right);
                    visited.put(current.right, true);

                }
                if(parent.get(current) != null && visited.get(parent.get(current)) == null){
                    queue.offer(parent.get(current));
                    visited.put(parent.get(current), true);

                }
            }
        }

        List<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            list.add(current.data);
        }

        return list;
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] arr = new int[]{3, 5, 1, 6, 2, 9, 8, 0, 0, 7, 4};
        tree.randomInsert(arr);
        TreeNode node = tree.find(tree.root, 5);
        List<Integer> list = distanceK(tree.root, node, 2);
        for (int key : list) {
            System.out.printf("%d ", key);
        }
        System.out.println();
        tree.preorder(tree.root);
    }
}

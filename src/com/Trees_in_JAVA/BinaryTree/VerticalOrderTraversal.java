package com.Trees_in_JAVA.BinaryTree;

import java.util.*;

public class VerticalOrderTraversal {
    //vertical order traversal in a tree
    public static List<List<Integer>> verticalTraversal(TreeNode root){
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(root, 0, 0));

        while (!q.isEmpty()) {
            Tuple tuple = q.poll();
            TreeNode node = tuple.node;
            int x = tuple.row;
            int y = tuple.col;

            map.putIfAbsent(x, new TreeMap<>());
            map.get(x).putIfAbsent(y, new PriorityQueue<>());
            map.get(x).get(y).offer(node.data);

            if (node.left != null) {
                q.offer(new Tuple(node.left, x - 1, y + 1));
            }
            if (node.right != null) {
                q.offer(new Tuple(node.right, x + 1, y + 1));
            }
        }

        List<List<Integer>> list = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
            list.add(new ArrayList<>());
            for (PriorityQueue<Integer> nodes : ys.values()) {
                while (!nodes.isEmpty()) {
                    list.getLast().add(nodes.poll());
                }
            }
        }
        return list;
    }


    //main method
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] arr = {3,9,20,0,0,15,7};
        tree.randomInsert(arr);
        List<List<Integer>> ans = verticalTraversal(tree.root);
        System.out.print("[");
        for(int i = 0; i < ans.size(); i++){
            System.out.print("[");
            for(int j = 0; j < ans.getFirst().size(); j++){
                System.out.printf("%d", ans.get(i).get(j));
            }
            System.out.print("]");
        }
        System.out.println("]");
    }
}

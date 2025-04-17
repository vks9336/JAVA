package com.Trees_in_JAVA.BinaryTree.RootToLeafPath;

import com.Trees_in_JAVA.BinaryTree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class RootToLeafPath {
    public void getPath(TreeNode root, List<List<Integer>> list, List<Integer> temp){
        if(root == null) return;

        temp.add(root.data);

        if(root.left == null && root.right == null){
            list.add(new ArrayList<>(temp));
        }
        else{
            getPath(root.left, list, temp);
            getPath(root.right, list, temp);
        }

        temp.removeLast();
    }

    public List<List<Integer>> rootToLeafPath(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();

        if(root == null) return list;

        getPath(root, list, new ArrayList<>());

        return list;
    }
}

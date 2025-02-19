package com.Trees_in_JAVA.HuffmanCoding;

public class HuffmanCoding {
    public static void printCode(HuffmanNode root, String str){
        if(root.leftChild == null && root.rightChild == null && Character.isLetter(root.ch)){
            System.out.println(root.ch + " : " + str);
            return;
        }
        assert root.leftChild != null;
        printCode(root.leftChild, str + "0");
        printCode(root.rightChild, str + "1");
    }
}
